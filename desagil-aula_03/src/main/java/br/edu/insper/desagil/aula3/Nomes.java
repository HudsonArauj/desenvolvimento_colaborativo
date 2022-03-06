package br.edu.insper.desagil.aula3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Nomes {

	public Map<String, List<String>> inverte(Map<String, List<String>> d) {
		Map<String, List<String>> nomes = new HashMap<>();
		
			for(String k : d.keySet()) {
				
				List<String> sobrenomes = d.get(k);
				
				for( String sobrenome : sobrenomes){
					
					List<String> l;
					
					if(!nomes.containsKey(sobrenome)) {
						
						l = new ArrayList<>();
						
						nomes.put(sobrenome,l);
					}
					l= nomes.get(sobrenome);
					
					l.add(k);
					
				}
				
			}
			
	
		return nomes;
	}

}
