import java.util.Scanner;

public class Exercicio2a{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double area, lado;

        //entrada
        System.out.println("Digite o lado");
        lado=teclado.nextDouble();

        //processamento
        area=lado*lado;

        //saida
        System.out.println("A area do quadrado é "+area);
    }


}