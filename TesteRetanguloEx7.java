import java.util.Scanner;

public class TesteRetanguloEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Retangulo 1");
        System.out.print("Ponto superior esquerdo\nx: ");
        int xSuperiorEsquerdo1 = scanner.nextInt();
        System.out.print("y: ");
        int ySuperiorEsquerdo1 = scanner.nextInt();

        System.out.print("Ponto inferior direito\nx: ");
        int xInferiorDireito1 = scanner.nextInt();
        System.out.print("y: ");
        int yInferiorDireito1 = scanner.nextInt();

        Ponto superiorEsquerdo1 = new Ponto(xSuperiorEsquerdo1, ySuperiorEsquerdo1);
        Ponto inferiorDireito1 = new Ponto(xInferiorDireito1, yInferiorDireito1);

        System.out.println("Retangulo 2");
        System.out.print("Ponto superior esquerdo\nx: ");
        int xSuperiorEsquerdo2 = scanner.nextInt();
        System.out.print("y: ");
        int ySuperiorEsquerdo2 = scanner.nextInt();

        System.out.print("Ponto inferior direito\nx: ");
        int xInferiorDireito2 = scanner.nextInt();
        System.out.print("y: ");
        int yInferiorDireito2 = scanner.nextInt();

        Ponto superiorEsquerdo2 = new Ponto(xSuperiorEsquerdo2, ySuperiorEsquerdo2);
        Ponto inferiorDireito2 = new Ponto(xInferiorDireito2, yInferiorDireito2);

        Retangulo retangulo1 = new Retangulo(superiorEsquerdo1, inferiorDireito1);
        Retangulo retangulo2 = new Retangulo(superiorEsquerdo2, inferiorDireito2);

        System.out.println("Retangulo 1:");
        retangulo1.imprimirRetangulo();

        System.out.println("Retangulo 2:");
        retangulo2.imprimirRetangulo();

        boolean intersecao = retangulo1.intersepta(retangulo2);

        System.out.println("Os retangulos se interceptam? " + (intersecao ? "Sim" : "Nao"));
    }
}