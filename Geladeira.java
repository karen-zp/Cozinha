class Geladeira{
    private boolean ligado;

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }

    public boolean isLigado(){
        return ligado;
    }

    public void observar(){
        if (ligado)
            System.out.println("Geladeira ligada");
        else
            System.out.println("Geladeira desligada");
    }
}

