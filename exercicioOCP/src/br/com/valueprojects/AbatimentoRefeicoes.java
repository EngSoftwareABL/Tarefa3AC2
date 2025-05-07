package br.com.valueprojects;

public class AbatimentoRefeicoes {
	
	public double abatimentoDo(double valor){
		if(valor > 10) return 0.10;
	 	if(valor >30) return 0.30;
		return 0;
	      }
}

