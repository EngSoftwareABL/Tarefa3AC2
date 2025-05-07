package br.com.valueprojects.dominio;

public class BonusOuro implements GeradorBonusJogo { // A classe implementa a interface GeradorBonusJogo, o que é correto e segue o princípio da Inversão de Dependência (D).
	
	@Override // Indica que este método está sobrescrevendo a assinatura da interface.
    public double geraPontos(Jogador jogador){
        if (jogador.getPontuacao() > 5000.0) {
			return jogador.getPontuacao() * 0.5;// Retorna 50% de bônus.
		} else {
			return jogador.getPontuacao() * 0.6;// Retorna 60% de bônus para pontuação menor.
		}
    }
}
