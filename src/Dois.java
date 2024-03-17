import java.util.Scanner;

public class Dois {
    /* Escreva um programa que solicite um número ao usuário e exiba a tabuada desse número de 1 a 10.
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Digite qual tabuada deseja ser exibida");
        int tabuada = num.nextInt();

        for(int i = 1; i <=10; i++){
            int resposta = tabuada * i;
            System.out.println(tabuada + " x "+ i + " = " + resposta);

        }

    }
}
