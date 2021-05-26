import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor, qtd=0;

        for (int i=1; i<=5;i++ ){
            valor=teclado.nextInt();
            if (valor %2==0){
            
            qtd = qtd+1;

            }
        }
        System.out.println(qtd+ " valores pares");
    }
}