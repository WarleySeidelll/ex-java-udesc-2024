//Rafael e Warley
package exercicios1;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){
        Scanner nt = new Scanner(System.in);
        String nome;
        double n1,n2,n3;
        double media;

        System.out.println("Digite seu nome:");
        nome = nt.nextLine();
        System.out.println("Digite sua primeira nota:");
        n1 = nt.nextDouble();
        System.out.println("Digite sua segunda nota:");
        n2 = nt.nextDouble();
        System.out.println("Digite sua terceira nota:");
        n3 = nt.nextDouble();
        media = (n1+n2+n3)/3;
        if(media>=7){
            System.out.println("Aprovado!");
        }else if(media>=5 && media<7){
            System.out.println("voce pegou exame!");
        }else if(media<5){
            System.out.println("Reprovado!");
        }
    }
}
