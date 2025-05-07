package br.com.valueprojects.dominio;

public class BonusBronze implements Bonificacao {

	@Override
	public double calculaBonus(Jogador jogador) {
		if (jogador.getPontuacao() > 10000.0) {
			return jogador.getPontuacao() * 0.8;
		} else {
			return jogador.getPontuacao() * 0.9;
		}
	}

}
