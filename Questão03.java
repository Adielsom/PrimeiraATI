import java.util.Scanner;

public class OperacoesVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;
        int multiplicacao = 1;


        System.out.println("Digite 5 numeros inteiros: ");

        for (int i = 0; i < 5; i++) {
            System.out.println("numero" + (i + 1) + ": ");
            numeros[i] = input.nextInt();
            soma += numeros[i];
            multiplicacao *= numeros[i];
        }

        System.out.println("\nNúmeros informados: ");
        for (int num : numeros) {
            System.out.println(num + " ");
        }

        System.out.println("\n\nSoma dos numeros: " + soma);
        System.out.println("Multiplicação dos numeros: " + multiplicacao);

        input.close();
    }
}
