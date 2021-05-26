import java.util.Scanner;

public class Uri1019{
    public static void main(String args[]){
        Scanner teclado= new Scanner(System.in);

        int Valor,Horas,Minutos,Seg;

        Valor=teclado.nextInt();

        Horas = Valor/3600;
        Minutos = (Valor%3600)/60;
        Seg = (Valor%3600)%60;

        System.out.println(Horas +":" + Minutos +":" + Seg);
    }
}