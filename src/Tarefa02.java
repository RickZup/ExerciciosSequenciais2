import java.util.Scanner;

public class Tarefa02 {
    public static void main(String[] args) {
        System.out.println("Olá! Esse é um sistema para calcular sua média aritmética!");

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Por favor, digite a primeira nota: ");
        double primeiraNota = entradaDoUsuario.nextDouble();

        System.out.println("Agora preciso da sua segunda nota: ");
        double segundaNota = entradaDoUsuario.nextDouble();

        System.out.println("A terceira nota, por gentileza: ");
        double terceiraNota = entradaDoUsuario.nextDouble();

        System.out.println("E por fim, digite a quarta nota, por favor:");
        double quartaNota = entradaDoUsuario.nextDouble();

        double mediaGeral = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
        System.out.printf("A sua média aritmética é igual a: %.2f", mediaGeral);
    }
}
