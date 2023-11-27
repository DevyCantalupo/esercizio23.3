public class esercizio23di3 {
    public static void main(String[] args) {
        int n = 0;
        division(n);
    }
    static void division(int numero) {
        try {
            System.out.println("El Resultado es de " + numero / 0);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Error");
        } finally {
            System.out.println("Fin");
        }
    }
}
