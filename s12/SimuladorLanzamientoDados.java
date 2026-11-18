import java.util.Random;

public class SimuladorLanzamientoDados {

    public static void main(String[] args) {
        Random azar = new Random();
        int contadorSumaSiete = 0;
        int totalLanzamientos = 1000;

        for (int i = 0; i < totalLanzamientos; i++) {
            int dadoUno = azar.nextInt(6) + 1;
            int dadoDos = azar.nextInt(6) + 1;
            int sumaDados = dadoUno + dadoDos;

            if (sumaDados == 7) {
                contadorSumaSiete++;
            }
        }

        System.out.println("De " + totalLanzamientos + " lanzamientos, la suma fue 7 un total de: " + contadorSumaSiete + " veces.");
    }
}