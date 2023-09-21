package one.digitalinnovation.gof.visitor;

public interface Forma {
    void mover(int x, int y);
    void design();
    String aceitar(Visitor visitor);
}
