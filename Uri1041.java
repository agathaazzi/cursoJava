import java.util.Scanner;

public class Uri1041{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double x,y;
        
        x=teclado.nextDouble();
        y=teclado.nextDouble();

        if (x==0.0 && y==0.0){
            System.out.println("Origem");
        }
        else if (x==0.0 && y!=0.0){
            System.out.println("Eixo y");
        }
        else if (x!=0.0 && y==0.0){
            System.out.println("Eixo x");
        }
        else if (x>0.0 && y>0.0){
            System.out.println("Q1");
        }
        else if (x>0.0 && y<0.0){
            System.out.println("Q4");
        }
        else if (x<0.0 && y<0.0){
            System.out.println("Q3");
        }
        else {
            System.out.println("Q2");
        }

        
    }
}