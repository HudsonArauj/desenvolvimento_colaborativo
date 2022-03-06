package br.edu.insper.desagil.aula3;

import java.util.List;
import java.util.Map;

public class Media {

	public double calcula(List<Map<String, Integer>> notas) {
		int den =0;
		int num=0;
		
		for(Map<String,Integer>nota : notas) {
			
			den += nota.get("peso")*nota.get("valor");
			
			num += nota.get("peso");
			
		}
		double media = den/num;
		
		
		
		return media;
	}

}
