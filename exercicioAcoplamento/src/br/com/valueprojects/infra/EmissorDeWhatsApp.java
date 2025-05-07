package br.com.valueprojects.infra;

import br.com.valueprojects.dominio.EstimativaJava;

public class EmissorDeWhatsApp implements Notificador { // A classe implementa a interface Notificador, permitindo o uso de polimorfismo (LSP) e inversão de dependência (DIP).
    @Override // Garante que estamos sobrescrevendo corretamente o método da interface.
    public void notificar(EstimativaJava estJava) { 
        System.out.println("Enviando WhatsApp para: " + estJava.getResponsavel());
    }
}
