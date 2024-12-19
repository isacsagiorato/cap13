public class Retangulo {
    private Ponto superiorEsquerdo;
    private Ponto inferiorDireito;

    public Retangulo(Ponto superiorEsquerdo, Ponto inferiorDireito) {
        this.superiorEsquerdo = superiorEsquerdo;
        this.inferiorDireito = inferiorDireito;
    }

    public void imprimirRetangulo() {
        System.out.println("(" + superiorEsquerdo.getX() + "; " + superiorEsquerdo.getY() + ")");
        System.out.println("|==============|");
        System.out.println("|              |");
        System.out.println("|              |");
        System.out.println("|==============|");
        System.out.println("(" + inferiorDireito.getX() + "; " + inferiorDireito.getY() + ")");
    }

    public boolean contem(Ponto ponto) {
        return (ponto.getX() >= superiorEsquerdo.getX() && ponto.getX() <= inferiorDireito.getX() &&
                ponto.getY() >= superiorEsquerdo.getY() && ponto.getY() <= inferiorDireito.getY());
    }

    public boolean intersepta(Retangulo outroRetangulo) {
        return (superiorEsquerdo.getX() < outroRetangulo.inferiorDireito.getX() &&
                inferiorDireito.getX() > outroRetangulo.superiorEsquerdo.getX() &&
                superiorEsquerdo.getY() < outroRetangulo.inferiorDireito.getY() &&
                inferiorDireito.getY() > outroRetangulo.superiorEsquerdo.getY());
    }
}