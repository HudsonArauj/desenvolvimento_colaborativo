package br.edu.insper.desagil.aula3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tabulacao {

	public Map<String, Double> monta(List<Map<String, String>> alunos) {
		Map<String, Double> totais = new HashMap<>();

		for(Map<String,String> d : alunos) {
			String curso = d.get("curso");
			if(!totais.containsKey(curso)) {
				
				totais.put(curso,0.0);
				
			}
		
			totais.put(curso,totais.get(curso)+1);
			
			
			
		}
		for (String k : totais.keySet()) {
			totais.put(k,(totais.get(k)/ alunos.size())*100);
			
			
			
			
		}
		return totais;
	}

}
