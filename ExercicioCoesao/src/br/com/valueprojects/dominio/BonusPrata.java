package br.com.valueprojects.dominio;

public class BonusPrata implements GeradorBonusJogo {// A classe BonusPrata implementa a interface GeradorBonusJogo, o que segue o princípio da Inversão de Dependência (DIP).

	@Override // Boa prática: deixa claro que estamos implementando um método definido pela interface.
    public double geraPontos(Jogador jogador){// Método obrigatório da interface
        if (jogador.getPontuacao() > 7000.0) {
			return jogador.getPontuacao() * 0.75;
		} else {
			return jogador.getPontuacao() * 0.85;
		}
    }
}
