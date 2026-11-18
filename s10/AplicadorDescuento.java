import java.util.Arrays;

public class AplicadorDescuento {

    static void aplicarDescuento(double[] precios, double pct) {
        for (int i = 0; i < precios.length; i++) {
            precios[i] = precios[i] - (precios[i] * (pct / 100.0));
        }
    }

    public static void main(String[] args) {
        double[] listaPrecios = {100.0, 200.0, 50.0};
        double porcentajeDescuento = 15.0;

        System.out.println("Precios originales: " + Arrays.toString(listaPrecios));
        aplicarDescuento(listaPrecios, porcentajeDescuento);
        System.out.println("Precios con descuento: " + Arrays.toString(listaPrecios));
    }
}