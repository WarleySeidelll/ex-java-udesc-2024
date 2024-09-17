//Rafael e Warley
package exercicios2;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args ){
        Scanner nota = new Scanner(System.in);
        int num1;
        int num2;
        double media;
        System.out.println("Digite o primeiro numero:");
        num1 = nota.nextInt();
        System.out.println("Digite o segundo numero:");
        num2 = nota.nextInt();
        media = (double) (num1 + num2) / 2;
        System.out.printf("Sua Média é:%.2f",media);
    }
}