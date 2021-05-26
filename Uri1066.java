import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor;
        int par=0;
        int impar=0;
        int pos=0;
        int neg=0;

        for(int cont=1;cont<=5;cont++){
            valor = teclado.nextInt();

            if (valor>0){
                pos++;
            }
            else if (valor<0){
                neg++;
            }
            if (valor%2==0){
                par++;
            }
            else{
                impar++;
            }
        }

        System.out.println(par+ " valor(es) par(es)");
        System.out.println(impar+ " valor(es) impar(es)");
        System.out.println(pos+ " valor(es) positivo(s)");
        System.out.println(neg+ " valor(es) negativo(s)");
    }
}