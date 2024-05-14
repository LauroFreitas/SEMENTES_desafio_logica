package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criar o objeto Scanner

        int idade = 0;
        boolean ativoSistema = true;

        while (ativoSistema) {
            System.out.println("Qual bebida você deseja?");
            System.out.println("1-Cerveja 2-Refrigerante 3-Água 4-Sair do sistema");
            int escolha = Integer.parseInt(scanner.nextLine());


            switch (escolha) {
                case 1:
                    System.out.println("Você escolheu Cerveja.");
                    System.out.println("Qual é a sua idade?");
                    idade = Integer.parseInt(scanner.nextLine());
                    if(idade >= 18) {
                        System.out.println("Opção cerveja, compra efetuada com sucesso");
                        System.out.println("Continuar comprando? [True] Continuar ou [False] Finalizar");
                        ativoSistema = Boolean.parseBoolean(scanner.nextLine());

                    } else {
                        System.out.println("Você é menor de idade. Compra não efetuada com sucesso");
                    }
                    break;
                case 2:
                    System.out.println("Opção refrigerante, compra efetuada com sucesso.");
                    System.out.println("Continuar comprando? [True] Continuar ou [False] Finalizar");
                    ativoSistema = Boolean.parseBoolean(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Opção água, compra efetuada com sucesso.");
                    System.out.println("Continuar comprando? [True] Continuar ou [False] Finalizar");
                    ativoSistema = Boolean.parseBoolean(scanner.nextLine());
                    break;
                case 4:
                    System.out.println("Saindo do sistema de compra. Obrigado por usar!");
                    ativoSistema = false;
                    break;
                default:
                    System.out.println("ERRO, opção inexistente");
            }
        }
        scanner.close();
    }
}
