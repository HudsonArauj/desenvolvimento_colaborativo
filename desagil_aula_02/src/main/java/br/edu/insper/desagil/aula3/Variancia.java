package br.edu.insper.desagil.aula3;

import java.util.List;

public class Variancia {

	public double calcula(List<Integer> numeros) {
		double mu = 0;
		for (int i = 0; i < numeros.size();i++) {
			mu += numeros.get(i);
			
			
		}
		mu =  mu/ numeros.size();
		double x = 0;
		for(int i = 0;i < numeros.size();i++) {
			x += ((mu - numeros.get(i))*(mu - numeros.get(i)));
			
		}
		x = x / numeros.size();
		
		return x;
	}

}
