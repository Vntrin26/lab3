package mx.tec.lab;

import java.util.HashMap;
import java.util.Map;

public class DothrakiTranslator {
	Map<String, String> translationMap;
	
	public DothrakiTranslator() {
		translationMap = new HashMap<String,String>();
	}
	public void addTranslation(final String Word, final String Translation) {
		translationMap.put(Word, Translation);
	}
	public String getTranslation(final String word) {
		return translationMap.get(word);
	}

}
