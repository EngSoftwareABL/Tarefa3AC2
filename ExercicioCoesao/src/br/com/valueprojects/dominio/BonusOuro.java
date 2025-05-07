package br.com.valueprojects.dominio;

public class BonusOuro extends GeradorBonusJogo {
    public geraPontos(Jogador jogador){
        if (jogador.getPontuacao() > 5000.0) {
			return jogador.getPontuacao() * 0.5;
		} else {
			return jogador.getPontuacao() * 0.6;
		}
    }
}
