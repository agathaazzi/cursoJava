import java.util.Scanner;

public class Uri1018{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        int Valor, n100, n50, n20, n10, n5, n2, n1;

        Valor = teclado.nextInt();

        n100=Valor/100;

        n50= (Valor % 100)/50;

        n20= ((Valor % 100)% 50)/20;

        n10=  (((Valor % 100)% 50)%20)/10;
        n5=  ((((Valor % 100)% 50)%20)%10)/5;
        n2=  (((((Valor % 100)% 50)%20)%10)%5)/2;
        n1=  ((((((Valor % 100)% 50)%20)%10)%5)%2)/1;

        System.out.println(Valor);
        System.out.println(n100+" nota(s) de R$100,00");
        System.out.println(n50+" nota(s) de R$50,00");
        System.out.println(n20+" nota(s) de R$20,00");
        System.out.println(n10+" nota(s) de R$10,00");
        System.out.println(n5+" nota(s) de R$5,00");
        System.out.println(n2+" nota(s) de R$2,00");
        System.out.println(n1+" nota(s) de R$1,00");
    }
}