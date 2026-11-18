import java.util.Locale;

public class CalculadorPerimetro {

    static double perimetro(double lado) {
        return lado * 4;
    }

    static double perimetro(double a, double b) {
        return (a * 2) + (b * 2);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.printf("Perimetro del cuadrado: %.2f%n", perimetro(5.0));
        System.out.printf("Perimetro del rectangulo: %.2f%n", perimetro(4.0, 3.0));
    }
}