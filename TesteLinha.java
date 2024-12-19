import java.util.Scanner;

public class TesteLinha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ponto inicial");
        System.out.print("x: ");
        int x1 = scanner.nextInt();
        System.out.print("y: ");
        int y1 = scanner.nextInt();

        System.out.println("Ponto final");
        System.out.print("x: ");
        int x2 = scanner.nextInt();
        System.out.print("y: ");
        int y2 = scanner.nextInt();

        Ponto p1 = new Ponto(x1, y1);
        Ponto p2 = new Ponto(x2, y2);

        Linha linha = new Linha(p1, p2);

        System.out.println("Linha criada: " + linha);
        System.out.println("Comprimento: " + String.format("%.2f", linha.calcularComprimento()));
    }
}