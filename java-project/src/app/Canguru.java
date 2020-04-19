package app;

public class Canguru extends Mamifero {

    @Override
    public void locomover() {
        System.out.println("Saltando");
    }

    @Override
    public void alimentar() {
        System.out.println("Come vegetais, frutas e folhas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Canguru");
    }

}