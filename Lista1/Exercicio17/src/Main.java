import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade inicial (u): ");
        double velocidadeInicial = scanner.nextDouble();


        System.out.print("Digite a aceleração (a): ");
        double aceleracao = scanner.nextDouble();

        System.out.print("Digite o tempo de percurso (t): ");
        double tempoPercurso = scanner.nextDouble();

        scanner.close();

        // Calcular a velocidade final (v = u + at)
        double velocidadeFinal = velocidadeInicial + (aceleracao * tempoPercurso);

        System.out.println("A velocidade final é: " + velocidadeFinal);

    }
}