package Ejercicio2;
/*
 * Autor: Jasmín García
 * Fecha de creación: 22/02/2025
 * Descripción: Programa en Java para calcular el costo de envío de paquetes
 * siguiendo las condiciones de peso, distancia y opciones adicionales.
 */

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peso = 0, distancia = 0;

        try {
            // Solicitar y validar peso del paquete
            while (true) {
                System.out.print("Ingrese el peso del paquete en kg: ");
                if (scanner.hasNextDouble()) {
                    peso = scanner.nextDouble();
                    if (peso > 0) break;
                }
                System.out.println("Error: Ingrese un valor numérico mayor a 0.");
                scanner.nextLine(); // Limpiar entrada incorrecta
            }

            // Determinar tarifa por peso
            double tarifaPeso;
            if (peso >= 1 && peso <= 4) tarifaPeso = 1.20;
            else if (peso <= 10) tarifaPeso = 1.35;
            else if (peso <= 20) tarifaPeso = 1.60;
            else tarifaPeso = 1.75;

            double subtotalPeso = peso * tarifaPeso;

            // Solicitar y validar distancia del envío
            while (true) {
                System.out.print("Ingrese la distancia en km: ");
                if (scanner.hasNextDouble()) {
                    distancia = scanner.nextDouble();
                    if (distancia > 0) break;
                }
                System.out.println("Error: Ingrese un valor numérico mayor a 0.");
                scanner.nextLine(); // Limpiar entrada incorrecta
            }

            // Determinar tarifa por distancia
            double tarifaDistancia;
            if (distancia >= 1 && distancia <= 20) tarifaDistancia = 0.20;
            else if (distancia <= 40) tarifaDistancia = 0.08;
            else if (distancia <= 60) tarifaDistancia = 0.06;
            else tarifaDistancia = 0.04;

            double subtotalDistancia = distancia * tarifaDistancia;

            // Calcular subtotal general
            double subtotalGeneral = subtotalPeso + subtotalDistancia;

            // Preguntar por envío express
            System.out.print("¿Desea envío express? (si/no): ");
            String express = scanner.next().toLowerCase();
            double costoExpress = express.equals("si") ? subtotalGeneral * 0.13 : 0;

            // Preguntar si tiene tarjeta VIP
            System.out.print("¿Posee tarjeta VIP? (si/no): ");
            String vip = scanner.next().toLowerCase();
            double descuentoVIP = vip.equals("si") ? (subtotalGeneral + costoExpress) * 0.10 : 0;

            // Calcular precio final
            double totalPagar = subtotalGeneral + costoExpress - descuentoVIP;

            // Mostrar resultados
            System.out.println("\n================= RESUMEN DEL ENVÍO =================");
            System.out.printf("%-25s: %.2f kg%n", "Peso del paquete", peso);
            System.out.printf("%-25s: $%.2f por kg%n", "Tarifa por peso", tarifaPeso);
            System.out.printf("%-25s: %.2f km%n", "Distancia del envío", distancia);
            System.out.printf("%-25s: $%.2f por km%n", "Tarifa por distancia", tarifaDistancia);
            System.out.println("-----------------------------------------------------");
            System.out.printf("%-25s: $%.2f%n", "Subtotal por peso", subtotalPeso);
            System.out.printf("%-25s: $%.2f%n", "Subtotal por distancia", subtotalDistancia);
            System.out.printf("%-25s: $%.2f%n", "Subtotal general", subtotalGeneral);
            System.out.printf("%-25s: $%.2f%n", "Costo por envío express", costoExpress);
            System.out.printf("%-25s: -$%.2f%n", "Descuento por tarjeta VIP", descuentoVIP);
            System.out.println("-----------------------------------------------------");
            System.out.printf("%-25s: $%.2f%n", "Total a pagar", totalPagar);
            System.out.println("=====================================================");

        } catch (Exception e) {
            System.out.println("Error: Entrada inválida. " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

