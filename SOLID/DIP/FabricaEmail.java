package SOLID.DIP;

public class FabricaEmail implements FabricaNotificacoes {
    @Override
    public Notificacoes criarNotificacao() {
        return new EnvioEmail();
    }
}
