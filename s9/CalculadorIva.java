import java.util.Scanner;

public class CalculadorIva {

    static double ivaIncluido(double precio) {
        double valorConIva = precio * 1.15;
        return valorConIva;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto sin IVA: ");
        double precioProducto = lector.nextDouble();
        System.out.println("El precio con IVA incluido es: " + ivaIncluido(precioProducto));

        lector.close();
    }
}