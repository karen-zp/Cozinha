public class TesteCozinha{
    public static void main(String[] args){
        Liquidificador liquidificador = new Liquidificador();
        Microondas microondas = new Microondas();
        Geladeira geladeira = new Geladeira();

        Cozinha minhaCozinha = new Cozinha(liquidificador, microondas, geladeira);

        minhaCozinha.ligar();
        liquidificador.observar();
        microondas.observar();
        geladeira.observar();

        minhaCozinha.desligar();
        liquidificador.observar();
        microondas.observar();
        geladeira.observar();
    }
}
