import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calcula Media Final");
        System.out.println("Adicione as notas N1 N2 N3 para efetuar a media");
        System.out.println("N1");
        float n1 = scanner.nextFloat();
        System.out.println("N2");
        float n2 = scanner.nextFloat();
        System.out.println("N3");
        float n3 = scanner.nextFloat();


        float media = (n1 + n2 + n3) / 3;

        if (media >= 7)
            System.out.println("Aprovado. Sua media foi de: "+media+" parabéns você foi aprovado");
        else if(media >= 5)
            System.out.println("Recuperação. Sua media foi de: "+media+" você ficou de recuperação, boa sorte!");
        else
            System.out.println("Reprovado. Sua media foi de: "+media+" infelizmente não foi dessa vez, mas não desista, tente ano que vem!");

    }
}
