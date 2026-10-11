
import java.util.Scanner;

public class Ex_Elevador {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int MAX_PESSOAS = 5;
        final double MAX_PESO = 300.0;

        int pessoas = 0;
        double pesoTotal = 0;
        double peso;

        while (pessoas < MAX_PESSOAS && pesoTotal < MAX_PESO) {

            System.out.print("Digite o peso da pessoa (kg): ");
            peso = scanner.nextDouble();

            if (peso > 0 && pesoTotal + peso <= MAX_PESO) {

                pessoas++;
                pesoTotal = pesoTotal + peso;

                System.out.println("Pessoa entrou no elevador.");

            } else {
                System.out.println(
                        "Pessoa não pode entrar: limite de peso excedido "
                                + "ou peso inválido."
                );
            }

            System.out.println("Pessoas no elevador: " + pessoas);
            System.out.println("Peso total: " + pesoTotal + " kg");
            System.out.println();
        }

        System.out.println(
                "Subindo com " + pessoas
                        + " pessoas e " + pesoTotal + " kg."
        );

        scanner.close();
    }
}

