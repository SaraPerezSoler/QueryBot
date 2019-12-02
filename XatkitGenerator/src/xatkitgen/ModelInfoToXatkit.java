package xatkitgen;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Utils.Utils;
import Xatkit.Entity;
import Xatkit.Entry;
import Xatkit.Mapping;
import Xatkit.XatkitBot;
import Xatkit.XatkitFactory;
import Xatkit.impl.XatkitBotImpl;
import modelInfo.NLAttribute;
import modelInfo.impl.NLAttributeImpl;
import modelInfo.NLClass;
import modelInfo.NLElement;
import modelInfo.NLFeature;
import modelInfo.NLModel;
import modelInfo.NLReference;

/**
 * @author Sara Pérez Soler
 *
 */
public class ModelInfoToXatkit {

	
	
	private Map<String, Mapping> mappings = new HashMap<String, Mapping>();

	private NLModel model;
	private XatkitBot queryBot = null;

	public ModelInfoToXatkit(NLModel model) {
		this.model = model;
	}
	/**
	 * Generate a XatkitBot (queryBot) from a NLModel
	 * @param nlReference
	 */
	public XatkitBot apply() {
		
		if (queryBot != null) {
			return queryBot;
		}
		
		//Get a copy of the default queryBot
		queryBot = XatkitBotImpl.getQueryBotInstance();

		//Fill the class mapping
		for (NLClass nlClass : model.getClasses()) {
			getMapping(Utils.CLASS).getEntries().add(nlElementToEntry(nlClass));
			
			//for each feature generate de mapping entry and add to the corresponding mapping
			for (NLFeature feature : nlClass.getFeatures()) {
				if (feature instanceof NLAttribute) {
					processNLAttribute((NLAttribute)feature);
				}else {
					processNLReference((NLReference)feature);
				}
			}
		}
		
		//remove empty mappings
		queryBot.removeEmptyEnities();

		//return de new Xatkit model
		return queryBot;
	}
	
	/**
	 * Process the NLReference a generate the appropriate elements to queryBot
	 * @param nlReference
	 */
	private void processNLReference(NLReference nlReference) {
		if (nlReference.getType() == null) {
			return;
		}
		//Nouns mapping corresponding to the Type
		Mapping mapping = getMapping(nlReference.getType().getRefernceMappingName());
		// Verb mapping corresponding to the Type
		Mapping mappingV = getMapping(nlReference.getType().getRefernceVMappingName());
		
		
		if (mapping != null) {
			//Generate a noun mapping entry and save it if the mapping doesn´t contain it
			Entry entry = nlElementToEntry(nlReference);
			if (!contains(mapping.getEntries(), entry)) {
				mapping.getEntries().add(entry);
			}
		}
		if (mappingV != null) {
			//Generate a verb mapping entry and save it if the mapping doesn´t contain it
			if (!nlReference.getVerb().isEmpty()) {
				Entry entry = XatkitFactory.eINSTANCE.createEntry();
				entry.setValue(nlReference.getName());
				entry.getSynonyms().addAll(nlReference.getVerb());
				if (!contains(mappingV.getEntries(), entry)) {
					mappingV.getEntries().add(entry);
				}
			}
		}
	}

	/**
	 * Process the NLAttribute a generate the appropriate elements to queryBot
	 * @param nlAttribute
	 */
	private void processNLAttribute(NLAttribute nlAttribute) {
		
		if (nlAttribute.getType() == null) {
			return;
		}
		
		//Attribute mapping corresponding to the type
		Mapping mapping = getMapping(nlAttribute.getType().getAttibuteMappingName());
		
		if (mapping != null) {
			//Generate a attribute mapping entry and save it if the mapping doesn´t contain it
			Entry entry = nlElementToEntry(nlAttribute);
			if (!contains(mapping.getEntries(), entry)) {
				mapping.getEntries().add(entry);
			}
		}
		
	}
	
	private boolean contains (List<Entry> entries, Entry entry) {
		for (Entry e: entries) {
			if (e.equals(entry)) {
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * Transform a NLElement into a Entry
	 * @param nlElement the element to transform
	 * @return a entry generated of a NLElement
	 */
	private Entry nlElementToEntry(NLElement nlElement) {
		//create a new entry
		Entry newEntry = XatkitFactory.eINSTANCE.createEntry();
		//NlElement.name -> Entry.value
		newEntry.setValue(nlElement.getName());
		//NlElement.synonyms -> Entry.synonyms
		newEntry.getSynonyms().addAll(nlElement.getSynonyms());
		return newEntry;
		
	}
	
	
	/**
	 * Return the mapping of queryBot with this name
	 * @param name the name of the mapping
	 * @return the mapping with this name
	 */
	private Mapping getMapping(String name) {
		if (queryBot == null){
			return null;
		}
		Mapping mapping = mappings.get(name);
		if (mapping == null) {
			Entity entity = queryBot.getEntity(name);
			if (!(entity instanceof Mapping)) {
				return null;
			}
			mapping = (Mapping)entity;
			mappings.put(name, mapping);
		}
		return mapping;
	}
}
