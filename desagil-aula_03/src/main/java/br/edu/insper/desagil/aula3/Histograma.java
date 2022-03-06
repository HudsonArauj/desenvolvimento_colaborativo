package br.edu.insper.desagil.aula3;

import java.util.ArrayList;
import java.util.List;

public class Histograma {

	public List<Integer> calcula(List<Integer> numeros) {
		List<Integer> h = new ArrayList<>();
		
			for(int i =0;i < 10;i++) {
				h.add(0);
			}
			for( int n :numeros) {
				h.set(n, h.get(n)+1);
			}
		

		return h;
	}

}
