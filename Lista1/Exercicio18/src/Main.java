import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o coeficiente b: ");
        double b = scanner.nextDouble();

        scanner.close();

        // Calcular a solução da equação do primeiro grau: x = -b/a
        double solucao = -b / a;

        System.out.println("A solução da equação é x = " + solucao);

    }
}