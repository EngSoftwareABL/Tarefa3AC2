package br.com.valueprojects.dominio;

public interface BonusOuro { // Interface define um contrato para o cálculo de bônus, aplicando o Princípio da Segregação de Interfaces (I).
	
    @Override // Indica que estamos sobrescrevendo o método da interface CalculadoraBonus.
	public double calculaBonus(Jogador jogador) {
		if (jogador.getPontuacao() > 5000.0) {
			return jogador.getPontuacao() * 0.5; // Regra específica para jogadores com pontuação alta.
		} else {
			return jogador.getPontuacao() * 0.6; // Regra específica para pontuação menor – lógica fixa embutida na classe.
		}
	}
}
