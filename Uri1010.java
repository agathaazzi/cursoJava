import java.util.Scanner;

public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int cod1,num1,cod2,num2;
        double val1,val2, TOTAL;

        cod1=teclado.nextInt();
        num1=teclado.nextInt();
        val1=teclado.nextDouble();
        cod2=teclado.nextInt();
        num2=teclado.nextInt();
        val2=teclado.nextDouble();

        TOTAL=num1*val1+num2*val2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",TOTAL);

    }
}