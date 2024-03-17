public class Cinco {
    /*Implemente um algoritmo que exiba os primeiros 20 números da sequência de Fibonacci.
     */
    public static void main(String[] args) {
        int num = 20;
        int termo1 = 0;
        int termo2 = 1;

        for (int i = 1; i <= num; i++){
            System.out.println(termo1 + " , ");

            int termo3 = termo1 + termo2;
            termo1 = termo2;
            termo2 = termo3;

        }
    }
}
