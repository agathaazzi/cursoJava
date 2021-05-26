import java.util.Scanner;

public class Uri1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double sal, imp;

        sal=teclado.nextDouble();

        if (sal<=2000){
            System.out.println("Isento");
        }
        else if (sal<3000){
            imp=(3000-sal)*0.08;
            System.out.printf("R$ %.2f\n",imp);
        }
        else if (sal<4500){
            imp=(3000-2000)*0.08+(sal-3000)*0.18;
            System.out.printf("R$ %.2f\n",imp);
        }
        else {
            imp=(3000-2000)*0.08+(4500-3000)*0.18+(sal-4500)*0.28;
            System.out.printf("R$ %.2f\n",imp);
        }

    }
}