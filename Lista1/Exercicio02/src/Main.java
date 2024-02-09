import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");

        double numero = scanner.nextDouble();
        double quadrado = Math.pow(numero, 2);

        System.out.println("O quadrado do número " + numero + " é : " + quadrado);
    }
}