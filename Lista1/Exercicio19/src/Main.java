import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o coeficiente b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o coeficiente c: ");
        double c = scanner.nextDouble();

        scanner.close();

        // Calcular o discriminante (delta)
        double delta = b * b - 4 * a * c;

        // Calcular as soluções
        double sqrtDelta = Math.sqrt(Math.abs(delta));
        double divisor = 2 * a;

        double x1 = (-b + sqrtDelta) / divisor;
        double x2 = (-b - sqrtDelta) / divisor;

        // Exibir o resultado
        System.out.println("As soluções são x1 = " + x1 + " e x2 = " + x2);

    }
}