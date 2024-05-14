import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Produtos camisaAzul = new Produtos("Camisa Azul", 100f, 11);
        Produtos calcaPreta = new Produtos("Calça Preta", 200f, 20);
        Produtos moletomVerde = new Produtos("Moletom Verde", 300f, 10);

        List<Produtos> carrinho = new ArrayList<>();

        boolean ativoSistema = true;

        System.out.println("::::....Bem-vindo.a.loja.dos.Guri....::::");

        while (ativoSistema) {
            System.out.println("O que você vai comprar hoje? ");
            System.out.println("[Camisa Opção][1] [Calça][2] [Moletom Opção][3] [Fechar carrinho][4]");
            int escolha = Integer.parseInt(scanner.nextLine());

            switch (escolha) {
                case 1:
                    System.out.println("Você escolheu camisas \n");
                    System.out.println("Produto: " + camisaAzul.nome + "\nPreço: " + camisaAzul.preco + "\nQuantidade: " + camisaAzul.quantidade);
                    System.out.println("Comprar? True = comprar ou False = voltar");
                    boolean comprarCamisa = Boolean.parseBoolean(scanner.nextLine());

                    if (comprarCamisa && camisaAzul.quantidade > 0) {
                        System.out.println("Adicione a quantidade");
                        int quantidadeItens = Integer.parseInt(scanner.nextLine());
                        camisaAzul.quantidade -= quantidadeItens;
                        carrinho.add(new Produtos(camisaAzul.nome, camisaAzul.preco, quantidadeItens));
                    }
                    break;
                case 2:
                    System.out.println("Você escolheu calças \n");
                    System.out.println("Produto: " + calcaPreta.nome + "\nPreço: " + calcaPreta.preco + "\nQuantidade: " + calcaPreta.quantidade);
                    System.out.println("Comprar? True = comprar ou False = voltar");
                    boolean comprarCalca = Boolean.parseBoolean(scanner.nextLine());

                    if (comprarCalca && calcaPreta.quantidade > 0) {
                        System.out.println("Adicione a quantidade");
                        int quantidadeItens = Integer.parseInt(scanner.nextLine());
                        calcaPreta.quantidade -= quantidadeItens;
                        carrinho.add(new Produtos(calcaPreta.nome, calcaPreta.preco, quantidadeItens));
                    }
                    break;
                case 3:
                    System.out.println("Você escolheu moletom \n");
                    System.out.println("\nProduto: " + moletomVerde.nome + "\nPreço: " + moletomVerde.preco + "\nQuantidade: " + moletomVerde.quantidade);
                    System.out.println("Comprar? True = comprar ou False = voltar");
                    boolean comprarMoletom = Boolean.parseBoolean(scanner.nextLine());

                    if (comprarMoletom && moletomVerde.quantidade > 0) {
                        System.out.println("Adicione a quantidade");
                        int quantidadeItens = Integer.parseInt(scanner.nextLine());
                        moletomVerde.quantidade -= quantidadeItens;
                        carrinho.add(new Produtos(moletomVerde.nome, moletomVerde.preco, quantidadeItens));
                    }
                    break;
                case 4:
                    System.out.println("Fechamento do carrinho\n ");

                    int totalItensNoCarrinho = 0;
                    for (Produtos produto : carrinho) {
                        totalItensNoCarrinho += produto.quantidade;
                    }

                    float desconto = 0;
                    if (totalItensNoCarrinho > 10 && totalItensNoCarrinho <= 20) {
                        desconto = 0.1f;
                    } else if (totalItensNoCarrinho > 20 && totalItensNoCarrinho <= 50) {
                        desconto = 0.2f;
                    } else if (totalItensNoCarrinho > 50) {
                        desconto = 0.25f;
                    }

                    float total = 0;
                    for (Produtos produto : carrinho) {
                        total += produto.preco * produto.quantidade;
                    }

                    float valorDesconto = total * desconto;
                    float totalComDesconto = total - valorDesconto;

                    System.out.println("\nValor total: R$" + total);
                    System.out.println("Total de desconto: R$" + valorDesconto);
                    System.out.println("Total com desconto: R$" + totalComDesconto);

                    for (Produtos produto : carrinho) {
                        System.out.println("Produto: " + produto.nome + "Quantidade: " + produto.quantidade);
                    }
                    ativoSistema = false;
                    break;
                default:
                    System.out.println("Erro");
            }
        }
    }
}
