import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "sim";

        while (continuar.equals("sim")){
            System.out.println("Calcula Média Final do Aluno");
            System.out.println("Adicione as notas para calcular a média:");
            System.out.print("C1: ");
            float c1 = scanner.nextFloat();
            System.out.print("C2: ");
            float c2 = scanner.nextFloat();
            scanner.nextLine();
            System.out.print("C3: "); //Adicionei mais uma nota, para a formula fazer sentido.
            float c3 = scanner.nextFloat();
            scanner.nextLine();

            float media = (3 * c1 + 3 * c2 + 4 * c3) / 10;

            if (media >= 7)
                System.out.println("Aprovado. Sua média foi de: " + media + " parabéns, você foi aprovado!");
            else
                System.out.println("Reprovado. Sua média foi de: " + media + " infelizmente não foi dessa vez, mas não desista, tente novamente!");

            System.out.println("Deseja continuar calculando? [sim] ou [nao]");
            continuar = scanner.nextLine();
        }
        scanner.close();
    }
}
