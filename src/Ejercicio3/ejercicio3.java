package Ejercicio3;

/**
 * Programa: Alquiler de Jet Privados
 * Descripción: Calcular el costo de alquiler de un jet basado en el tipo de jet,
 *              la cantidad de horas y aplica descuentos según la duración.
 * Autor: [Abner Leví Funes Navarro]
 * Fecha: [23/2/2025]
 */

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre, apellido, tipoJet;
        int horas = 0;
        double precioPorHora = 0, descuento = 0;

        // Captura del nombre y validación
        do {
            System.out.print("Ingrese su nombre: ");
            nombre = scanner.nextLine().trim();
            if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                System.out.println("Error: El nombre solo debe contener letras.");
                nombre = "";
            }
        } while (nombre.isEmpty());

        // Captura del apellido y validación
        do {
            System.out.print("Ingrese su apellido: ");
            apellido = scanner.nextLine().trim();
            if (!apellido.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                System.out.println("Error: El apellido solo debe contener letras.");
                apellido = "";
            }
        } while (apellido.isEmpty());

        // Captura del tipo de jet con validación
        do {
            System.out.print("Ingrese el tipo de jet a alquilar (Light/Super): ");
            tipoJet = scanner.nextLine().trim().toLowerCase();
            if (!tipoJet.equals("light") && !tipoJet.equals("super")) {
                System.out.println("Error: Debe ingresar 'Light' o 'Super'.");
            }
        } while (!tipoJet.equals("light") && !tipoJet.equals("super"));

        // Asignar precio por hora según el tipo de jet
        precioPorHora = tipoJet.equals("light") ? 3000 : 4500;

        // Captura de horas con validación
        while (true) {
            System.out.print("Ingrese la cantidad de horas de alquiler: ");
            if (scanner.hasNextInt()) {
                horas = scanner.nextInt();
                if (horas >= 1) {
                    break; // Valor válido, salimos del bucle
                } else {
                    System.out.println("Error: La cantidad de horas debe ser mayor o igual a 1.");
                }
            } else {
                System.out.println("Error: Ingrese un valor numérico válido.");
                scanner.next(); // Limpiar entrada incorrecta
            }
        }

        // Aplicación de descuentos según cantidad de horas
        if (horas >= 4 && horas <= 8) descuento = 0.15;
        else if (horas >= 9 && horas <= 12) descuento = 0.20;
        else if (horas >= 13 && horas <= 16) descuento = 0.25;
        else if (horas >= 17) descuento = 0.30;

        // Cálculo del monto total
        double subtotal = precioPorHora * horas;
        double montoDescuento = subtotal * descuento;
        double totalPagar = subtotal - montoDescuento;

        // Mostrar resultados con formato estético
        System.out.println("\n************************************");
        System.out.println("        **** RESUMEN DE ALQUILER ****");
        System.out.println("************************************");
        System.out.println("Cliente: " + nombre + " " + apellido);
        System.out.println("Tipo de Jet: " + (tipoJet.equals("light") ? "Light Jet" : "Super Jet"));
        System.out.println("Horas de alquiler: " + horas);
        System.out.println("Precio por hora: $" + precioPorHora);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "% -> -$" + montoDescuento);
        System.out.println("Total a pagar: $" + totalPagar);
        System.out.println("************************************");

        scanner.close();
    }
}
