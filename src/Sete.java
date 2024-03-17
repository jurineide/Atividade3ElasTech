import java.util.Scanner;

public class Sete {
    /*Crie uma calculadora simples que permita ao usuário realizar operações de soma,
     subtração, multiplicação e divisão entre dois números,
      utilizando um laço de repetição para continuar operando até que o usuário decida sair.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operacao;

        do {
            System.out.println("entre com o primeiro numero: ");
            double num1 = scanner.nextDouble();

            System.out.println(" digite a operação aritmética: ");
            operacao = scanner.next().charAt(0);

            System.out.println("entre com o segundo numero: ");
            double num2 = scanner.nextDouble();

            double resultado = 0;

            switch (operacao) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    resultado = num1 / num2;
                    break;
                case 's':
                    System.out.println("finalizando");
                    break;
                default:
                    System.out.println("reveja!!");
                    continue;
            }
            System.out.println(resultado);

        } while (operacao!= 's');
        scanner.close();
    }
}

