public class Main {

    public static void main(String[] args) {

        Ave aguia = new Aguia();
        Ave galinha = new Galinha();
        Ave avestruz = new Avestruz();

        aguia.emitirSom();
        aguia.realizarVoo();

        System.out.println();

        galinha.emitirSom();
        galinha.realizarVoo();

        System.out.println();

        avestruz.emitirSom();
        avestruz.realizarVoo();
    }
}