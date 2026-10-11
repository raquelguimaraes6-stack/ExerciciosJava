/*-------------------------------------------------------------------
  Ex 2.2: Confirmacao de senha
  - informar uma senha
  - confirmar a senha
  - reclamar quando as senhas forem diferentes

  TAREFA:
  - peça para o usuário informar uma senha
  - peça para o usuário confirmar a senha
  - compare as duas senhas
  - se as senhas não conferirem, imprima uma mensagem reclamando
  - se as senhas conferirem, imprima uma mensagem confirmando o cadastro
  - não é necessário repetir a digitação: é só pra exercitar um IF

  ATENÇÃO:
  - para verificar se duas Strings são iguais, use o método .equals()
  - exemplo: senha.equals(confirmacao)
  - não use o operador == para comparar duas strings
  -------------------------------------------------------------------*/
import java.util.Scanner;

public class Ex02_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senha;
        String confirmacao;

        System.out.print("Digite sua senha: ");
        senha = scanner.nextLine();

        System.out.print("Confirme sua senha: ");
        confirmacao = scanner.nextLine();

        if (senha.equals(confirmacao)) {
            System.out.println("Cadastro confirmado com sucesso!");
        } else {
            System.out.println("Erro: as senhas são diferentes!");
        }

        scanner.close();
    }
}

