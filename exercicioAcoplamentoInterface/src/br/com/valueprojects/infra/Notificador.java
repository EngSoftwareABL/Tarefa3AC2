package br.com.valueprojects.infra;

import br.com.valueprojects.dominio.EstimativaJava;

public interface Notificador {
    void notificar(EstimativaJava estJava);
}