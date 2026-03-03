public class Falcao extends Ave {

    public Falcao() {
        super(new VooLongo());
    }

    @Override
    public void emitirSom() {
        System.out.println("O falcão emite um som estridente.");
    }
}