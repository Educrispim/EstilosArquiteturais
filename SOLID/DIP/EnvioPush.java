package SOLID.DIP;

public class EnvioPush implements Notificacoes {
    @Override
    public void enviarNotificacoes(String mensagem) {
        System.out.println("Push Notification: " + mensagem);
    }
}
