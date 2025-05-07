package br.com.valueprojects;

public class AbatimentoRefeicoes implements CalculoAbatimento {

	@Override
	public double abatimentoDo(double valor) {
		if (valor > 100)
			return 0.10;
		if (valor > 300)
			return 0.30;
		return 0;
	}
}
