public class Galinha extends Ave {

    public Galinha() {
        super(new VooCurto());
    }

    @Override
    public void emitirSom() {
        System.out.println("A galinha faz có-có.");
    }
}