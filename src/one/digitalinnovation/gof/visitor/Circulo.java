package one.digitalinnovation.gof.visitor;

public class Circulo extends Ponto {
    private int raio;

    public Circulo(int id, int x, int y, int raio) {
        super(id, x, y);
        this.raio = raio;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.circulo(this);
    }

    public int getRaio() {
        return raio;
    }
}
