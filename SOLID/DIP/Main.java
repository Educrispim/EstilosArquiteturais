package SOLID.DIP;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Demonstração DIP com Abstract Factory ===\n");
        
        System.out.println("--- Enviando via Email ---");
        FabricaNotificacoes fabricaEmail = NotificacaoProvider.obterFabrica("email");
        Notificacoes notificacaoEmail = fabricaEmail.criarNotificacao();
        Notificador notificadorEmail = new Notificador(notificacaoEmail);
        notificadorEmail.notificar("Sua conta foi criada com sucesso!");
        
        System.out.println("\n--- Enviando via SMS ---");
        FabricaNotificacoes fabricaSMS = NotificacaoProvider.obterFabrica("sms");
        Notificacoes notificacaoSMS = fabricaSMS.criarNotificacao();
        Notificador notificadorSMS = new Notificador(notificacaoSMS);
        notificadorSMS.notificar("Código de verificação: 123456");
        
        System.out.println("\n--- Adicionando novo canal (Push) dinamicamente ---");
        NotificacaoProvider.registrarFabrica("push", new FabricaPush());
        
        System.out.println("--- Enviando via Push ---");
        FabricaNotificacoes fabricaPush = NotificacaoProvider.obterFabrica("push");
        Notificacoes notificacaoPush = fabricaPush.criarNotificacao();
        Notificador notificadorPush = new Notificador(notificacaoPush);
        notificadorPush.notificar("Nova mensagem recebida!");
        
        System.out.println("\n✓ Nenhuma classe concreta instanciada diretamente no Main");
        System.out.println("✓ Cliente depende apenas de abstrações (DIP)");
        System.out.println("✓ Novo canal adicionado sem alterar código existente (OCP)");
    }
}
