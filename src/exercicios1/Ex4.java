//Rafael e Warley
package exercicios1;

import java.util.Scanner;

public class Ex4 {
    public static void main (String[] args){
        String sexo;
        Scanner sx = new Scanner(System.in);
        System.out.println("digite o seu sexo (M(masculino) ou F(feminino)");
        sexo = sx.nextLine();
        if(sexo.equals("M")){
            System.out.println("Masculino");
        }else if(sexo.equals("F")){
            System.out.println("Feminino");
        }else{
            System.out.println("nao valido!");
        }
    }
}
