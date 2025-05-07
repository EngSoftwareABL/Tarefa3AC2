package br.com.valueprojects;

public class TaxaTransporteSorocaba {
	public double para(String local){
		if("CENTRO".equals(local.toUpperCase())){
		return 10;
		}
		return 20;
	}

}
