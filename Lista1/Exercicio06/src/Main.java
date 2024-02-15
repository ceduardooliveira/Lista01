import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a velocidade em m/s");
        double velocidadeEmMetrosPorSegundo = scanner.nextDouble();

        scanner.close();

        double velocidadeKm = velocidadeEmMetrosPorSegundo * 3.6;

        System.out.println("A velocidade em m/s é: " + velocidadeKm + " km/h");
    }
}