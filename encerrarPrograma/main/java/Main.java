import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;

        System.out.println("Digite um valor");
        System.out.println("Digite (10) para sair");

        while (true) {
            System.out.print("Digite: ");
            valor = scanner.nextInt();

            if (valor == 10) {
                break;
            }

        }
        scanner.close();
    }
}
