import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativas = 10;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        while (tentativas > 0) {
            System.out.println("Você tem " + tentativas + " tentativas restantes.");
            System.out.print("Digite um número: ");
            int palpite = scanner.nextInt();

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número " + numeroAleatorio + "!");
                break;
            } else {
                if (palpite < numeroAleatorio) {
                    System.out.println("Tente um número maior.");
                } else {
                    System.out.println("Tente um número menor.");
                }
            }

            tentativas--;
        }

        if (tentativas == 0) {
            System.out.println("Suas tentativas acabaram. O número era: " + numeroAleatorio);
        }

        scanner.close();
    }
}
