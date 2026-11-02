package SOLID.DIP;

public class FabricaSMS implements FabricaNotificacoes {
    @Override
    public Notificacoes criarNotificacao() {
        return new EnvioSMS();
    }
}
