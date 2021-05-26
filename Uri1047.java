import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int hI, mI, hF, mF, durI, durF, tempTot, tempH,tempM;

        hI=teclado.nextInt();
        mI = teclado.nextInt();
        hF= teclado.nextInt();
        mF = teclado.nextInt();
    
       durI=60*hI+mI;
       durF=60*hF+mF;

       tempTot=durI+durF;

        if (tempTot<=0){
            tempTot=tempTot+ 24*60;
            
        }
        tempH=tempTot/60;
        tempM=tempTot % 60;

    System.out.println("O JOGO DUROU "+ tempH + " HORA(S) E "+ tempM +" MINUTO(S)");
    }
}