import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X, i=1;
    
        X=teclado.nextInt();

        while (i<=6){
            if (X%2!=0){
                System.out.println(X);
                i++;
            }
        
        X++;
        }

    }
}