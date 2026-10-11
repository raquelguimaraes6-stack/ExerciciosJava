/*-------------------------------------------------------------------
  Ex 2.6: Ordem dos numeros
  - informar tres numeros
  - descobrir qual e o maior, o do meio e o menor

  TAREFA:
  - peça para o usuário informar três números do tipo double
  - descubra qual dos três números é o maior
  - descubra qual dos três números fica no meio
  - descubra qual dos três números é o menor
  - imprima os três valores nesta ordem: maior, do meio e menor

  DICA:
  - use decisões para comparar os três números
  - os números podem ser informados em qualquer ordem
-------------------------------------------------------------------*/
import java.util.Scanner;

public class Ex02_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n1, n2, n3, aux;

        System.out.print("Informe o primeiro número: ");
        n1 = scanner.nextDouble();

        System.out.print("Informe o segundo número: ");
        n2 = scanner.nextDouble();

        System.out.print("Informe o terceiro número: ");
        n3 = scanner.nextDouble();

        if (n1 < n2) {
            aux = n1;
            n1 = n2;
            n2 = aux;
        }

        if (n1 < n3) {
            aux = n1;
            n1 = n3;
            n3 = aux;
        }

        if (n2 < n3) {
            aux = n2;
            n2 = n3;
            n3 = aux;
        }

        System.out.println("Maior: " + n1);
        System.out.println("Do meio: " + n2);
        System.out.println("Menor: " + n3);

        scanner.close();
    }
}
