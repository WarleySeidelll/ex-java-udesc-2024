//Rafael e Warley
package exercicios2;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ex2 {
    public static void main(String[] args ){
        Scanner nota = new Scanner(System.in);
        String mensagem1,mensagem2,mensagem3;
        mensagem1=JOptionPane.showInputDialog(null,"Digite o primeiro número:");
        if (mensagem1==null||mensagem1.isEmpty()){
            System.exit(0);
        }
        mensagem2=JOptionPane.showInputDialog(null,"Digite o segundo número:");
        if (mensagem2==null||mensagem2.isEmpty()){
            System.exit(0);
        }
        mensagem3=JOptionPane.showInputDialog(null,"Digite o terceiro número:");
        if (mensagem3==null||mensagem3.isEmpty()){
            System.exit(0);
        }
        double num1 = Double.parseDouble(mensagem1);
        double num2 = Double.parseDouble(mensagem2);
        double num3 = Double.parseDouble(mensagem3);

        double media = (num1 + num2 + num3) / 3;

        String resposta = String.format("A média dos números %.2f, %.2f e %.2f é: %.2f", num1, num2, num3, media);
        JOptionPane.showMessageDialog(null, resposta);
    }
    }

