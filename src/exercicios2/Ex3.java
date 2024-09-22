//Warley e Rafael
package exercicios2;
import java.util.Scanner;
public class Ex3 {
    public static final int bits_byte = 8;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numeroDeBits,conversao;
        System.out.print("Digite o número de bits (tipo long): ");
        numeroDeBits=sc.nextLong();
        if (numeroDeBits>0&&numeroDeBits<=Long.MAX_VALUE){
            if (numeroDeBits%bits_byte==0) {
                conversao=(numeroDeBits/bits_byte);
                System.out.println(numeroDeBits+" bits equivalem a "+conversao+" bytes.");
            } else {
                System.out.println("O número de bits deve ser múltiplo de "+bits_byte);
            }
        } else {
            System.out.println("Número inválido, insira um número long válido");
        }
    }
}