package Ejercicio4;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * Autor: Francisco Hernandez
 * Programa: Descuento de matrícula
 * Descripción: Calcular el precio final que debe pagar un estudiante para su matrícula, aplicando un descuento del 25% si es de antiguo ingreso.
 * Fecha 27/02/2025
 */
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Captura de datos con validaciones
        String nombre = obtenerTexto(scanner, "Ingrese el Nombre del estudiante: ");
        String apellido = obtenerTexto(scanner, "Ingrese el Apellido del estudiante: ");
        int edad = obtenerEdad(scanner);
        int tipoIngreso = obtenerTipoIngreso(scanner);

        // Determinar el costo de la matrícula
        double costoMatricula = calcularCostoMatricula(edad);

        // Calcular el descuento
        double descuento = (tipoIngreso == 1) ? costoMatricula * 0.25 : 0.0;
        double valorFinal = costoMatricula - descuento;

        // Mostrar resultados
        mostrarInformacion(nombre, apellido, costoMatricula, descuento, valorFinal);
        scanner.close();
    }

    private static String obtenerTexto(Scanner scanner, String mensaje) {
        String input = "";
        while (input.isBlank()) {
            System.out.print(mensaje);
            input = scanner.nextLine().trim();
            if (input.isBlank()) {
                System.out.println("Error: Este campo no puede estar vacío.");
            }
        }
        return input;
    }

    private static int obtenerEdad(Scanner scanner) {
        int edad = 0;
        boolean edadValida = false;
        while (!edadValida) {
            try {
                System.out.print("Ingrese la edad del estudiante: ");
                edad = scanner.nextInt();
                if (edad >= 5) {
                    edadValida = true;
                } else {
                    System.out.println("Error: La edad debe ser mayor o igual a 5 años.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un valor numérico válido para la edad.");
                scanner.next(); // Limpiar entrada incorrecta
            }
        }
        return edad;
    }

    private static int obtenerTipoIngreso(Scanner scanner) {
        int opcion = 0;
        boolean opcionValida = false;
        while (!opcionValida) {
            System.out.println("Seleccione el tipo de ingreso:");
            System.out.println("1. Antiguo Ingreso");
            System.out.println("2. Nuevo Ingreso");
            System.out.print("Ingrese su opción (1 o 2): ");
            try {
                opcion = scanner.nextInt();
                if (opcion == 1 || opcion == 2) {
                    opcionValida = true;
                } else {
                    System.out.println("Error: Seleccione una opción válida (1 o 2).\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido.\n");
                scanner.next(); // Limpiar entrada incorrecta
            }
        }
        return opcion;
    }

    private static double calcularCostoMatricula(int edad) {
        if (edad > 15) {
            return 100.0;
        } else if (edad > 10) {
            return 125.0;
        } else {
            return 150.0;
        }
    }

    private static void mostrarInformacion(String nombre, String apellido, double costoMatricula, double descuento, double valorFinal) {
        System.out.println("\n--- Información del Estudiante ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Valor de la matrícula: $" + costoMatricula);
        System.out.println("Descuento obtenido: $" + descuento);
        System.out.println("Valor final a pagar: $" + valorFinal);
    }
}
