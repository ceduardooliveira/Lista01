import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a medida em melímetro: ");
        double milimetro = scanner.nextDouble();

        scanner.close();

        double polegada = milimetro / 25.4;
        System.out.println(polegada + " polegadas");
    }
}