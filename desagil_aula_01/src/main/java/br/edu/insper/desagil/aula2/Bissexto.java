package br.edu.insper.desagil.aula2;

public class Bissexto {

	public boolean decide(int ano) {
		if (ano % 400 == 0) {
			return true;
		}
		else if (ano % 4 ==0 & ano % 100 !=0) {
			return true;
		}
		return false;
	}

}
