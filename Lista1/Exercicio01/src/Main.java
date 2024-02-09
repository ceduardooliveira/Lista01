import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");

        int numero = scanner.nextInt();
        int dobro = numero * 2;

        System.out.println("O dobro do número " + numero + " é: " + dobro);

        scanner.close();
    }
}