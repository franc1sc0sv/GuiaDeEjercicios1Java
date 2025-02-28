package Ejercicio1;
/*
* Autor: Johana Lainez
* Programa: Importadora de Vehiculos
* Descripcion: Calcular el precio final que deberia pagar el cliente para ingresar su vehiculo al pais
* Fecha 25/02/2025
 */
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int añoActual = 2025;

        // Datos del vehículo
        System.out.println("Ingrese el tipo de vehículo (Sedan, Pickups, Microbuses, Motos):");
        String tipo = sc.nextLine();
        System.out.println("Ingrese la marca del vehículo:");
        String marca = sc.nextLine();
        System.out.println("Ingrese el año de fabricación del vehículo:");
        int año = 0;
        try {
            año = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Año de fabricación incorrecto.");
            return;
        }

        int edadVehiculo = añoActual - año;
        if (edadVehiculo > 15) {
            System.out.println("No se aceptan vehículos mayores a 15 años de fabricación.");
            return;
        }

        System.out.println("Ingrese el valor del vehículo:");
        double valorVehiculo = 0;
        try {
            valorVehiculo = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Error: Valor del vehículo no válido.");
            return;
        }
        sc.nextLine();

        System.out.println("Ingrese el país de origen (China o Estados Unidos):");
        String origen = sc.nextLine();

        double porcentajeImpuesto = 0;
        if (edadVehiculo >= 10 && edadVehiculo <= 15) {
            porcentajeImpuesto = 0.16;
        } else if (edadVehiculo >= 5 && edadVehiculo <= 9) {
            porcentajeImpuesto = 0.13;
        } else if (edadVehiculo >= 1 && edadVehiculo <= 4) {
            porcentajeImpuesto = 0.11;
        }
        double costoImpuesto = valorVehiculo * porcentajeImpuesto;

        // Cálculo de flete marítimo
        double costoFlete = 0;
        if (origen.equalsIgnoreCase("China")) {
            switch (tipo.toLowerCase()) {
                case "sedan": costoFlete = 1700; break;
                case "pickups": costoFlete = 1900; break;
                case "microbuses": costoFlete = 2400; break;
                case "motos": costoFlete = 1300; break;
            }
        } else if (origen.equalsIgnoreCase("Estados Unidos")) {
            switch (tipo.toLowerCase()) {
                case "sedan": costoFlete = 1200; break;
                case "pickups": costoFlete = 1500; break;
                case "microbuses": costoFlete = 1700; break;
                case "motos": costoFlete = 900; break;
            }
        } else {
            System.out.println("País de origen no válido.");
            return;
        }

        // Cálculo de matrícula inicial
        double costoMatricula = 0;
        if (año >= 2020 && año <= 2025) {
            costoMatricula = 11.99;
        } else if (año >= 2016 && año <= 2019) {
            costoMatricula = 13.99;
        } else if (año >= 2010 && año <= 2015) {
            costoMatricula = 15.99;
        }

        // Cálculo del total de importación
        double totalImportacion = costoImpuesto + costoFlete + costoMatricula;

        // Se muestra la información
        System.out.println("\nDatos del Vehículo:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Año: " + año);
        System.out.println("\nDatos de Importación:");
        System.out.println("Porcentaje de Impuesto: " + (porcentajeImpuesto * 100) + "%");
        System.out.println("Costo de Impuesto: $" + costoImpuesto);
        System.out.println("Origen: " + origen);
        System.out.println("Costo de Flete: $" + costoFlete);
        System.out.println("Matrícula Inicial: $" + costoMatricula);
        System.out.println("Total de Importación: $" + totalImportacion);

        sc.close();
    }
}

