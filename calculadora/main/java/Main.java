import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float valor1;
        float valor2;

        System.out.println("Escolha a operação desejada:");
        System.out.println("1 - Adição (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("3 - Multiplicação (*)");
        System.out.println("4 - Divisão (/)");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Valor 1: ");
        valor1 = scanner.nextFloat();
        System.out.print("Valor 2: ");
        valor2 = scanner.nextFloat();
        scanner.nextLine();

        float resultado = 0;

        switch (opcao) {
            case 1:
                resultado = valor1 + valor2;
                break;
            case 2:
                resultado = valor1 - valor2;
                break;
            case 3:
                resultado = valor1 * valor2;
                break;
            case 4:
                if (valor2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                    return;
                }
                resultado = valor1 / valor2;
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("Resultado: "+resultado);
    }
}
