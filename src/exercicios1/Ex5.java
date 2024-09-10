//Rafael e Warley
package exercicios1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade  = sc.nextInt();
        if(idade <16){
            System.out.println("Olá "+ nome +",você não pode votar!");
        }else{
            System.out.println("Olá "+ nome+", você está apto para votar!");
        }
    }
}