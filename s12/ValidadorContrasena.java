import java.util.Scanner;

public class ValidadorContrasena {

    static boolean validarClave(String clave) {
        if (clave.length() < 8) {
            return false;
        }

        boolean tieneMayuscula = false;
        boolean tieneDigito = false;

        for (int i = 0; i < clave.length(); i++) {
            char caracterActual = clave.charAt(i);
            if (Character.isUpperCase(caracterActual)) {
                tieneMayuscula = true;
            }
            if (Character.isDigit(caracterActual)) {
                tieneDigito = true;
            }
        }

        return tieneMayuscula && tieneDigito;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese su contraseña para validar: ");
        String contrasenaIngresada = lector.nextLine();

        if (validarClave(contrasenaIngresada)) {
            System.out.println("La contraseña es valida.");
        } else {
            System.out.println("La contraseña no cumple con los requisitos.");
        }

        lector.close();
    }
}