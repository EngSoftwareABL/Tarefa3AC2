package br.com.valueprojects;

public class GeradorCustoDiarioFuncionario {

	private CalculoAbatimento calculoAbatimento;
	private CalculoTransporte calculoTransporte;
	
	public GeradorCustoDiarioFuncionario(CalculoAbatimento calculoAbatimento, CalculoTransporte calculoTransporte){
		this.calculoAbatimento = calculoAbatimento;
		this.calculoTransporte = calculoTransporte;
	}

	public double gera(Funcionario funcionario) {

		double refeicao = calculoAbatimento.abatimentoDo(funcionario
				.getValorCusto());
		double transporte = calculoTransporte.para(funcionario.getLocal());

		return funcionario.getValorCusto() * (1 - refeicao) + transporte;
	}

}
