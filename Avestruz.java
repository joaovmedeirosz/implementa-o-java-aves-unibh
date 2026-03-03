public class Avestruz extends Ave {

    public Avestruz() {
        super(null);
    }

    @Override
    public void emitirSom() {
        System.out.println("O avestruz emite um som grave.");
    }

    @Override
    public void realizarVoo() {
        System.out.println("O avestruz não voa.");
    }
}