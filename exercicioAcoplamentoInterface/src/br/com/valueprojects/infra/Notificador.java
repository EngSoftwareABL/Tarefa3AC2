package br.com.valueprojects.infra;

import br.com.valueprojects.dominio.EstimativaJava;

public interface Notificador { // A interface define um contrato para a notificação. Pode ser implementada por diversas classes, como SMS ou e-mail.
    void notificar(EstimativaJava estJava);
}