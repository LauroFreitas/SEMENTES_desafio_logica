import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login;
        String senha;
        int tentativas = 0;

        do {
            System.out.print("Login: ");
            login = scanner.nextLine();
            System.out.print("Senha: ");
            senha = scanner.nextLine();

            if (login.equals("aluno") && senha.equals("segredo")) {
                System.out.println("Bem vindo");
                break;
            } else {
                tentativas++;
                System.out.println("Login incorreto em 3 tentativas vai bloquear. Tentativa: "+ tentativas);

            }
        } while (tentativas < 3);

        if (tentativas == 3) {
            System.out.println("Login bloqueado");
        }
    }
}
