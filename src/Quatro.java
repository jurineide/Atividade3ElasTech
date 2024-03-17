import java.util.Scanner;

public class Quatro {
    /*Escreva um programa que verifique se um número digitado pelo usuário é primo ou não.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");

        int num = scanner.nextInt();
        boolean numPrimo = true;

        for (int i = 2; i <=Math.sqrt(num); i++){
            if ( num % i ==0){
                numPrimo = false;
                break;
            }
        }
        if(numPrimo && num > 1){
            System.out.println(num + " é primo");
        }else {
            System.out.println(num + " não é primo");
        }


    }
}
