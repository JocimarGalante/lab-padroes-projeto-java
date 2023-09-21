package one.digitalinnovation.gof.visitor;

public class Retangulo implements Forma {
    private int id;
    private int x;
    private int y;
    private int width;
    private int height;

    public Retangulo(int id, int x, int y, int width, int height) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.retangulo(this);
    }

    @Override
    public void mover(int x, int y) {
        // forma de mover
    }

    @Override
    public void design() {
        // forma de design
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
