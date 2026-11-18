import java.util.Scanner;

public class ImpresorTabla {

    static void imprimirTabla(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " por " + i + " es " + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese un numero para su tabla de multiplicar: ");
        int numeroTabla = lector.nextInt();
        imprimirTabla(numeroTabla);

        lector.close();
    }
}