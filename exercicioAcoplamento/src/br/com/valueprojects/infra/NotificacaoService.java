package br.com.valueprojects.infra;

import br.com.valueprojects.dominio.EstimativaJava;
import java.util.List;

public class NotificacaoService {
    private List<Notificador> notificadores;

    public NotificacaoService(List<Notificador> notificadores) {
        this.notificadores = notificadores;
    }

    public void enviarNotificacoes(EstimativaJava estJava) {
        for (Notificador notificador : notificadores) {
            notificador.notificar(estJava);
        }
    }
}
