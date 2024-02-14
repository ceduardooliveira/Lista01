import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a velocidade em Km/h");
        double velocidadeKmh = scanner.nextDouble();

        scanner.close();

        double velocidade = velocidadeKmh * 1000 / 3600;

        System.out.println("A velocidade em m/s é: " + velocidade);
    }
}