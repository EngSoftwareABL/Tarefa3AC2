package br.com.valueprojects;

public class TaxaTransporteSorocaba implements CalculoTransporte {

	@Override
	public double para(String local) {
		if ("CENTRO".equals(local.toUpperCase())) {
			return 10;
		}
		return 20;
	}

}
