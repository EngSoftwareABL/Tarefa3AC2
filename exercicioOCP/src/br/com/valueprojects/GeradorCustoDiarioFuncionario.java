package br.com.valueprojects;

public class GeradorCustoDiarioFuncionario {

	AbatimentoRefeicoes abatimentoRefeicoes = new AbatimentoRefeicoes();
	TaxaTransporteSorocaba centro = new TaxaTransporteSorocaba();

	public double gera(Funcionario funcionario) {

		double refeicao = abatimentoRefeicoes.abatimentoDo(funcionario
				.getValorCusto());
		double transporte = centro.para(funcionario.getLocal());

		return funcionario.getValorCusto() * (1 - refeicao) + transporte;
	}

}
