public class Main {
    public static void main(String[] args) {

        double x1 = 1;
        double x2 = 2;

        // Calcular os coeficientes a, b e c
        double a = 1;
        double b = -(x1 + x2);
        double c = x1 * x2;

        // equação do segundo grau
        System.out.println("A equação do segundo grau é:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("Equação: " + a + "x^2 + " + b + "x + " + c + " = 0");

    }
}