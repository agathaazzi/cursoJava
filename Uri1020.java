import java.util.Scanner;

public class Uri1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int Valor, ano, mes, dia;

        Valor = teclado.nextInt();

        ano=Valor/365;
        mes=(Valor%365)/30;
        dia=(Valor%365)%30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");
    }
}