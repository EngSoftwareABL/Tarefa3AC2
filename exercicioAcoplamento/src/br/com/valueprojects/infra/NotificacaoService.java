package br.com.valueprojects.infra;

import br.com.valueprojects.dominio.EstimativaJava;
import java.util.List;

public class NotificacaoService { 
    private List<Notificador> notificadores; // A lista de notificadores implementa a abstração, permitindo adicionar ou remover notificadores facilmente (DIP).

    public NotificacaoService(List<Notificador> notificadores) {
        this.notificadores = notificadores;
    }

    public void enviarNotificacoes(EstimativaJava estJava) { //Podemos adicionar novos notificadores sem alterar esta classe. OCP (Aberto/Fechado)
        for (Notificador notificador : notificadores) {
            notificador.notificar(estJava);
        }
    }
}
