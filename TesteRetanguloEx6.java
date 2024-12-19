import java.util.Scanner;

public class TesteRetanguloEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int xSuperiorEsquerdo = scanner.nextInt();
        
        int ySuperiorEsquerdo = scanner.nextInt();

       
        int xInferiorDireito = scanner.nextInt();
    
        int yInferiorDireito = scanner.nextInt();

        Ponto superiorEsquerdo = new Ponto(xSuperiorEsquerdo, ySuperiorEsquerdo);
        Ponto inferiorDireito = new Ponto(xInferiorDireito, yInferiorDireito);

        Retangulo retangulo = new Retangulo(superiorEsquerdo, inferiorDireito);

       
        retangulo.imprimirRetangulo();

        
       
        int xPonto = scanner.nextInt();
       
        int yPonto = scanner.nextInt();

        Ponto ponto = new Ponto(xPonto, yPonto);

        boolean pontoContido = retangulo.contem(ponto);

        System.out.println("Ponto criado: (" + ponto.getX() + "; " + ponto.getY() + ")");
        System.out.println("O ponto esta contido no retangulo? " + (pontoContido ? "Sim" : "Nao"));
    }
}