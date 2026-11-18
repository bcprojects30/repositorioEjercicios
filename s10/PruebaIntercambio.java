import java.util.Arrays;

public class PruebaIntercambio {

    static void intercambiar(int a, int b) {
        int auxiliar = a;
        a = b;
        b = auxiliar;
    }

    static void intercambiarArreglo(int[] v, int i, int j) {
        int auxiliar = v[i];
        v[i] = v[j];
        v[j] = auxiliar;
    }

    public static void main(String[] args) {
        int numeroUno = 10;
        int numeroDos = 20;
        
        System.out.println("Antes de intercambiar primitivos: a = " + numeroUno + ", b = " + numeroDos);
        intercambiar(numeroUno, numeroDos);
        System.out.println("Despues de intercambiar primitivos: a = " + numeroUno + ", b = " + numeroDos);
        System.out.println("Explicacion: No funciona con primitivos porque Java hace paso por valor y solo se modifican las copias locales dentro del metodo.");

        System.out.println();
        int[] numeros = {10, 20, 30};
        System.out.println("Antes de intercambiar arreglo: " + Arrays.toString(numeros));
        intercambiarArreglo(numeros, 0, 2);
        System.out.println("Despues de intercambiar arreglo: " + Arrays.toString(numeros));
        System.out.println("Explicacion: Si funciona con arreglos porque se pasa la referencia y ambos apuntan al mismo objeto en memoria.");
    }
}