package one.digitalinnovation.gof.visitor;

public interface Visitor {
    String ponto(Ponto ponto);
    String circulo(Circulo circulo);
    String retangulo(Retangulo retangulo);
    String graficoComposto(FormaComposta cf);
}
