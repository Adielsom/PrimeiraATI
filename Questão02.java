import java.util.Scanner;

public class GeradorTabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o numéro que deseja realizar o calculo (De 1 a 10): ");
        int numero = input.nextInt();


        if (numero < 1 || numero > 10) {
            System.out.println("Numero inválido, por favor me informe um numero entre 1 e 10");
        }else{
            System.out.println("Tabuada do" + numero + ":");
            for (int i = 1; i <= 10; i++){
                System.out.println(numero + "x" + i + " = " + (numero * i));
            }
        }

        input.close();
    }
}
