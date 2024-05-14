import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vetor = new String[20];

        System.out.println("Digite 20 nomes:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Adicione mais um nome: ");
            vetor[i] = scanner.nextLine();
        }
        int tamanhoSemRepetidos = removeRepetidos(vetor);

        System.out.println("\nNomes sem repetição:");
        for (int i = 0; i < tamanhoSemRepetidos; i++) {
            System.out.println(vetor[i]);
        }

        scanner.close();
    }

    public static int removeRepetidos(String[] vetor) {
        int tamanho = vetor.length;
        for (int i = 0; i < tamanho; i++) {
            for (int j = i + 1; j < tamanho; j++) {
                if (vetor[i] != null && vetor[j] != null && vetor[i].equals(vetor[j])) {
                    vetor[j] = null;
                }
            }
        }

        int index = 0;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] != null) {
                vetor[index++] = vetor[i];
            }
        }

        for (int i = index; i < tamanho; i++) {
            vetor[i] = null;
        }

        return index;
    }
}
