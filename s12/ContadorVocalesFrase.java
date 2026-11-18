import java.util.Scanner;

public class ContadorVocalesFrase {

    static int contarVocales(String frase) {
        String fraseMinuscula = frase.toLowerCase();
        int contadorVocales = 0;

        for (int i = 0; i < fraseMinuscula.length(); i++) {
            char caracter = fraseMinuscula.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ||
                caracter == 'á' || caracter == 'é' || caracter == 'í' || caracter == 'ó' || caracter == 'ú') {
                contadorVocales++;
            }
        }

        return contadorVocales;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String fraseIngresada = lector.nextLine();

        int totalVocales = contarVocales(fraseIngresada);
        System.out.println("El total de vocales en la frase es: " + totalVocales);

        lector.close();
    }
}