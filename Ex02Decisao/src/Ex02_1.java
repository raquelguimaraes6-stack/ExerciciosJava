/*-------------------------------------------------------------------
    Ex 2.1: Subtotal e raspadinhas
    - informar o valor da compra
    - dar raspadinhas de brinde para compras acima de R$ 100

    TAREFA:
    - peça para o usuário informar o valor em reais da compra
    - se o valor for maior que R$ 100, calcule quantas raspadinhas o
      cliente deve receber: uma raspadinha para cada R$ 100
    - imprima a quantidade de raspadinhas recebidas

    ATENÇÃO:
    - não pode existir uma quantidade fracionária de raspadinhas
    - use a função Math.round() para arredondar a quantidade calculada
    - uma forma de calcular é: Math.round(valor / 100.0)
-------------------------------------------------------------------*/
import java.util.Scanner;

public class Ex02_1 {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                double valor;
                long raspadinhas;

                System.out.print("Informe o valor da compra: R$ ");
                valor = scanner.nextDouble();

                if (valor > 100) {
                        raspadinhas = Math.round(valor / 100.0);
                } else {
                        raspadinhas = 0;
                }

                System.out.println("Quantidade de raspadinhas: " + raspadinhas);

                scanner.close();
        }
}


