public class RefactorizadoSinStatic {

    static int calcularSuma(int a, int b, int c) {
        int sumaTotal = a + b + c;
        return sumaTotal;
    }

    public static void main(String[] args) {
        int valorUno = 5;
        int valorDos = 10;
        int valorTres = 15;

        int resultadoFinal = calcularSuma(valorUno, valorDos, valorTres);
        System.out.println("El resultado usando parametros y return es: " + resultadoFinal);
    }
}