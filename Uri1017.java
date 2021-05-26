import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);

        int tempo, velocidade;
        double dist, Comb;

        tempo=teclado.nextInt();
        velocidade=teclado.nextInt();

        dist=velocidade*tempo;

        Comb=dist/12;

        System.out.printf("%.3f",Comb);
    }
}