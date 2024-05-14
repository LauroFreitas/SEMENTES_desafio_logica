import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.println("Digite os 10 valores do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Valor: ");
            vetor[i] = scanner.nextInt();
        }

        int valoresImpares = 0;

        for (int valor : vetor) {
            if (valor % 2 != 0) {
                valoresImpares++;
            }
        }

        System.out.println("Dos 10, " + valoresImpares+" são impares");
    }
}
