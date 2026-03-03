public class Gaviao extends Ave {

    public Gaviao() {
        super(new VooLongo());
    }

    @Override
    public void emitirSom() {
        System.out.println("O gavião emite um som forte.");
    }
}