package SOLID.DIP;

import java.util.HashMap;
import java.util.Map;

public class NotificacaoProvider {
    private static final Map<String, FabricaNotificacoes> fabricas = new HashMap<>();
    
    static {
        fabricas.put("email", new FabricaEmail());
        fabricas.put("sms", new FabricaSMS());
    }
    
    public static FabricaNotificacoes obterFabrica(String tipo) {
        FabricaNotificacoes fabrica = fabricas.get(tipo.toLowerCase());
        if (fabrica == null) {
            throw new IllegalArgumentException("Tipo de notificação desconhecido: " + tipo);
        }
        return fabrica;
    }
    
    public static void registrarFabrica(String tipo, FabricaNotificacoes fabrica) {
        fabricas.put(tipo.toLowerCase(), fabrica);
    }
}
