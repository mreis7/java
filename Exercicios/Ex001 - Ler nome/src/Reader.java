/*  EXERCICIO 01
    LER NOME E SOBRENOME E EXIBIR MENSAGEM DE BOAS-VINDAS
*/
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome, sobrenome;
        System.out.println("\nQual o seu nome? ");
        nome = sc.nextLine();
        System.out.println("Qual seu sobrenome? ");
        sobrenome = sc.nextLine();

        System.out.println("\nBoas-vindas " + nome + " " + sobrenome + "!!");
    }
}
