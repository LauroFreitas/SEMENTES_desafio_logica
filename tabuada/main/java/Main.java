import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem Vindo a Tabuadinha");
        while (true) {

            System.out.println("Digite 99 para sair do sistema\n");
            System.out.println("Adicione um número de 1 a 10:\n");
            int valor = scanner.nextInt();

            if (valor >= 1 && valor <= 10) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(valor + " X " + i + " = " + (valor * i));
                }
            } else {
                System.out.println("Adicione um numero de 1 a 10\n");
            }

            if (valor == 99) {
                break;
            }
        }

        scanner.close();
    }
}
