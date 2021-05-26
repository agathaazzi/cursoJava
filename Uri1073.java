import java.util.Scanner;

public class Uri1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, i=2,quad;

        N=teclado.nextInt();

        for (i=2; i<=N; i+=2){
            quad=i*i;
            System.out.println(i + "^2 = "+ quad);
        }

    }
}