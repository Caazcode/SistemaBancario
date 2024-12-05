/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentadebanco;

/**
 *
 * @author adrianaguilar
 */
class Cuenta {
    // Atributos
    public String cliente;
    public int numeroDeCuenta;
    public String telefono;
    public float limite;
    private float saldo;

   
    public Cuenta() {
        cliente = "Desconocido";
        numeroDeCuenta = 0;
        telefono = "Sin teléfono";
        limite = 999999;
        saldo = 0f;
    }

    
    public float getSaldo() {
        return saldo;
    }

   
    public void depositar(float monto) {
        if (monto < 0) {
            System.out.println("Error: No se puede depositar un monto negativo.");
            return;
        }
        saldo += monto;
        System.out.println("Depósito exitoso. Saldo actual: " + saldo);
    }
}