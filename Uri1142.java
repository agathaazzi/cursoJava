import java.util.Scanner;

public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int PUM,a=1,b=2,c=3;

        PUM=teclado.nextInt();

        for (int i=1;i<=PUM;i++){

            System.out.println(a+" "+b+" "+c+" PUM");
            a=a+4;
            b=b+4;
            c=c+4;
        }    
    }
}