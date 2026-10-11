import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade = 0;
        double altura = 0;
        boolean idadeValida = false;
        boolean alturaValida = false;

        while (!idadeValida) {
            try {
                System.out.print("Digite sua idade (inteiro): ");
                idade = scanner.nextInt();
                idadeValida = true;

            } catch (InputMismatchException e) {
                System.out.println("Erro: digite uma idade inteira válida!");
                scanner.nextLine();
            }
        }

        while (!alturaValida) {
            try {
                System.out.print("Digite sua altura (ex: 1,75): ");
                altura = scanner.nextDouble();
                alturaValida = true;

            } catch (InputMismatchException e) {
                System.out.println("Erro: digite uma altura numérica válida!");
                scanner.nextLine();
            }
        }

        System.out.println("\nDados cadastrados com sucesso!");
        System.out.println("Idade: " + idade + " anos | Altura: " + altura + "m");

        scanner.close();
    }
}
