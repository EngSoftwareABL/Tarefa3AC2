package br.com.valueprojects.dominio;
import static br.com.valueprojects.dominio.TiposJogadores.DESAFIADOR;
import static br.com.valueprojects.dominio.TiposJogadores.LUTADOR;
import static br.com.valueprojects.dominio.TiposJogadores.MESTRE;

	public interface GeradorBonusJogo { //alterado de classe para interface
		
		double geraPontos(Jogador jogador) {}
}
