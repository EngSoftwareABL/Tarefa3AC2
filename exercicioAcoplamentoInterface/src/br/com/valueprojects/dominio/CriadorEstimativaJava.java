package br.com.valueprojects.dominio;

import java.util.List;


public class CriadorEstimativaJava {
	
	
	private List<AcoesDepoisEstimativa> acoes;

	public CriadorEstimativaJava(List<AcoesDepoisEstimativa> acoes) {
		
		this.acoes = acoes;		
	}

	public EstimativaJava cria(Tarefa tarefa) {
		
		double metrica = tarefa.getMetricaTarefa();
		
		EstimativaJava estJava = new EstimativaJava(metrica,
		produtividadeDesenvolvedorJunior(metrica));
		
		for (AcoesDepoisEstimativa acao: acoes)
			acao.executa(tarefa);
		
		return estJava;

	}

	private double produtividadeDesenvolvedorJunior(double metrica) {

		return metrica * 0.04;
	}

}
