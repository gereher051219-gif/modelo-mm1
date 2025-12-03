import java.util.Scanner;
public class mm1 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        //pidiendo datos
        System.out.println("Ingrese el valor de mu: ");
        double mu = datos.nextInt();
        System.out.println("Ingrese el valor de lamda: ");
        double lamda = datos.nextInt();
        //utilizaion de sistema p
        double p;
        p = (lamda/mu);
        System.out.println("Resultado p : " + p);
        //num promedio de clientes en cola Lq
        double Lq ;
        Lq = Math.pow(lamda,2) / (mu*(mu-lamda));
        System.out.println("Resultado de num promedio de clientes en cola Lq: " + Lq);
        //tiempo promedio de espera en la cola Wq en hrs o min
        double Wq;
        Wq = Lq/lamda;
        System.out.println("Resultado de timeopo promedio de espera en la cola Wq : " + Wq + " hrs o " + Wq*60 + " minutos");
        //tiempo toral en el sistema W en hrs o min
        double W;
        W = (Wq + 1/mu);
        System.out.println("Resultado de tiempo total en el sistema W :" + W + " hrs o " + W*60 + " minutos");
    }
}
