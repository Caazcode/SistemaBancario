/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentadebanco;

/**
 *
 * @author adrianaguilar
 */
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        Cuenta cuenta = new Cuenta();

        
        cuenta.cliente = "Carlos Aguilar";
        cuenta.numeroDeCuenta = 12345;
        cuenta.telefono = "87825575";

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Bienvenido al sistema bancario Aguilar.");
        System.out.print("Ingrese su nombre: ");
        String nombreIngresado = scanner.nextLine();
        System.out.print("Ingrese su número de cuenta: ");
        int numeroIngresado = scanner.nextInt();

       
        if (nombreIngresado.equals(cuenta.cliente) && numeroIngresado == cuenta.numeroDeCuenta) {
            System.out.println("¡Bienvenido, " + cuenta.cliente + "!");
            boolean salir = false;

            while (!salir) {
                System.out.println("\nSeleccione una opción:");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Depositar dinero");
                System.out.println("3. Salir");
                System.out.print("Opción: ");
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                       
                        System.out.println("Su saldo actual es: " + cuenta.getSaldo());
                        break;
                    case 2:
                        
                        System.out.print("Ingrese el número de cuenta al que desea enviar dinero: ");
                        int cuentaDestino = scanner.nextInt();
                        if (cuentaDestino == cuenta.numeroDeCuenta) {
                            System.out.println("Error, No puede depositar dinero a su propia cuenta.");
                            break;
                        }
                        System.out.print("Ingrese el monto a depositar: ");
                        float monto = scanner.nextFloat();
                        cuenta.depositar(monto);
                        break;
                    case 3:
                        
                        System.out.println("Gracias por usar el sistema bancario Aguilar. ¡Hasta luego!");
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                        break;
                }
            }
        } else {
            System.out.println("Error: Nombre o número de cuenta incorrectos. No se puede acceder al sistema");
        }

        scanner.close();
    }
}