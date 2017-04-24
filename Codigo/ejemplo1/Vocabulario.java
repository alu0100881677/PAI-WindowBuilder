package ejemplo1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Vocabulario {

	private Hashtable<String, Integer> vocabulario;
	
	public Vocabulario(){
		this.vocabulario = new Hashtable<String, Integer>();
	}
	
	public String analizar(String fichero) throws IOException{
		String cadena;
		final String WITH_DELIMITER = "\\s+|[,.;:¿?¡!{}\\[\\]\\*-\\+_]";
		vocabulario.clear();
				//"(?<=[();{},\\[\\]])|(?=[();{},\\[\\]])|\\s+";
		FileReader file = new FileReader(fichero);
	    BufferedReader buffer = new BufferedReader(file);
	    
	    while((cadena = buffer.readLine())!=null) {	
	    	String[] operando = cadena.split(WITH_DELIMITER);
		    for(String aux: operando){
		    	if(!aux.isEmpty())
			    	if(getVocabulario().containsKey(aux))
			    		getVocabulario().put(aux, getVocabulario().get(aux)+1);
			    	else
			    		getVocabulario().put(aux,1);
		    }
	    }
		buffer.close();
	    return toString();
	}
	
	public String toString(){
		String cadena = "";
		Iterator<Map.Entry<String, Integer>> it = getVocabulario().entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String, Integer> entry = it.next();
			cadena += entry.getKey() + ": " + entry.getValue() + "\n";
		}
		return cadena;
	}

	/**
	 * @return the vocabulario
	 */
	public Hashtable<String, Integer> getVocabulario() {
		return vocabulario;
	}

	/**
	 * @param vocabulario the vocabulario to set
	 */
	public void setVocabulario(Hashtable<String, Integer> vocabulario) {
		this.vocabulario = vocabulario;
	}
}
