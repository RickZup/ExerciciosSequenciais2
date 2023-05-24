import java.text.DecimalFormat;
import java.util.Scanner;

public class Tarefa05 {
    public static void main(String[] args){
        System.out.println("Vamos converter unidades de temperatura!");
        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Insira uma temperatura em Fahrenheit, por favor: ");
        double tempFahrenheit = entradaDoUsuario.nextDouble();

        double tempCelsius = (tempFahrenheit - 32) / 1.8;
        System.out.printf("Pronto! %.1fºF é equivalente a  %.1fºC.", tempFahrenheit, tempCelsius);
    }
}
