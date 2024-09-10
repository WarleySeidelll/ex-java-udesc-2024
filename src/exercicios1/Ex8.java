//Rafael e Warley
package exercicios1;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2, valor3, valor4;
        int maior=0;
        int menor=0;
        System.out.print("Digite um valor: ");
        valor1 = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = sc.nextInt();
        System.out.print("Digite o terceiro valor: ");
        valor3 = sc.nextInt();
        System.out.print("Digite o qurato valor: ");
        valor4 = sc.nextInt();
        if(valor1>valor2 && valor1>valor3 && valor1>valor4){
            maior = valor1;
        } else if (valor2>valor1 && valor2>valor3 && valor2>valor4) {
            maior = valor2;
        } else if (valor3>valor1 && valor3>valor2 && valor3>valor4) {
            maior = valor3;
        } else if (valor4>valor1 && valor4>valor2 && valor4>valor3) {
            maior = valor4;
        }
        if(valor1<valor2 && valor1<valor3 && valor1<valor4){
            menor = valor1;
        }else if (valor2<valor1 && valor2<valor3 && valor2<valor4) {
            menor = valor2;
        } else if (valor3<valor1 && valor3<valor2 && valor3<valor4) {
            menor = valor3;
        } else if (valor4<valor1 && valor4<valor2 && valor4<valor3) {
            menor = valor4;
        }
        System.out.println("O maior valor é : "+maior);
        System.out.println("O menor valor é : "+menor);
    }
}