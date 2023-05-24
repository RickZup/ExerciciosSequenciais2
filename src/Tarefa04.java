import java.util.Scanner;

public class Tarefa04 {
        public static void main(String[] args){

            System.out.println("Olá, vamos descobrir qual será seu salário baseado nas horas trabalhadas?");
            Scanner entradaDoUsuario = new Scanner(System.in);

            System.out.println("Okay! Me informe quanto você ganha por hora: ");
            double valorHora = entradaDoUsuario.nextDouble();

            System.out.println("Certo... Agora informe quantas horas você trabalhou esse mês: ");
            double horasTrabalhadas = entradaDoUsuario.nextDouble();

            double salarioReceber = valorHora * horasTrabalhadas;
            System.out.printf("Tudo pronto, o salário a receber é: R$ %.0f", salarioReceber);
        }
    }