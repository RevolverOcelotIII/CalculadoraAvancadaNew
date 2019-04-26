package calculadora;

import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        String strteste[] = new String[3];
        Scanner scanf = new Scanner(System.in);
        String operacao;
        do{
            System.out.println("Insira os valores e o operador:"); 
            operacao = scanf.nextLine();
            strteste = operacao.split(" ");
            double x = Double.parseDouble(strteste[0]);
            double y = Double.parseDouble(strteste[2]);
            switch(strteste[1]){
                case "+":
                    System.out.println(Soma.calcSoma(x, y));
                    break;
                case "-":
                    System.out.println(Subtracao.calcSub(x, y));
                    break;
                case "*":
                    System.out.println(Multiplicacao.calcMult(x, y));
                    break;
                case "/":
                    System.out.println(Divisao.calcDiv(x, y));
                    break;
                case "l":
                    System.out.println(Logaritmo.calcLog(x, y));
                    break;
                case "v":
                    System.out.println(Raiz.calcRaiz(x, y));
                default:
                    System.out.println("Insira uma operação válida");
            }       
        }while(! operacao.equals("exit"));
    }
}