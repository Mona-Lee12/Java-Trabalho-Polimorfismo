package app;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("****************** Mamífero *****************");
        Mamifero novoMamifero = new Mamifero();
        novoMamifero.setPeso(30.5f);
        novoMamifero.setIdade(5);
        novoMamifero.setMembros(4);
        novoMamifero.setCorPelo("branco");

        System.out.println("Peso: " + novoMamifero.getPeso());
        System.out.println("Idade: " + novoMamifero.getIdade());
        System.out.println("Membros: " + novoMamifero.getMembros());
        System.out.println("Cor do Pelo: " + novoMamifero.getCorPelo());

        novoMamifero.alimentar();
        novoMamifero.locomover();
        novoMamifero.emitirSom();

        System.out.println("\n****************** Reptil *******************");
        Reptil novoReptil = new Reptil();
        novoReptil.setPeso(12.3f);
        novoReptil.setIdade(2);
        novoReptil.setMembros(4);
        novoReptil.setCorEscama("verde");

        System.out.println("Peso: " + novoReptil.getPeso());
        System.out.println("Idade: " + novoReptil.getIdade());
        System.out.println("Membros: " + novoReptil.getMembros());
        System.out.println("Cor da Escama: " + novoReptil.getCorEscama());

        novoReptil.alimentar();
        novoReptil.locomover();
        novoReptil.emitirSom();

        System.out.println("\n****************** Peixe ********************");
        Peixe novoPeixe = new Peixe();
        novoPeixe.setPeso(2.4f);
        novoPeixe.setIdade(2);
        novoPeixe.setMembros(0);
        novoPeixe.setCorEscama("amarelo");

        System.out.println("Peso: " + novoPeixe.getPeso());
        System.out.println("Idade: " + novoPeixe.getIdade());
        System.out.println("Membros: " + novoPeixe.getMembros());
        System.out.println("Cor da Escama: " + novoPeixe.getCorEscama());

        novoPeixe.alimentar();
        novoPeixe.locomover();
        novoPeixe.emitirSom();
        novoPeixe.soltarBolha();

        System.out.println("\n****************** Ave **********************");
        Ave novaAve = new Ave();
        novaAve.setPeso(1.5f);
        novaAve.setIdade(2);
        novaAve.setMembros(2);
        novaAve.setCorPena("azul");

        System.out.println("Peso: " + novaAve.getPeso());
        System.out.println("Idade: " + novaAve.getIdade());
        System.out.println("Membros: " + novaAve.getMembros());
        System.out.println("Cor do Pena: " + novaAve.getCorPena());

        novaAve.alimentar();
        novaAve.locomover();
        novaAve.emitirSom();
        novaAve.fazerNinho();

        System.out.println("\n****************** Canguru ******************");
        Canguru novoCanguru = new Canguru();
        novoCanguru.setPeso(28.8f);
        novoCanguru.setIdade(3);
        novoCanguru.setMembros(4);
        novoCanguru.setCorPelo("marrom");

        System.out.println("Peso: " + novoCanguru.getPeso());
        System.out.println("Idade: " + novoCanguru.getIdade());
        System.out.println("Membros: " + novoCanguru.getMembros());
        System.out.println("Cor do Pelo: " + novoCanguru.getCorPelo());

        novoCanguru.alimentar();
        novoCanguru.locomover();
        novoCanguru.emitirSom();

    }
}