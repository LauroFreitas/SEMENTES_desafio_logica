import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float valor1;
        float valor2;

        do
        {
            System.out.println("Divisão de valore");
            System.out.println("Adicione um valor");

            System.out.print("Valor 1: ");
            valor1 = scanner.nextFloat();
            System.out.print("Valor 2: ");
            valor2 = scanner.nextFloat();
            scanner.nextLine();

            if (valor2 == 0)
            {
                System.out.println("Entre com outro valor, não é possivel dividir com 0");
            }
        } while (valor2 == 0);

        float resultado = valor1 / valor2;
        System.out.println("Total: " + resultado);
    }
}
