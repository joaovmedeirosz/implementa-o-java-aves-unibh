public abstract class Ave implements animal {

    protected Voador comportamentoVoo;

    public Ave(Voador comportamentoVoo) {
        this.comportamentoVoo = comportamentoVoo;
    }

    public void realizarVoo() {
        if (comportamentoVoo != null) {
            comportamentoVoo.voar();
        } else {
            System.out.println("Esta ave não voa.");
        }
    }

    public void setComportamentoVoo(Voador comportamentoVoo) {
        this.comportamentoVoo = comportamentoVoo;
    }
}