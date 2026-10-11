/*-------------------------------------------------------------------
  Ex 2.5: Tipos de triangulo
  - informar o comprimento de três retas (double) 
  - descobrir se eles formam um triangulo
  - descobrir o tipo do triangulo

  TAREFA:
  - peça para o usuário informar três medidas do tipo double
  - verifique se as três medidas podem representar os lados de um
    triângulo
  - se não formarem um triângulo, imprima uma mensagem informando isso
  - se formarem um triângulo, diga se ele é equilátero, isósceles ou
    escaleno

  DICA:
  - A operação lógica "E" em java é &&
  - A operação lógica "OU" em java é ||
  - A operação lógica "NÃO" em java é !

  FORMULA:
  - três lados formam um triângulo quando cada lado é menor que a soma
    dos outros dois
  - portanto, verifique as três condições:
    lado1 < lado2 + lado3
    lado2 < lado1 + lado3
    lado3 < lado1 + lado2
  - as medidas também precisam ser maiores que zero

  CLASSIFICACAO:
  - equilátero: os três lados são iguais
  - isósceles: apenas dois lados são iguais
  - escaleno: os três lados são diferentes
-------------------------------------------------------------------*/
import java.util.Scanner;

public class Ex02_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double lado1, lado2, lado3;

        System.out.print("Informe o primeiro lado: ");
        lado1 = scanner.nextDouble();

        System.out.print("Informe o segundo lado: ");
        lado2 = scanner.nextDouble();

        System.out.print("Informe o terceiro lado: ");
        lado3 = scanner.nextDouble();

        if (lado1 > 0 && lado2 > 0 && lado3 > 0 &&
                lado1 < lado2 + lado3 &&
                lado2 < lado1 + lado3 &&
                lado3 < lado1 + lado2) {

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo equilátero");
            } else if (lado1 == lado2 ||
                    lado1 == lado3 ||
                    lado2 == lado3) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }

        } else {
            System.out.println("As medidas não formam um triângulo.");
        }

        scanner.close();
    }
}
