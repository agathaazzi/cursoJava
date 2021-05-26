import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int i, f, dur;

        i=teclado.nextInt();
        f=teclado.nextInt();

        if (i<f){
            dur=f-i;
        }
        else if(i==f){
            dur=24;
        }
        else{
            dur=(24-i+f);
        }
        System.out.println("O JOGO DUROU "+dur+" HORA (S)");
    }
}