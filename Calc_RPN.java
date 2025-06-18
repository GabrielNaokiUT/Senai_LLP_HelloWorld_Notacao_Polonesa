import java.util.Scanner;

public class Calc_RPN {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("CALCULADORA SIMPLES COM NOTAÇÃO POLONESA REVERSA");
        System.out.println();
        System.out.print("Digite um número, número e operador: ");
        Double n1 = leia.nextDouble();
        Double n2 = leia.nextDouble();
        char op = leia.next().charAt(0);
        Double result;
        switch (op) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                result = n1 / n2;
                break;
            default:
                System.out.println("Operador inválido");
                return;
        }
        System.out.println();
        System.out.print(n1 + " " + n2 + " " + op + " = " + result);
    }
}


 
