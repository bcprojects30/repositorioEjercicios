import java.util.Locale;
import java.util.Scanner;

public class CalculadorDistanciaPuntos {

    static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double diferenciaX = x2 - x1;
        double diferenciaY = y2 - y1;
        return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese x1: ");
        double xUno = lector.nextDouble();
        System.out.print("Ingrese y1: ");
        double yUno = lector.nextDouble();
        System.out.print("Ingrese x2: ");
        double xDos = lector.nextDouble();
        System.out.print("Ingrese y2: ");
        double yDos = lector.nextDouble();

        double distanciaTotal = calcularDistancia(xUno, yUno, xDos, yDos);
        System.out.printf("La distancia entre los dos puntos es: %.2f%n", distanciaTotal);

        lector.close();
    }
}