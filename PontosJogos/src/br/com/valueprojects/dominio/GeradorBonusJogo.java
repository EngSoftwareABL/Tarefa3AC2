package br.com.valueprojects.dominio;
import static br.com.valueprojects.dominio.TiposJogadores.DESAFIADOR;
import static br.com.valueprojects.dominio.TiposJogadores.LUTADOR;
import static br.com.valueprojects.dominio.TiposJogadores.MESTRE;

	public class GeradorBonusJogo {
		
		public double geraPontos(Jogador jogador) {
		    if(MESTRE.equals(jogador.getTiposJogadores())){
		      return bonusPrata(jogador);
		}
		if (LUTADOR.equals(jogador.getTiposJogadores()) || (DESAFIADOR.equals(jogador.getTiposJogadores()))){
			return bonusBronze(jogador);
		}

			throw new RuntimeException("Jogador inv�lido");
		}

		private double bonusBronze(Jogador pontuacao) {
			if (pontuacao.getPontuacao() > 10000.0) {
				return pontuacao.getPontuacao() * 0.8;
			} else {
				return pontuacao.getPontuacao() * 0.9;
			}
		}

		private double bonusPrata(Jogador pontuacao){
		 if (pontuacao.getPontuacao()> 7000.0){
		      return pontuacao.getPontuacao()* 0.75;
		}
		else{
		return pontuacao.getPontuacao()* 0.85;
	        }
		}

		private double bonusOuro(Jogador pontuacao){
			if (pontuacao.getPontuacao()> 5000.0){
				 return pontuacao.getPontuacao()* 0.5;
		   }
		   else{
		   return pontuacao.getPontuacao()* 0.6;
			   }
		   }
}