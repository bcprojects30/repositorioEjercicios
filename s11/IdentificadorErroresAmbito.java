public class IdentificadorErroresAmbito {

    static void realizarCalculo() {
        int resultadoLocal = 100;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Iteracion: " + i);
        }
        
        // Error 1: 'i' no compila aqui porque murio al cerrar el ciclo for.
        // System.out.println(i);

        realizarCalculo();
        
        // Error 2: 'resultadoLocal' no compila aqui porque pertenece al ambito de otro metodo.
        // System.out.println(resultadoLocal);
    }
}