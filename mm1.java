import java.util.Scanner;

public class mm1 {
    public static void main(String[] args) {
        Scanner ingresarDatos = new Scanner(System.in);
        // menu
        int opcion = 0;
        do {
            System.out.println("\t\n nmenu");
            System.out.println("1. Modelo mm1");
            System.out.println("2. Modelo mmC (mm2, mm3)");
            System.out.println("3. Modelo mm1k");
            System.out.println("Salir");
            System.out.println("Opcion");
            opcion = ingresarDatos.nextInt(); // selecionando opcion

            switch (opcion) {
                case 1 -> {
                    // pid iendo datos
                    System.out.println("Ingrese el valor de mu: ");
                    double mu = ingresarDatos.nextInt();
                    System.out.println("Ingrese el valor de lamda: ");
                    double lamda = ingresarDatos.nextInt();
                    // utilizaion de sistema p
                    double p;
                    p = (lamda / mu);
                    System.out.println("Resultado p : " + p);
                    // num promedio de clientes en cola Lq
                    double Lq;
                    Lq = Math.pow(lamda, 2) / (mu * (mu - lamda));
                    System.out.println("Resultado de num promedio de clientes en cola Lq: " + Lq);
                    // tiempo promedio de espera en la cola Wq en hrs o min
                    double Wq;
                    Wq = Lq / lamda;
                    System.out.println("Resultado de timeopo promedio de espera en la cola Wq : " + Wq + " hrs o "
                            + Wq * 60 + " minutos");
                    // tiempo toral en el sistema W en hrs o min
                    double W;
                    W = (Wq + 1 / mu);
                    System.out.println(
                            "Resultado de tiempo total en el sistema W :" + W + " hrs o " + W * 60 + " minutos");
                }
                case 2 -> {
                    // modelo mmc (mm2, mm3)
                    System.out.println("Ingrese los valores de C:");
                    double c = ingresarDatos.nextDouble();
                    System.out.println("Ingrese el valor de lamda: ");
                    double lamda = ingresarDatos.nextDouble();
                    System.out.println("Ingrese el valotr de mu: ");
                    double mu = ingresarDatos.nextDouble();

                    // solucion de constante a
                    double a;
                    a = lamda / mu;
                    System.out.println("A= " + a);
                    // solucion de utilizacion del servidor p
                    double p;
                    p = a / c;
                    System.out.println("Resultado de p: " + p);
                    // paso 1, p0, sumatoria
                    double smTotal = 0;
                    for (int n = 0; n < c; n++) {
                        // a**n/n!
                        smTotal = smTotal + (Math.pow(a, n) / factorial(n));
                    }
                    // paso 2, p0, termino de espera
                    double terEspera = (Math.pow(a, c)) / (factorial((int) c)) * (1 / (1 - p));
                    // paso 3, p0,
                    double Total;
                    Total = smTotal + terEspera;
                    // paso 4, p0
                    double pO;
                    pO = Math.pow(Total, -1);
                    System.out.println("P0 es:" + pO);

                    // probabilidad de que el cliente tenga que esperar pespera
                    double pEspera;
                    pEspera = (Math.pow(a, c)) / (factorial((int) c) * (1 - p)) * (pO);
                    System.out.println("Probabilidad de que el cliente tenga que esperar: " + pEspera);
                    // longitud promedio en cola
                    double Lq;
                    Lq = (pEspera * p) / (1 - p);
                    System.out.println("Longitud de promedio en cola: " + Lq);
                    // tiempo promedio de espera en la cola
                    double Wq;
                    Wq = Lq / lamda;
                    System.out.println("Tiwmpo promedio de espera en la cola: " + Wq);
                    // tiempo totsl en el sistema
                    double W;
                    W = Wq + 1 / mu;
                    System.out.println("Tiempo total en el sjstema: " + W);
                    // numero promedio en el sistema
                    double L;
                    L = lamda * W;
                    System.out.println("Numero promedio en el sistema: " + L);
                }
                
            }
        } while (opcion != 4);

    }

    // calculando un factorial (n)
    public static int factorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }
}
