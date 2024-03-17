import java.util.Random;
import java.util.Scanner;

public class Oito {
    /* Implemente um jogo no qual o programa escolhe um número aleatório entre 1 e 100, e o jogador deve tentar adivinhá-lo.
     O programa deve fornecer dicas do tipo "maior" ou "menor" conforme necessário.
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Tente adivinhar o numero!!");
        int numAleatorio = random.nextInt(100) + 1;
        int tentativa = 0;
        int palpite;

        do {
            System.out.println("qual seu palpite: ");
            palpite = scanner.nextInt();
            tentativa++;

            if (palpite < numAleatorio) {
                System.out.println(" é maior!!!");
            } else if (palpite > numAleatorio) {
                System.out.println("é menor!!!!");
            } else {
                System.out.println("Acertou!!!!");
            }

        } while (palpite != numAleatorio);
        scanner.close();
    }
}
