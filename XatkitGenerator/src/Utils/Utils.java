package Utils;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import Xatkit.XatkitPackage;
import modelInfo.ModelInfoPackage;

public abstract class Utils {
	
	public static final String CLASS = "Class";
	public static final String STRING_ATTRIBUTE = "StringAttribute";
	public static final String NUMERIC_ATTRIBUTE = "NumericalAttribute";
	public static final String BOOLEAN_ATTRIBUTE = "BooleanAttribute";
	public static final String DATE_ATTRIBUTE = "DateAttribute";

	public static final String STRING_REFERENCE = "StringReference";
	public static final String NUMERIC_REFERENCE = "NumericalReference";
	public static final String BOOLEAN_REFERENCE = "BooleanReference";
	public static final String DATE_REFERENCE = "DateReference";

	public static final String STRING_REFERENCE_VERB = "StringReferenceVerb";
	public static final String NUMERIC_REFERENCE_VERB = "NumericalReferenceVerb";
	public static final String BOOLEAN_REFERENCE_VERB = "BooleanReferenceVerb";
	public static final String DATE_REFERENCE_VERB = "DateReferenceVerb";

	public static final String ATTRIBUTE = "Attribute";
	public static final String REFERENCE = "Reference";
	public static final String CONDITION = "Condition";
	
	
	public static final String [] COMPOSITES = {ATTRIBUTE, REFERENCE, CONDITION};
	

	public static ResourceSet resourceSet = null;
	
	public static ResourceSet getResourceSet() {
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
			// Especificamos la extension del fichero (para todos los ficheros),
			// y indicamos que
			// es un XMI.
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
			resourceSet.getPackageRegistry().put(XatkitPackage.eNAME, XatkitPackage.eINSTANCE);
			resourceSet.getPackageRegistry().put(ModelInfoPackage.eNAME, ModelInfoPackage.eINSTANCE);
		}
		return resourceSet;
	}
	
	public enum Types {
		INT("int", NUMERIC_ATTRIBUTE, NUMERIC_REFERENCE, NUMERIC_REFERENCE_VERB), 
		STRING("java.lang.String", STRING_ATTRIBUTE, STRING_REFERENCE, STRING_REFERENCE_VERB), 
		BOOLEAN("boolean", BOOLEAN_ATTRIBUTE, BOOLEAN_REFERENCE, BOOLEAN_REFERENCE_VERB), 
		DATE("java.util.Date", DATE_ATTRIBUTE, DATE_REFERENCE, DATE_REFERENCE_VERB), 
		FLOAT("float", NUMERIC_ATTRIBUTE, NUMERIC_REFERENCE, NUMERIC_REFERENCE_VERB);
		
		private String name;
		private String attibuteType;
		private String refernceType;
		private String refernceVType;
	
		
		private Types(String name, String attibuteType, String refernceType, String refernceVType) {
			this.name = name;
			this.attibuteType = attibuteType;
			this.refernceType = refernceType;
			this.refernceVType = refernceVType;
		}


		public String getName() {
			return name;
		}


		public String getAttibuteMappingName() {
			return attibuteType;
		}


		public String getRefernceMappingName() {
			return refernceType;
		}


		public String getRefernceVMappingName() {
			return refernceVType;
		}
		
		
	}
}
