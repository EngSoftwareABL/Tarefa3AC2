package br.com.valueprojects.infra;

import br.com.valueprojects.dominio.AcoesDepoisEstimativa;
import br.com.valueprojects.dominio.Tarefa;

public class EmissorDeSms implements AcoesDepoisEstimativa {

public class EmissorDeSms implements Notificador {
    @Override
    public void notificar(EstimativaJava estJava) {
        System.out.println("Enviando SMS para: " + estJava.getResponsavel());
    }
}
