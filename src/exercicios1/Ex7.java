//Rafael e Warley
package exercicios1;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double horas;
        double salarioporhora, salario;
        String funcionario;
        System.out.println("Qual o nome do funcionário : ");
        funcionario = sc.nextLine();
        System.out.println("Quanto que o "+funcionario+" ganha por hora : ");
        salarioporhora = sc.nextDouble();
        System.out.println("Quantas horas foram trabalhasdas no mês :");
        horas = sc.nextDouble();
        salario = salarioporhora*horas;
        System.out.println("O salário deste mês foi de : "+ salario+ " reias");
    }
}