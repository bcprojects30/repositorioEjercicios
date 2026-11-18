import java.util.Random;

public class GeneradorCodigoAleatorio {

    public static void main(String[] args) {
        Random azar = new Random();
        StringBuilder codigoConstruido = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            char letraAleatoria = (char) ('A' + azar.nextInt(26));
            codigoConstruido.append(letraAleatoria);
        }

        for (int i = 0; i < 3; i++) {
            int digitoAleatorio = azar.nextInt(10);
            codigoConstruido.append(digitoAleatorio);
        }

        System.out.println("Codigo generado: " + codigoConstruido.toString());
    }
}