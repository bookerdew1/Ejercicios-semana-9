
package clinicaveterinaria;

import java.util.Scanner;

public class ClinicaVeterinaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        clinica clinica = new clinica ();

        System.out.println("¡Bienvenido a la Clínica Veterinaria!");

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n1. Registrar mascota");
            System.out.println("2. Mostrar resumen");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la mascota: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Tamaño de la mascota (pequeño, mediano, grande): ");
                    String tamaño = scanner.nextLine();
                    System.out.print("Tipo de raza (perro, gato, exótico): ");
                    String tipoRaza = scanner.nextLine();
                    System.out.print("Tipo de servicio (baño/medico): ");
                    String tipoServicio = scanner.nextLine();

                    Mascotas mascota = new Mascotas (nombre, tamaño, tipoRaza);
                    clinica.registrarMascota(mascota, tipoServicio);
                    break;
                case 2:
                    clinica.mostrarResumen();
                    break;
                case 3:
                    continuar = false;
                    clinica.mostrarResumen();
                    System.out.println("¡Gracias por usar la Clínica Veterinaria!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}

