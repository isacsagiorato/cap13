public class TesteRetanguloEx3 {
    public static void main(String[] args) {
        
        Ponto p1 = new Ponto(10, 10);
        Ponto p2 = new Ponto(50, 30);

       
        Retangulo retangulo = new Retangulo(p1, p2);

        System.out.println(retangulo.toString());
    }
}