package br.com.valueprojects.infra;

import br.com.valueprojects.dominio.EstimativaJava;

public class EmissorDeSms implements Notificador { // A classe implementa a interface Notificador, permitindo o uso de polimorfismo (LSP) e inversão de dependência (DIP).
    @Override // Garante que estamos sobrescrevendo corretamente o método da interface.
    public void notificar(EstimativaJava estJava) {
        System.out.println("Enviando SMS para: " + estJava.getResponsavel());
    }
}

//sumarizando: criação de novas classes (consequentemente arquivos -> todos tirando esse em infra) para melhor implementação