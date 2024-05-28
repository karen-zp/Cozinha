class Cozinha{
    private Liquidificador liquidificador;
    private Microondas microondas;
    private Geladeira geladeira;

    public Cozinha(Liquidificador liquidificador, Microondas microondas, Geladeira geladeira){
        this.liquidificador = liquidificador;
        this.microondas = microondas;
        this.geladeira = geladeira;
    }

    public void ligar(){
        liquidificador.ligar();
        microondas.ligar();
        geladeira.ligar();
    }

    public void desligar(){
        liquidificador.desligar();
        microondas.desligar();
        geladeira.desligar();
    }
}

