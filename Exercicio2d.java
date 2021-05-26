import java.util.Scanner;

public class Exercicio2d{
    public static void main (String args[]){
        Scanner teclado= new Scanner(System.in);

        double diag1, diag2, area;

        //entrada
        System.out.println("Digite a diagonal 1");
        diag1=teclado.nextDouble();

        System.out.println("Digite a diagonal 2");
        diag2=teclado.nextDouble();

        //processamento
        area=diag1*diag2;

        //saida
        System.out.println("Area do losango é" +area); 
    }
}