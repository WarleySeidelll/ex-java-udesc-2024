//Rafael e Warley
package exercicios1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1;
        num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2;
        num2 = sc.nextInt();
        if (num1==num2){
            System.out.printf("os dois numeros sao iguais %d e %d\n", num1, num2);
        }
        if (num1>num2){
            System.out.println("o maior numero é:"+num1);
        }else{
            System.out.println("o maior numero é:"+num2);
        }if(num2<num1){
            System.out.println("o menor numero é:"+num2);
        }else {
            System.out.println("o menor numero é:"+num1);
        }
    }
}
