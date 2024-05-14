import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vetor = new String[10];

        System.out.println("Digite 10 nomes");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Adicione mais um nome: ");
            vetor[i] = scanner.nextLine();
        }

        System.out.printf("Valide a existencia de um nome no vetor, digite o nome: ");
        String nome = scanner.nextLine();

        for (int i = 0; i < vetor.length; i++) {
            if (nome.equals(vetor[i])) {
                System.out.println("Nome encontrado.");
            }
        }
    }
}
