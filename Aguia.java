public class Aguia extends Ave {

    public Aguia() {
        super(new VooAguiaCareca());
    }

    @Override
    public void emitirSom() {
        System.out.println("A águia emite um som agudo.");
    }
}