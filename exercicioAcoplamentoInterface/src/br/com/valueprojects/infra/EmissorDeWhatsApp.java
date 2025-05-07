package br.com.valueprojects.infra;

import br.com.valueprojects.dominio.EstimativaJava;

public class EmissorDeWhatsApp implements Notificador {
    @Override
    public void notificar(EstimativaJava estJava) {
        System.out.println("Enviando WhatsApp para: " + estJava.getResponsavel());
    }
}
