package one.digitalinnovation.gof.visitor;

import java.util.ArrayList;
import java.util.List;

public class FormaComposta implements Forma {
    public int id;
    public List<Forma> filhas = new ArrayList<>();

    public FormaComposta(int id) {
        this.id = id;
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

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.graficoComposto(this);
    }

    public void add(Forma forma) {
        filhas.add(forma);
    }

}
