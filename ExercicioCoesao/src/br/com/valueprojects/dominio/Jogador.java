package br.com.valueprojects.dominio;

public class Jogador {
	private int id;
	private String nome;
	private TiposJogadores tiposJogadores;
	private double pontuacao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TiposJogadores getTiposJogadores() {
		return tiposJogadores;
	}
	public void setFasesJogo(TiposJogadores tiposJogadores) {
		this.tiposJogadores = tiposJogadores;
	}
	public double getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(double pontuacao) {
		this.pontuacao = pontuacao;
	}

}
