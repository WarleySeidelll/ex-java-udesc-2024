package exercicios1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] arg){
        int numero;
        Scanner leitor = new Scanner(System.in);

        System.out.print("digite um numero inteiro:");

        numero = leitor.nextInt();

        System.out.printf("o numero é: %d\n" +
                "",numero);

        int sucessor = numero + 1;

        System.out.printf("o sucessor de %d é: %d\n",numero, sucessor);

        int antecessor = numero - 1;

        System.out.printf("o antecessor de %d é: %d\n",numero, antecessor);
    }
}