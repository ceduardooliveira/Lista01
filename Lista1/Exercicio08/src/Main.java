import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a medida em polegada: ");
        double polegada = scanner.nextDouble();

        scanner.close();

        double milimetro = polegada * 25.4;
        System.out.println(milimetro + " milimetros");
    }
}