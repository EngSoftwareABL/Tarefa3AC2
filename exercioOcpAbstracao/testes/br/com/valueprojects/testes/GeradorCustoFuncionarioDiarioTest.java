package br.com.valueprojects.testes;

import br.com.valueprojects.AbatimentoRefeicoes;
import br.com.valueprojects.CalculoAbatimento;
import br.com.valueprojects.CalculoTransporte;
import br.com.valueprojects.GeradorCustoDiarioFuncionario;
import br.com.valueprojects.TaxaTransporteSorocaba;

public class GeradorCustoFuncionarioDiarioTest {

	public static void main(String[] args) {
		CalculoAbatimento calculoAbatimento = new AbatimentoRefeicoes();
		CalculoTransporte calculoTransporte = new TaxaTransporteSorocaba();

		GeradorCustoDiarioFuncionario geradorCusto = new GeradorCustoDiarioFuncionario(
				calculoAbatimento, calculoTransporte);

	}

}
