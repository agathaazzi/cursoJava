import java.util.Scanner;

public class Exercicio2e{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);

        double bmaior, bmenor, h, area;

        //entrada
        System.out.println("Digite a base maior");
        bmaior=teclado.nextDouble();

        System.out.println("Digite a base menor");
        bmenor=teclado.nextDouble();

        System.out.println("Digite a altura");
        h=teclado.nextDouble();

        //processamento
        area=((bmaior+bmenor)*h)/2;

        //saida
        System.out.println("A area é"+area);
    }
}