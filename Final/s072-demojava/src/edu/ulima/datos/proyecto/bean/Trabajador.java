/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author rodri
 */
public class Trabajador {
    private int cod_trabajador;
    private String nombre;
    private String apellido;
    private String correo;
    private String cargo;
    private String fecha;
    private float sueldo;

    public Trabajador(int cod_trabajador, String nombre, String apellido, String correo, String cargo, String fecha, float sueldo) {
        this.cod_trabajador = cod_trabajador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.cargo = cargo;
        this.fecha = fecha;
        this.sueldo = sueldo;
    }

    public int getCod_trabajador() {
        return cod_trabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCargo() {
        return cargo;
    }

    public String getFecha() {
        return fecha;
    }

    public float getSueldo() {
        return sueldo;
    }
    
}
