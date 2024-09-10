package exercicios1;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args){
        Scanner cg = new Scanner(System.in);
        double valortt;
        int cigarro;
        int dia;
        int ano;
        double valorct;
        System.out.println("Digite quantos anos voce fuma:");
        ano=cg.nextInt();
        System.out.println("Digite quantos cigarros voce fuma por dia:");
        cigarro=cg.nextInt();
        System.out.println("Digite o valor da carteira de cigarros:");
        valorct=cg.nextDouble();
        dia=ano*365*cigarro;
        valortt=dia*valorct;
        System.out.println(valortt);
    }
}
