package app;

public class Reptil extends Animal {

    public String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo insetos e plantas");

    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de reptil");
    }

}