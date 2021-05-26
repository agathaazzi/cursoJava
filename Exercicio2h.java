import java.util.Scanner;

public class Exercicio2h{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        double pi, r,h,vol;

        pi=3.14;

        //entrada
        System.out.println("Digite o raio");
        r=teclado.nextDouble();

        System.out.println("Digite a altura");
        h=teclado.nextDouble();

        //processamento
        vol=pi*r*r*h;

        //saida
        System.out.printf("O volume é %.2f\n " , vol);

    }
}