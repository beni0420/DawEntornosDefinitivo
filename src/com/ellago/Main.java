package com.ellago;

public class Main {

    public static void main(String[] args) {
        CCuenta Cuenta1;
        double saldoActual;

        Cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = Cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        float cantidad = 100; // Ejemplo de cantidad a utilizar
        operativa_cuenta(Cuenta1, cantidad);
    }

    public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        try {
            cuenta.retirar(cantidad); // Utilizamos la cantidad proporcionada como parámetro
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(cantidad); // Utilizamos la cantidad proporcionada como parámetro
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
