package br.com.valueprojects.dominio;
import static br.com.valueprojects.dominio.TiposJogadores.DESAFIADOR;
import static br.com.valueprojects.dominio.TiposJogadores.LUTADOR;
import static br.com.valueprojects.dominio.TiposJogadores.MESTRE;

    // Interface define um contrato para geração de pontos de bônus, promovendo o Princípio da Segregação de Interfaces (I).
	public interface GeradorBonusJogo { // Mudança de classe para interface melhora a flexibilidade (Open/Closed e Dependency Inversion).
		
		double geraPontos(Jogador jogador) {}
}

//clase modificada para interface
