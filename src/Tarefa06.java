import java.util.Scanner;

public class Tarefa06 {
    public static void main(String[] args) {
        System.out.println("Vamos praticar! Vou exibir o número antecessor e sucessor ao que você digitar.");
        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numeroInteiro = entradaDoUsuario.nextInt();

        int antecessor = numeroInteiro - 1;
        int sucessor = numeroInteiro + 1;

        System.out.printf("Feito! O antecessor é %d e o sucessor é %d.", antecessor, sucessor);

    }
}
