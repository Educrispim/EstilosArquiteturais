package Patterns.Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Demonstração Abstract Factory com DIP ===\n");
        
        System.out.println("--- Renderizando Android ---");
        Fabricas fabricaAndroid = FabricaProvider.obterFabrica("android");
        Aplicacao appAndroid = new Aplicacao(fabricaAndroid);
        appAndroid.renderizar();
        
        System.out.println("\n--- Renderizando iOS ---");
        Fabricas fabricaIOS = FabricaProvider.obterFabrica("ios");
        Aplicacao appIOS = new Aplicacao(fabricaIOS);
        appIOS.renderizar();
        
        System.out.println("\n--- Adicionando nova plataforma (Windows) dinamicamente ---");
        FabricaProvider.registrarFabrica("windows", new FabricaWindows());
        
        System.out.println("--- Renderizando Windows ---");
        Fabricas fabricaWindows = FabricaProvider.obterFabrica("windows");
        Aplicacao appWindows = new Aplicacao(fabricaWindows);
        appWindows.renderizar();
        
        System.out.println("\n✓ Nenhum condicional if/else no código cliente");
        System.out.println("✓ Aplicação depende apenas de abstrações (DIP)");
        System.out.println("✓ Nova plataforma adicionada sem alterar código existente (OCP)");
    }
}
