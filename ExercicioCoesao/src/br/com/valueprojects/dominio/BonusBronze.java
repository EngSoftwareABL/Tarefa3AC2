package br.com.valueprojects.dominio;

public class BonusBronze extends GeradorBonusJogo {
    public geraPontos(Jogador jogador){
        if (jogador.getPontuacao() > 10000.0) {
			return jogador.getPontuacao() * 0.8;
		} else {
			return jogador.getPontuacao() * 0.9;
		}
    }
}
