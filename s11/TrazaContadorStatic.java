public class TrazaContadorStatic {

    static int contadorGlobal = 0;

    static void incrementar() {
        contadorGlobal++;
    }

    public static void main(String[] args) {
        for (int iterador = 1; iterador <= 3; iterador++) {
            incrementar();
            System.out.println("Iterador actual: " + iterador + " | Contador static: " + contadorGlobal);
        }
    }
}