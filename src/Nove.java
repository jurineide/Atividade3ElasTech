import java.util.Scanner;

public class Nove {
   /* Escreva um programa que converta a temperatura de Celsius para Fahrenheit ou vice-versa,
    solicitando ao usuário qual conversão deseja fazer.
    O programa deve continuar executando até que o usuário decida sair.
    */
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       boolean continuar = true;

       while (continuar) {
           System.out.println("Menu:");
           System.out.println("1. Converter Celsius para Fahrenheit");
           System.out.println("2. Converter Fahrenheit para Celsius");
           System.out.println("3. Sair");

           int opcao = scanner.nextInt();

           switch (opcao) {
               case 1:
                   System.out.print("Qual a temperatura em Celsius: ");
                   double celsius = scanner.nextDouble();
                   double fahrenheit = celsiusParaFahrenheit(celsius);
                   System.out.println("Temperatura em Fahrenheit é: " + fahrenheit);
                   break;
               case 2:
                   System.out.print("Qual a temperatura em Fahrenheit: ");
                   double fahrenheitInput = scanner.nextDouble();
                   double celsiusResultado = fahrenheitParaCelsius(fahrenheitInput);
                   System.out.println("A temperatura em Celsius é: " + celsiusResultado);
                   break;
               case 3:
                   continuar = false;
                   System.out.println("Fim");
                   break;
               default:
                   System.out.println("Opção inválida. ");
           }
       }

       scanner.close();
   }

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;


    }
}
