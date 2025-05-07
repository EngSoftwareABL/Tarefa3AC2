package br.com.valueprojects.dominio;

public enum TiposJogadores {
	MESTRE(new BonusPrata()), 
	LUTADOR(new BonusBronze()), 
	DESAFIADOR(new BonusBronze());

	private Bonificacao geraBonus;

	TiposJogadores(Bonificacao geraBonus) {
		this.geraBonus = geraBonus;
	}

	public Bonificacao getGeraBonus() {
		return geraBonus;
	}
}