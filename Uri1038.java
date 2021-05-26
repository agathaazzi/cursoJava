import java.util.Scanner;

public class Uri1038{
    public static void main(String args[]){

        Scanner teclado= new Scanner(System.in);

        int cod, qt;
        double tot;

        cod=teclado.nextInt();
        qt=teclado.nextInt();

        if (cod==1){
            tot=qt*4.0;
            
        }
        else if (cod==2){
            tot=qt*4.5;
        }
        else if (cod==3){
            tot=qt*5.0;
        }
        else if (cod==4){
            tot=qt*2.0;
        }
        else {
            tot=qt*1.5;
        }
     
    System.out.printf("Total: R$ %.2f\n",tot);
    }
}