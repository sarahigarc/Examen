package examen2sara;
import java.util.*;
public class Examen2sara 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los datos del usuario:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine().toUpperCase();
        System.out.print("Apellido paterno: ");
        String apellidoPaterno = scanner.nextLine().toUpperCase();
        System.out.print("Apellido materno: ");
        String apellidoMaterno = scanner.nextLine().toUpperCase();
        System.out.print("Fecha de nacimiento (formato AAAA-MM-DD): ");
        String fechaNacimiento = scanner.nextLine();
        System.out.print("Sexo (H/M): ");
        char sexo = scanner.nextLine().toUpperCase().charAt(0);
        String curp = generarCURP(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, sexo);
        System.out.println("CURP: " + curp);
        String rfc = generarRFC(apellidoPaterno, apellidoMaterno, nombre, fechaNacimiento);
        System.out.println("RFC: " + rfc);
    }
        private static String generarCURP(String nombre, String apellidoPaterno, String apellidoMaterno, String fechaNacimiento, char sexo) {

        return apellidoPaterno.substring(0, 2) + apellidoMaterno.charAt(0) + nombre.charAt(0) +
                fechaNacimiento.substring(2, 4) + fechaNacimiento.substring(5, 7) + fechaNacimiento.substring(8) +
                String.valueOf(sexo) + "XXX";
    }

    private static String generarRFC(String apellidoPaterno, String apellidoMaterno, String nombre, String fechaNacimiento) {

        return apellidoPaterno.substring(0, 2) + apellidoMaterno.charAt(0) + nombre.charAt(0) +
                fechaNacimiento.substring(2, 4) + fechaNacimiento.substring(5, 7) + fechaNacimiento.substring(8) +
                "XXX";
    }
    }
   
