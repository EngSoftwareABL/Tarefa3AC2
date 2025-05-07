package br.com.valueprojects.dominio;

public class BonusBronze implements GeradorBonusJogo {// A classe implementa a interface GeradorBonusJogo, o que permite seu uso polimórfico e flexível.

	@Override // Indica claramente que estamos implementando um método da interface.
    public double geraPontos(Jogador jogador){
        if (jogador.getPontuacao() > 10000.0) {
			return jogador.getPontuacao() * 0.8;
		} else {
			return jogador.getPontuacao() * 0.9;
		}
    }
}
