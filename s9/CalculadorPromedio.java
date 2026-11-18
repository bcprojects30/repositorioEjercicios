import java.util.Scanner;

public class CalculadorPromedio {

    static double promedio3(double a, double b, double c) {
        double sumaTotal = a + b + c;
        return sumaTotal / 3.0;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese el primer valor: ");
        double valorUno = lector.nextDouble();
        System.out.print("Ingrese el segundo valor: ");
        double valorDos = lector.nextDouble();
        System.out.print("Ingrese el tercer valor: ");
        double valorTres = lector.nextDouble();
        System.out.println("El promedio es: " + promedio3(valorUno, valorDos, valorTres));

        lector.close();
    }
}