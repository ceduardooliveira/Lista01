import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        scanner.close();

        // Calcular a área do círculo (Área = π * raio^2)
        double area = Math.PI * Math.pow(raio, 2);


        System.out.println("A área do círculo é: " + area + " mm²");
    }
}