package servlets;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import modelInfo.ModelInfoFactory;
import modelInfo.NLAttribute;
import modelInfo.NLClass;
import modelInfo.NLModel;
import modelInfo.NLReference;
import net.didion.jwnl.data.POS;
import synonyms.WordNet;
import xatkitgen.ModelInfoToXatkit;

/**
 * Servlet implementation class ProcesaFichero
 */
@WebServlet("/ProcesaFichero")
@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 5 * 5)
public class ProcesaFichero extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String UPLOAD_DIRECTORY = "Metamodel";
	private static final String FILE_EXTENSION = ".ecore";
	private static final String DEFAULT_FILE_NAME = "Example";
	public static final String SELECTED = "selectedName";
	public static final String PAGE = "content_page";
	public static final Object CLASS_PAGE = "ClassForm.jsp";
	public static final Object ATTR_PAGE = "AttributeForm.jsp";
	public static final Object REF_PAGE = "ReferenceForm.jsp";
	private static ResourceSet resourceSet = null;
	

	//Change!!!!! Test example
	private static final String MAPPING_FILE ="H:\\mapping.text";
	private static final String OUT ="H:\\running.intent";
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProcesaFichero() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uploadPath = getServletContext().getRealPath("") + File.separator + UPLOAD_DIRECTORY;
		File uploadDir = new File(uploadPath);
		if (!uploadDir.exists())
			uploadDir.mkdir();

		if (request.getParts().size() > 1 || request.getParts().size() < 0) {
			response.getWriter().append("Send one and only one file. Served at: ").append(request.getContextPath());
		}
		String fileName;
		String filepath = "";
		for (Part part : request.getParts()) {
			fileName = getFileName(part);
			filepath = uploadPath + File.separator + fileName;
			part.write(filepath);
		}

		File f = new File(filepath);
		if (!f.exists()) {
			response.getWriter().append("Internal Error. Served at: ").append(request.getContextPath());
		}
		NLModel model = readFile(request.getServletContext(), f);
		/*HttpSession session = request.getSession(true);
		session.setAttribute(MODEL, model);
		session.setAttribute(SELECTED, model.getClasses().get(0).getName());
		session.setAttribute(PAGE, CLASS_PAGE);
		RequestDispatcher jsp;
        jsp = getServletContext().getRequestDispatcher("/Configurator.jsp");
        jsp.forward(request, response);*/
		ModelInfoToXatkit generator = new ModelInfoToXatkit(model, OUT, MAPPING_FILE);
		System.out.println(generator.genereteEntities());
	}

	private String getFileName(Part part) {
		for (String content : part.getHeader("content-disposition").split(";")) {
			if (content.trim().startsWith("filename")) {
				String path = content.substring(content.indexOf("=") + 2, content.length() - 1);
				Path uri = new File(path).toPath();
				String filename = uri.getFileName().toString();
				if (!filename.endsWith(FILE_EXTENSION)) {
					filename = filename + FILE_EXTENSION;
				}
				return filename;
			}
		}
		return DEFAULT_FILE_NAME + FILE_EXTENSION;
	}

	private NLModel readFile(ServletContext context, File file) {
		
		/*Abrir el fichero y leer el modelo, falta control de errores*/
		System.out.println(file.getPath());
		String path = file.getPath().substring(file.getPath().indexOf(":")+1);
		URI uri = URI.createURI(path);
		
		
		Resource resource = getResourceSet().getResource(uri, true);

 		EObject object = resource.getContents().get(0);
		
		/*Validate the model, responder con errores*/
		/*Diagnostic diagnostic = Diagnostician.INSTANCE.validate(object);

		List<Diagnostic> diagnosticChild = diagnostic.getChildren();
		
		if (diagnosticChild.isEmpty()) {
			if (diagnostic.getSeverity() == Diagnostic.ERROR) {
				return null;
			}
		} else {
			for (Diagnostic d : diagnosticChild) {
				if (d.getSeverity() == Diagnostic.ERROR) {
					return null;
				}
			}
		}*/

		
		/*Crear el modelo de información por defecto */
		if (!(object instanceof EPackage)) {
			return null;
		}
		EPackage pack = (EPackage) object;
		NLModel model = ModelInfoFactory.eINSTANCE.createNLModel();
		model.setModel(pack);
		model.setName(file.getName().replace(FILE_EXTENSION, ""));
		
		for (EClassifier classifier :  pack.getEClassifiers()) {
			if (classifier instanceof EClass) {
				EClass eclass = (EClass) classifier;
				NLClass nlclass = createNLClass(context, model, eclass, false);
				for (EReference reference: eclass.getEAllReferences()) {
					NLReference nlReference = createNLReference(context, model, reference);
					nlclass.getFeatures().add(nlReference);
				}
				NLAttribute identifier = null;
				for(EAttribute attribute: eclass.getEAllAttributes()) {
					NLAttribute nlAttribute = createNLAttribute(context, model, attribute);
					nlclass.getFeatures().add(nlAttribute);
					
					if (attribute.getName().equalsIgnoreCase("id") || attribute.getName().equalsIgnoreCase("identifier")) {
						identifier = nlAttribute;
					}else if (attribute.getName().equalsIgnoreCase("name")) {
						if (identifier == null) {
							identifier = nlAttribute;
						}else if (!(identifier.getName().equalsIgnoreCase("id") || identifier.getName().equalsIgnoreCase("identifier"))){
							identifier = nlAttribute;
						}
					}
				}
				if (identifier == null) {
					if (!nlclass.getAttribuites().isEmpty())
						nlclass.getId().add(nlclass.getAttribuites().get(0));
				}else {
					nlclass.getId().add(identifier);
				}
				
			}
		}
		return model;
	}
	
	private NLClass createNLClass(ServletContext context, NLModel model, EClass eclass, boolean withContainer) {
		NLClass nlClass = ModelInfoFactory.eINSTANCE.createNLClass();
		nlClass.setClass(eclass);
		nlClass.setName(eclass.getName());

		int index;
		if ((index = myContains(model, nlClass))!= -1) {
			nlClass = model.getClasses().get(index);
		}else {
			model.getClasses().add(nlClass);
			nlClass.getSynonyms().addAll(getSynonyms(context, nlClass.getName(), POS.NOUN));
		}
		
		return nlClass;
	}
	
	private int myContains(NLModel model, NLClass nlClass) {
		for (int i = 0; i<model.getClasses().size(); i++) {
			NLClass current = model.getClasses().get(i);
			if (current.equals(nlClass)) {
				return i;
			}
		}
		return -1;
		
	}
	
	private NLReference createNLReference(ServletContext context, NLModel model, EReference ereference) {
		
		NLReference nlReference = ModelInfoFactory.eINSTANCE.createNLReference();
		nlReference.setReference(ereference);
		nlReference.setName(ereference.getName());
		if (ereference.isContainment()) {
			EClass eclass = ereference.getEReferenceType();
			createNLClass(context, model, eclass, true);
		}
		nlReference.getSynonyms().addAll(getSynonyms(context, nlReference.getName(), POS.NOUN));
		nlReference.getVerb().addAll(getSynonyms(context, nlReference.getName(), POS.VERB));
		return nlReference;
	}
	
private NLAttribute createNLAttribute(ServletContext context, NLModel model, EAttribute eattribute) {
		
	    NLAttribute nlAttribute = ModelInfoFactory.eINSTANCE.createNLAttribute();
		nlAttribute.setAttribute(eattribute);
		nlAttribute.setName(eattribute.getName());
		nlAttribute.getSynonyms().addAll(getSynonyms(context, nlAttribute.getName()));
		return nlAttribute;
	}

	public static ResourceSet getResourceSet() {
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
			// Especificamos la extension del fichero (para todos los ficheros),
			// y indicamos que
			// es un XMI.
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		}
		return resourceSet;
	}
	
	private List<String> getSynonyms (ServletContext context, String word){
		try {
			return WordNet.getWordNet(context).getSynonyms(word);
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	
	private List<String> getSynonyms (ServletContext context, String word, POS type){
		try {
			return WordNet.getWordNet(context).getSynonymsByType(word, type);
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}

}
