package SOLID.DIP;

public class FabricaPush implements FabricaNotificacoes {
    @Override
    public Notificacoes criarNotificacao() {
        return new EnvioPush();
    }
}
