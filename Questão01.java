import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Informe o valor da hora trabalhada: ");
        double valorHora = input.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas no mês!:");
        int horasTrabalhadas = input.nextInt();


        double salarioBruto = valorHora * horasTrabalhadas;
        double ir = 0;
        double sindicato = salarioBruto * 0.03;
        double fgts = salarioBruto * 0.11;


        if(salarioBruto <= 900){
            ir = 0;
        }else if(salarioBruto <= 1500){
            ir = salarioBruto * 0.05;
        }else if(salarioBruto <=2500){
            ir = salarioBruto * 0.11;
        }else{
            ir = salarioBruto * 0.20;
        }

        double descontos = ir + sindicato;
        double salarioliquido = salarioBruto - descontos;


        System.out.println("Salário bruto: (" + valorHora +" * " + horasTrabalhadas + ") : R$ " + salarioBruto );
        System.out.println("(-) IR: R$" + ir);
        System.out.println("(-) Sindicato (3%): R$ " + sindicato);
        System.out.println("FGTS (11%): R$ " + fgts);
        System.out.println("Total de descontos: R$ " + descontos);
        System.out.println("Salário liquido: R$ " + salarioliquido);

        input.close();

    }
}
