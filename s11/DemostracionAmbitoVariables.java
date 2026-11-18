public class DemostracionAmbitoVariables {

    public static void main(String[] args) {
        int variablePrincipal = 10;
        
        if (variablePrincipal > 5) {
            int variableDeBloque = 20;
            System.out.println("Variable principal viva: " + variablePrincipal);
            System.out.println("Variable de bloque viva: " + variableDeBloque);
        }
        
        System.out.println("Fin del programa, variable principal viva: " + variablePrincipal);
    }
}