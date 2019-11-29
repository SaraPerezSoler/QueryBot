package xatkitgen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelInfo.NLAttribute;
import modelInfo.NLClass;
import modelInfo.NLElement;
import modelInfo.NLFeature;
import modelInfo.NLModel;
import modelInfo.NLReference;
import modelInfo.impl.NLAttributeImpl.Types;

public class ModelInfoToXatkitCopy {

	private NLModel model;

	public static final String MAPPING = "mapping";
	public static final String COMPOSITE = "composite";
	public static final String INTENT = "intent";

	private static final String CLASSES = "Class";
	private static final String STRING_ATTRIBUTE = "StringAttribute";
	private static final String NUMERIC_ATTRIBUTE = "NumericalAttribute";
	private static final String BOOLEAN_ATTRIBUTE = "BooleanAttribute";
	private static final String DATE_ATTRIBURE = "DateAttribute";

	private static final String STRING_REFERENCE = "StringReference";
	private static final String NUMERIC_REFERENCE = "NumericalReference";
	private static final String BOOLEAN_REFERENCE = "BooleanReference";
	private static final String DATE_REFERENCE = "DateReference";

	private static final String STRING_REFERENCE_VERB = "StringReferenceVerb";
	private static final String NUMERIC_REFERENCE_VERB = "NumericalReferenceVerb";
	private static final String BOOLEAN_REFERENCE_VERB = "BooleanReferenceVerb";
	private static final String DATE_REFERENCE_VERB = "DateReferenceVerb";

	private static final String ATTRIBUTE = "Attribute";
	private Map<String, String> attrPast = new HashMap<String, String>();
	private Map<String, String> refPast = new HashMap<String, String>();

	private String classMapping = starts(MAPPING, CLASSES);

	private String stringAttMapping = "";
	private String numericAttMapping = "";
	private String booleanAttMapping = "";
	private String dateAttMapping = "";

	private String stringRefMapping = "";
	private String numericRefMapping = "";
	private String booleanRefMapping = "";
	private String dateRefMapping = "";

	private String stringRefMappingVerb = "";
	private String numericRefMappingVerb = "";
	private String booleanRefMappingVerb = "";
	private String dateRefMappingVerb = "";

	private String staticMappingFile;

	private String outFile;
	private String xatkitGeneration = null;

	public ModelInfoToXatkitCopy(NLModel model, String out, String staticMapping) {
		this.outFile = out;
		this.model = model;
		this.staticMappingFile = staticMapping;
	}

	public String regenerateEntities() {
		xatkitGeneration = null;
		return genereteEntities();
	}

	public String genereteEntities() {
		if (xatkitGeneration == null) {
			for (NLClass clas : model.getClasses()) {
				classMapping += mappingSentence(clas);
				for (NLFeature feature : clas.getFeatures()) {
					if (feature instanceof NLAttribute) {
						generateAttributeEntities((NLAttribute) feature);
					} else {
						generateReferenceEntities((NLReference) feature);
					}
				}

			}

			classMapping += ends();

			stringAttMapping += ends();
			stringRefMapping += ends();
			stringRefMappingVerb += ends();

			numericAttMapping += ends();
			numericRefMapping += ends();
			numericRefMappingVerb += ends();

			booleanAttMapping += ends();
			booleanRefMapping += ends();
			booleanRefMappingVerb += ends();

			dateAttMapping += ends();
			dateRefMapping += ends();
			dateRefMappingVerb += ends();

			xatkitGeneration = classMapping + "\n" + "\n" + stringAttMapping + "\n" + numericAttMapping + "\n"
					+ booleanAttMapping + "\n" + dateAttMapping + "\n" + stringRefMapping + "\n" + stringRefMappingVerb
					+ "\n" + numericRefMapping + "\n" + numericRefMappingVerb + "\n" + booleanRefMapping + "\n"
					+ booleanRefMappingVerb + "\n" + dateRefMapping + "\n" + dateRefMappingVerb + "\n"
					+ readFile(staticMappingFile);
		}

		try {
			FileWriter fileWriter = new FileWriter(outFile);
			fileWriter.write(xatkitGeneration);
			fileWriter.close();
		} catch (IOException e) {

		}
		return xatkitGeneration;

	}

	private void generateAttributeEntities(NLAttribute attribute) {
		String typePast = attrPast.get(attribute.getName());
		if (!attribute.getType().equals(typePast)) {
			if (attribute.isType(Types.STRING)) {
				stringAttMapping += mappingSentence(attribute);
			} else if (attribute.isType(Types.INT) || attribute.isType(Types.FLOAT)) {
				numericAttMapping += mappingSentence(attribute);
			} else if (attribute.isType(Types.BOOLEAN)) {
				booleanAttMapping += mappingSentence(attribute);
			} else if (attribute.isType(Types.DATE)) {
				dateAttMapping += mappingSentence(attribute);
			} else {
				System.out.println(attribute.getType());
			}
			attrPast.put(attribute.getName(), attribute.getType());
		}
	}

	private void generateReferenceEntities(NLReference reference) {
		String typePast = refPast.get(reference.getName());
		if (!reference.getType().equals(typePast)) {
			if (reference.isType(Types.STRING)) {
				stringRefMapping += mappingSentence(reference);
				stringRefMappingVerb += mappingSentence(reference.getName(), reference.getVerb());
			} else if (reference.isType(Types.INT) || reference.isType(Types.FLOAT)) {
				numericAttMapping += mappingSentence(reference);
				numericRefMappingVerb += mappingSentence(reference.getName(), reference.getVerb());
			} else if (reference.isType(Types.BOOLEAN)) {
				booleanRefMapping += mappingSentence(reference);
				booleanRefMappingVerb += mappingSentence(reference.getName(), reference.getVerb());
			} else if (reference.isType(Types.DATE)) {
				dateRefMapping += mappingSentence(reference);
				dateRefMappingVerb += mappingSentence(reference.getName(), reference.getVerb());
			} else {
				System.out.println(reference.getType());
			}
			refPast.put(reference.getName(), reference.getType());
		}
	}

	private String mappingSentence(NLElement element) {
		return mappingSentence(element.getName(), element.getSynonyms());
	}

	private String mappingSentence(String name, List<String> synonyms) {
		return "value \"" + name +"\""+ getMappingSynonyms(synonyms) + "\n";
	}

	private String starts(String type, String name) {
		return type + " " + name + " {\n";

	}

	private String ends() {
		return "\n}\n";
	}

	private String readFile(String path) {
		File file = new File(path);
		String ret = "";
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			String st;

			while ((st = br.readLine()) != null) {
				ret += st + "\n";
			}

		} catch (IOException e) {

		}
		return ret;

	}

	private String getMappingSynonyms(List<String> synonyms) {
		if (synonyms.isEmpty()) {
			return "";
		}
		String ret = " synonyms: ";
		for (String sym : synonyms) {
			ret += "\"" + sym + "\" ";
		}
		return ret;
	}
}
