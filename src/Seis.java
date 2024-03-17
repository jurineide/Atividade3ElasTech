import java.util.Scanner;

public class Seis {
    /* Faça um programa que solicite ao usuário números inteiros positivos.
    Quando o usuário digitar um número negativo, o programa deve exibir a média dos números inseridos até aquele momento.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int qtd = 0;

        while (true) {
            System.out.println("digite um numero: ");
            int num = scanner.nextInt();

            if (num >= 0) {
                soma += num;
                qtd++;
            } else {
                break;
            }
        }

            double media =(double) soma/qtd;
            System.out.println(" a média dos numeros digitados foram "+ media);
    }
}