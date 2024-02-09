import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um número: ");
        double numero = scanner.nextDouble();
        double resultado = numero / 5;

        System.out.println("A quinta parte do numero " + numero + " é: " + resultado);
    }
}