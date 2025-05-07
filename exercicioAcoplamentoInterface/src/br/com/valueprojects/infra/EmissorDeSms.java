package br.com.valueprojects.infra;

import br.com.valueprojects.dominio.EstimativaJava;

public class EmissorDeSms implements Notificador {
    @Override
    public void notificar(EstimativaJava estJava) {
        System.out.println("Enviando SMS para: " + estJava.getResponsavel());
    }
}

//sumarizando: criação de novas classes (consequentemente arquivos -> todos tirando esse em infra) para melhor implementação