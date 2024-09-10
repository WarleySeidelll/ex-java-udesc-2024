//Rafael e warley
package exercicios1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite uma distancia percorrida:");
        double distancia;
        distancia = sc.nextDouble();
        System.out.println("informe o combustivel gasto em litros:");
        double media;
        double combustivel;
        combustivel = sc.nextDouble();
        media = (distancia/combustivel);
        System.out.printf("a media do veiculo é %.2f por litro",media);
    }
}
