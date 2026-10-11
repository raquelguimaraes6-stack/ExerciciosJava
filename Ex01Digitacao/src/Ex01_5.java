/*-------------------------------------------------------------------
  Ex 1.5: Troca de dinheiro
  - informar um valor inteiro em reais, sem os centavos
  - calcular quantas notas e moedas podem ser obtidas na troca

  TAREFA:
  - peça para o usuário informar um valor inteiro em reais, sem os centavos
  - calcule e imprima quantas notas de 50, 10, 5 e 2 reais
    e quantas moedas de 1 real é preciso para fazer esse valor
  - não é necessário usar if em nenhum lugar: use apenas divisão inteira (/)
    e resto da divisão (%)

  DESAFIO:
  - depois de terminar, altere o programa para aceitar um valor double,
    incluindo os centavos
  - calcule e imprima também quantas moedas de 50, 25, 10, 5 e 1 centavo
    podem ser obtidas
-------------------------------------------------------------------*/
import java.util.Scanner;

public class Ex01_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor;

        System.out.print("Informe um valor inteiro em reais: ");
        valor = scanner.nextInt();

        int notas50 = valor / 50;
        valor = valor % 50;

        int notas10 = valor / 10;
        valor = valor % 10;

        int notas5 = valor / 5;
        valor = valor % 5;

        int notas2 = valor / 2;
        valor = valor % 2;

        int moedas1 = valor;

        System.out.println("Notas de 50 reais: " + notas50);
        System.out.println("Notas de 10 reais: " + notas10);
        System.out.println("Notas de 5 reais: " + notas5);
        System.out.println("Notas de 2 reais: " + notas2);
        System.out.println("Moedas de 1 real: " + moedas1);

        scanner.close();
    }
}
