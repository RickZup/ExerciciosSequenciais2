import java.util.Scanner;

public class Tarefa03 {
    public static void main(String[] args){

        System.out.println("Esse é um sistema feito para converter netros em centímetros.");

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Por favor, digite o valor em metros que deseja converter: ");
        double valorMetro = entradaDoUsuario.nextDouble();

        double valorCentimetro = valorMetro * 100;
        System.out.println("Pronto! " + valorMetro + "m é igual a " + Math.round(valorCentimetro) + "cm.");
    }
}
