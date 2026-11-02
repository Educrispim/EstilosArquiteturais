package Patterns.Factory_Method;

public class FabricaNotificacoes {
    public IntNotificacoes criarNotificacoes(String tipo){
        if(tipo.equals("sms")){
            return new EnvioSMS();
        } else if (tipo.equals("email")){
            return new EnvioEmail();
        }else{
            throw new IllegalArgumentException("Tipo Notificação INválida");
        }
    }
}
