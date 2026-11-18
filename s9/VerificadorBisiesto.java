import java.util.Scanner;

public class VerificadorBisiesto {

    static boolean esBisiesto(int anio) {
        boolean condicionBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        return condicionBisiesto;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese un año para verificar si es bisiesto: ");
        int anioIngresado = lector.nextInt();
        System.out.println("Es bisiesto? " + esBisiesto(anioIngresado));

        lector.close();
    }
}