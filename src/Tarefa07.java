import java.util.Scanner;

public class Tarefa07 {
    public static void main(String[] args){

        System.out.println("Sistema de cálculos salariais!");
        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double valorHora = entradaDoUsuario.nextDouble();

        System.out.println("Quantas horas você trabalhou no mês? ");
        double horasMes = entradaDoUsuario.nextDouble();

        double salarioBruto = valorHora * horasMes;
        double impostoRenda = (salarioBruto / 100) * 11;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double salarioLiquido = salarioBruto - impostoRenda - inss - sindicato;

        System.out.println("Bom, com isso chegamos aos seguintes dados:");
        System.out.println("Seu salário bruto é de R$" + Math.round(salarioBruto));
        System.out.println("O desconto do INSS é R$" + Math.round(inss));
        System.out.println("Já o valor de desconto para o sindicato é R$" + Math.round(sindicato));
        System.out.println("Por fim seu salário líquido é de R$" + Math.round(salarioLiquido));
    }
}
