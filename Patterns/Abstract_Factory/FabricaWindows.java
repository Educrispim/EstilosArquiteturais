package Patterns.Abstract_Factory;

public class FabricaWindows implements Fabricas {
    @Override
    public Botao criarBotao() {
        return new BtnWindows();
    }

    @Override
    public Input criarInput() {
        return new InputWindows();
    }
}
