package edu.emiliano_anaya.reto5.reto52;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String direccion;
    private String telefono;
    private List<CuentaBancaria> cuentas;

    public Cliente(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cuentas = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    public List<CuentaBancaria> getCuentas() {
        return cuentas;
    }

    public String getNombre() {
        return null;
    }
}
