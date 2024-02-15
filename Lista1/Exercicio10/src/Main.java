import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a distância em milhas: ");
        double distanciaEmMilhas = scanner.nextDouble();


        scanner.close();

        // Fator de conversão de milhas para quilômetros (1 milha = 1.60934 km)
        double fatorConversao = 1.60934;


        double distanciaEmQuilometros = distanciaEmMilhas * fatorConversao;
        System.out.println("A distância em quilômetros é: " + distanciaEmQuilometros);
    }
}