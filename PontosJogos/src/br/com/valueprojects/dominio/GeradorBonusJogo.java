package br.com.valueprojects.dominio;

public class GeradorBonusJogo {
	public double geraPontos(Jogador jogador) {
		return jogador.calculaBonus();
	}
}