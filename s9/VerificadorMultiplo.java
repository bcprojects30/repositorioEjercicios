import java.util.Scanner;

public class VerificadorMultiplo {

    static boolean esMultiplo(int a, int b) {
        return a % b == 0;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int numeroUno = lector.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numeroDos = lector.nextInt();
        System.out.println("Es multiplo? " + esMultiplo(numeroUno, numeroDos));

        lector.close();
    }
}