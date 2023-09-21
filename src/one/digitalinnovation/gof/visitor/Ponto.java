package one.digitalinnovation.gof.visitor;

public class Ponto implements Forma{
    private int id;
    private int x;
    private int y;
    
    public Ponto() {
        
    }

    public Ponto(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    @Override
    public void mover(int x, int y) {
        throw new UnsupportedOperationException("Unimplemented method 'mover'");
    }

    @Override
    public void design() {
        throw new UnsupportedOperationException("Unimplemented method 'design'");
    }

    @Override
    public String aceitar(Visitor visitor) {
       return visitor.ponto(this);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getId() {
        return id;
    }
}
