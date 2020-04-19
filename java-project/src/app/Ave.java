
package app;

public class Ave extends Animal {

    public String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo insetos e outros animais pequenos");

    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de ave");
    }

    public void fazerNinho() {
        System.out.println("Construindo ninho");
    }

}