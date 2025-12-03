import java.util.Scanner;
public class mm3 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        double c = 3;
        System.out.println("Ingrese el valor de lamda: ");
        double lamda = datos.nextDouble();
        System.out.println("Ingrese el valotr de mu: ");
        double mu = datos.nextDouble();

        //solucion de constante a
        double a;
        a = lamda/mu;
        System.out.println("A= " + a);
        //solucion de utilizacion del servidor p
        double p;
        p = a/c;
        System.out.println("Resultado de p: " + p);
        //paso 1, sumatoria
        double smTotal = 0;
        for(int n=0; n<c; n++){
            //a**n/n!
            smTotal = smTotal+(Math.pow(a, n)/factorial(n));
        }
        System.out.println("Resultado: " + smTotal);
    }
    public static int factorial (int numero){
        if (numero == 0) {
            return 1;
        }else{
            return  numero * factorial(numero-1);
        }
    }
}
