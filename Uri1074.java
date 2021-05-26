import java.util.Scanner;

public class Uri1074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, valor, i=1;
        String SINAL, PAR;

        SINAL="";
        PAR="";

        N=teclado.nextInt();

        do {

            i++;
            valor=teclado.nextInt();
            
            if (valor>0){
                SINAL = "POSITIVE";
            }
            else if (valor <0){
                SINAL = "NEGATIVE";
            }
            else{
                SINAL = "NULL";
            }
            if (valor!=0 && valor%2==0){
                PAR = "EVEN ";
            }
            else if (valor !=0 && valor %2!= 0){
                PAR = "ODD ";
            }
            else 
                PAR="";

        System.out.println(PAR+SINAL);

        } while (i<=N);

        
    }
}