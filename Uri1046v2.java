import java.util.Scanner;

public class Uri1046v2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);


        int hi, hf, dur;

        hi=teclado.nextInt();
        hf=teclado.nextInt();

        dur=hf-hi;

        if (hf<=hi){
            dur=hf-hi+24;
        }

        System.out.println("O JOGO DUROU "+dur+" HORA(S)");
    }
}