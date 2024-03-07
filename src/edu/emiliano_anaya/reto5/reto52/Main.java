package edu.emiliano_anaya.reto5.reto52;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creamos un cliente
        Cliente cliente = new Cliente("Juan Perez", "Calle A #123", "123456789");

        // Creamos algunas cuentas bancarias y las asociamos al cliente
        CuentaBancaria cuenta1 = new CuentaBancaria("123456", 1000.0);
        CuentaBancaria cuenta2 = new CuentaBancaria("789012", 500.0);
        cliente.agregarCuenta(cuenta1);
        cliente.agregarCuenta(cuenta2);

        // Mostramos las cuentas asociadas al cliente
        List<CuentaBancaria> cuentasCliente = cliente.getCuentas();
        System.out.println("Cuentas de " + cliente.getNombre() + ":");
        for (CuentaBancaria cuenta : cuentasCliente) {
            System.out.println("- Número de cuenta: " + cuenta.getNumeroCuenta());
            System.out.println("  Saldo: $" + cuenta.getSaldo());
        }
    }
}
