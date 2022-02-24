package br.edu.insper.desagil.aula2;

public class Arvore {

	public String constroi(int n) {
		String resposta = "";
		for (int i = 0;i<n; i++) {
			for (int j =0;j<n-i-1;j++) {
				resposta += " ";
				
			}
			for (int j =0;j<i;j++) {
				resposta += "/";
			}
			resposta += "|";
			for (int j =0;j<i;j ++) {
				resposta += "\\";
			}
			resposta += "\n";
		}
		
		return resposta;
		
	}

}
