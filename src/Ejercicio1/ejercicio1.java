package Ejercicio1;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Datos del vehiculo
        System.out.println("Ingrese el tipo de vehiculo (Sedan, Pickup, Microbuses, Motos): ");
        String tipoVehiculo = sc.nextLine();
        System.out.println("Ingrese la marca del vehiculo: ");
        String marcaVehiculo = sc.nextLine();
        System.out.println("Ingrese el año del vehiculo: "):
        int añoVehiculo = sc.nextInt();
        sc.nextLine();

        int añoActual = 2025;
        int tiempoVehiculo = añoActual - añoVehiculo;

        if (tiempoVehiculo > 15) {
            System.out.println("No se aceptan vehiculos mayores a 15 años de fabricacion.");
            return;

            //Importancion
            System.out.print("Ingrese el pais de origen (China, Estados Unidos): ");
            String origen = sc.nextLine();
            System.out.print("Ingrese el valor del vehiculo: ");
            double valorVehiculo = sc.nextDouble();
        }
    }

}
