import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 1;

        while (escolha == 1) {
            System.out.println("Calculadora de Comissão");
            System.out.println("Deseja calcular uma comissão?");
            System.out.println("[1] Sim");
            System.out.println("[2] Não");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch(escolha) {
                case 1:
                    System.out.println("Digite o nome do vendedor:");
                    String nomeVendedor = scanner.nextLine();
                    System.out.println("Digite o nome do imóvel:");
                    String nomeImovel = scanner.nextLine();
                    System.out.println("Digite o valor do imóvel:");
                    float valorImovel = scanner.nextFloat();
                    scanner.nextLine();

                    float comissao = 0;
                    if (valorImovel >= 50000) {
                        comissao = valorImovel * 0.2f;
                    } else if (valorImovel >= 30000) {
                        comissao = valorImovel * 0.15f;
                    } else {
                        comissao = valorImovel * 0.1f;
                    }
                    System.out.printf("Comissão para o vendedor %s sobre a venda do imóvel %s é de %.2f\n\n\n\n\n", nomeVendedor, nomeImovel, comissao);
                    break;
                case 2:
                    System.out.println("Programa fechado.");
                    break;
                default:
                    System.out.println("Opção inválida. Programa fechado.");
                    break;
            }
        }
    }
}
