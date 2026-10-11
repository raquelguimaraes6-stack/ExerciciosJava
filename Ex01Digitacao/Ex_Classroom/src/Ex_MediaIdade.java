
import java.util.Scanner;

public class Ex_MediaIdade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int somaEstudantes = 0;
        int quantidadeEstudantes = 0;

        int somaNaoEstudantes = 0;
        int quantidadeNaoEstudantes = 0;

        int idade;
        String estudante;
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {

            System.out.print("Digite a idade: ");
            idade = scanner.nextInt();

            System.out.print("É estudante? (s/n): ");
            estudante = scanner.next();

            if (estudante.equalsIgnoreCase("s")) {
                somaEstudantes = somaEstudantes + idade;
                quantidadeEstudantes++;
            } else {
                somaNaoEstudantes = somaNaoEstudantes + idade;
                quantidadeNaoEstudantes++;
            }

            System.out.print("Deseja cadastrar outra pessoa? (s/n): ");
            continuar = scanner.next();
        }

        System.out.println("\n--- RESULTADO ---");

        if (quantidadeEstudantes > 0) {
            double mediaEstudantes =
                    (double) somaEstudantes / quantidadeEstudantes;

            System.out.println("Média dos estudantes: "
                    + mediaEstudantes);
        } else {
            System.out.println("Nenhum estudante cadastrado.");
        }

        if (quantidadeNaoEstudantes > 0) {
            double mediaNaoEstudantes =
                    (double) somaNaoEstudantes / quantidadeNaoEstudantes;

            System.out.println("Média dos não estudantes: "
                    + mediaNaoEstudantes);
        } else {
            System.out.println("Nenhum não estudante cadastrado.");
        }

        scanner.close();
    }
}

