package Patterns.Factory_Method;

public class Main {
    public static void main(String[] args) {
        IntNotificacoes notificacoes = new FabricaNotificacoes()
            .criarNotificacoes("email");

        notificacoes.enviar();
    }
}
