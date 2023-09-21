package one.digitalinnovation.gof.visitor;

public class XMLExportVisitor implements Visitor {
    public String export(Forma... args) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
        for (Forma forma : args) {
            sb.append(forma.aceitar(this)).append("\n");
        }
        return sb.toString();
    }

    public String ponto(Ponto d) {
        return "<ponto>" + "\n" +
                "    <id>" + d.getId() + "</id>" + "\n" +
                "    <x>" + d.getX() + "</x>" + "\n" +
                "    <y>" + d.getY() + "</y>" + "\n" +
                "</ponto>";
    }

    public String circulo(Circulo c) {
        return "<circulo>" + "\n" +
                "    <id>" + c.getId() + "</id>" + "\n" +
                "    <x>" + c.getX() + "</x>" + "\n" +
                "    <y>" + c.getY() + "</y>" + "\n" +
                "    <raio>" + c.getRaio() + "</raio>" + "\n" +
                "</circulo>";
    }

    public String retangulo(Retangulo r) {
        return "<retangulo>" + "\n" +
                "    <id>" + r.getId() + "</id>" + "\n" +
                "    <x>" + r.getX() + "</x>" + "\n" +
                "    <y>" + r.getY() + "</y>" + "\n" +
                "    <width>" + r.getWidth() + "</width>" + "\n" +
                "    <height>" + r.getHeight() + "</height>" + "\n" +
                "</retangulo>";
    }

    public String graficoComposto(FormaComposta cg) {
        return "<compound_graphic>" + "\n" +
                "   <id>" + cg.getId() + "</id>" + "\n" +
                _graficoComposto(cg) +
                "</compound_graphic>";
    }

    private String _graficoComposto(FormaComposta cg) {
        StringBuilder sb = new StringBuilder();
        for (Forma Forma : cg.filhas) {
            String obj = Forma.aceitar(this);
            obj = "    " + obj.replace("\n", "\n    ") + "\n";
            sb.append(obj);
        }
        return sb.toString();
    }

}
