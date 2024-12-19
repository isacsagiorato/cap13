import java.util.Scanner;
public class TestePonto {
    public static void main(String[] args) {
        int x;
        int y;

        Scanner scan = new Scanner(System.in);

        System.out.println("Ponto");
        System.out.print("   x: ");
        x = scan.nextInt();
        System.out.print("   y: ");
        y = scan.nextInt();

        Ponto novoPonto = new Ponto(x, y);
        System.out.println("Ponto criado: " + novoPonto);
        scan.close();
    }
}