import java.util.Scanner;

public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int cod, gas=0, alc=0,  die=0;

        cod = teclado.nextInt();

        do {

            if (cod==1){
                alc++;
            }
            else if (cod==2){
                gas++;
            }
            else if (cod==3){
                die++;
            }
            else if (cod==4){
                break;
            }
            
            cod = teclado.nextInt();

        } while (cod!=4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alc);
        System.out.println("Gasolina: "+gas);
        System.out.println("Diesel: "+die);
    }
}