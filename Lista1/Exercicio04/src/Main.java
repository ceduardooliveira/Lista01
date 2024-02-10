import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double n2 = scanner.nextDouble();


        double media = (n1 + n2) / 2;

        System.out.println("A média é: " + media);

        scanner.close();
    }
}