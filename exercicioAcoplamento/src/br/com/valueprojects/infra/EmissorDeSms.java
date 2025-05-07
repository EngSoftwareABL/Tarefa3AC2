package br.com.valueprojects.infra;

import java.util.List;

import br.com.valueprojects.dominio.AcoesDepoisEstimativa;
import br.com.valueprojects.dominio.EstimativaJava;
import br.com.valueprojects.dominio.Tarefa;

public class EmissorDeSms implements AcoesDepoisEstimativa {

public class EmissorDeSms implements Notificador {
    @Override
    public void notificar(EstimativaJava estJava) {
        System.out.println("Enviando SMS para: " + estJava.getResponsavel());
    }
}

@Override // Garante que estamos sobrescrevendo corretamente o método da interface.
    public void notificar(EstimativaJava estJava) { 
        System.out.println("Enviando WhatsApp para: " + estJava.getResponsavel());
    }

	private List<Notificador> notificadores; // A lista de notificadores implementa a abstração, permitindo adicionar ou remover notificadores facilmente (DIP).

    public NotificacaoService(List<Notificador> notificadores) {
        this.notificadores = notificadores;
    }

    public void enviarNotificacoes(EstimativaJava estJava) { //Podemos adicionar novos notificadores sem alterar esta classe. OCP (Aberto/Fechado)
        for (Notificador notificador : notificadores) {
            notificador.notificar(estJava);
        }
    }

	void notificar(EstimativaJava estJava);
}