//Rafael e Warley
package exercicios1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        if(idade >= 18 && idade <=67){
            System.out.println("Você pode doar sangue!");
        }else{
            System.out.println("Você não pode doar sangue!");
        }
    }
}