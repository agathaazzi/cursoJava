import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int NumFunc, Hrs;
        double ValorHora, Salario;

        NumFunc=teclado.nextInt();
        Hrs = teclado.nextInt();
        ValorHora=teclado.nextDouble();


        Salario=Hrs*ValorHora;

        System.out.println("NUMBER = "+NumFunc);
        System.out.printf("SALARY = U$ %.1f\n",Salario);
    


    }
}