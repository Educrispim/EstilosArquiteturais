package Patterns.Abstract_Factory;

import java.util.HashMap;
import java.util.Map;

public class FabricaProvider {
    private static final Map<String, Fabricas> fabricas = new HashMap<>();
    
    static {
        fabricas.put("android", new FabricaAndroid());
        fabricas.put("ios", new FabricaIOS());
    }
    
    public static Fabricas obterFabrica(String tipo) {
        Fabricas fabrica = fabricas.get(tipo.toLowerCase());
        if (fabrica == null) {
            throw new IllegalArgumentException("Tipo de fábrica desconhecido: " + tipo);
        }
        return fabrica;
    }
    
    public static void registrarFabrica(String tipo, Fabricas fabrica) {
        fabricas.put(tipo.toLowerCase(), fabrica);
    }
}
