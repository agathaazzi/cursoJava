import java.util.Scanner;

public class Exercicio2c{
    public static void main (String args[]){
        Scanner teclado= new Scanner(System.in);

        double base, altura, area;

        // entrada
        System.out.println("Digite o tamanho da base");
        base= teclado.nextDouble();

        System.out.println("Digite a altura");
        altura=teclado.nextDouble();

        //processamento
        area=(base*altura)/2;

        //saida
        System.out.println("A area é "+area);
    }
}