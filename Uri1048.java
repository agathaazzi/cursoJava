import java.util.Scanner;

public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        float sal, r, saln;

        sal=teclado.nextFloat();

        if (sal>=0.00 && sal<=400.00){
            saln = sal*1.15f;
            r=saln-sal;
            System.out.printf("Novo salario: %.2f\n",saln);
            System.out.printf("Reajuste ganho: %.2f\n",r);
            System.out.println("Em percentual: 15%");
        }
        else if (sal>400.00 && sal<=800.00){
            saln = sal*1.12f;
            r=saln-sal;
            System.out.printf("Novo salario: %.2f\n",saln);
            System.out.printf("Reajuste ganho: %.2f\n",r);
            System.out.println("Em percentual: 12%");
        }
        else if (sal>800.00 && sal<=1200.00){
            saln = sal*1.10f;
            r=saln-sal;
            System.out.printf("Novo salario: %.2f\n",saln);
            System.out.printf("Reajuste ganho: %.2f\n",r);
            System.out.println("Em percentual: 10%");
        }
        else if (sal>1200.00 && sal<=2000.00){
            saln = sal*1.07f;
            r=saln-sal;
            System.out.printf("Novo salario: %.2f\n",saln);
            System.out.printf("Reajuste ganho: %.2f\n",r);
            System.out.println("Em percentual: 7%");
        }
        else {
            saln = sal*1.04f;
            r=saln-sal;
            System.out.printf("Novo salario: %.2f\n",saln);
            System.out.printf("Reajuste ganho: %.2f\n",r);
            System.out.println("Em percentual: 4%");
        }
        
    }
}