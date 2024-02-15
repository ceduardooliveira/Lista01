import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a distância em quilômetros: ");
        double distanciaEmQuilometros = scanner.nextDouble();


        scanner.close();

        // Fator de conversão de quilômetros para milhas (1 km = 0.621371 milhas)
        double fatorConversao = 0.621371;


        double distanciaEmMilhas = distanciaEmQuilometros * fatorConversao;


        System.out.println("A distância em milhas é: " + distanciaEmMilhas);

    }
}