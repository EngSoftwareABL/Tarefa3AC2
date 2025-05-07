package br.com.valueprojects.dominio;

public class BonusPrata implements Bonificacao {

	@Override
	public double calculaBonus(Jogador jogador) {
		if (jogador.getPontuacao() > 7000.0) {
			return jogador.getPontuacao() * 0.75;
		} else {
			return jogador.getPontuacao() * 0.85;
		}
	}

}
