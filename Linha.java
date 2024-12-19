public class Linha {
    private Ponto p1;
    private Ponto p2;

    public Linha() {
        this.p1 = new Ponto(0, 0);
        this.p2 = new Ponto(0, 0);
    }

    public Linha(Ponto p1, Ponto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Ponto getP1() {
        return p1;
    }

    public void setP1(Ponto p1) {
        this.p1 = p1;
    }

    public Ponto getP2() {
        return p2;
    }

    public void setP2(Ponto p2) {
        this.p2 = p2;
    }

    public double calcularComprimento() {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    @Override
    public String toString() {
        return "(" + p1.getX() + "; " + p1.getY() + ") --- (" + p2.getX() + "; " + p2.getY() + ")";
    }
}