/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author rodri
 */
public class Viajero {
    private String direccion;
    private boolean firma;
    private boolean dni;
    private boolean historial;
    private int cod_u;

    public Viajero(String direccion, boolean firma, boolean dni, boolean historial, int cod_u) {
        this.direccion = direccion;
        this.firma = firma;
        this.dni = dni;
        this.historial = historial;
        this.cod_u = cod_u;
    }

    public String getDireccion() {
        return direccion;
    }

    public boolean isFirma() {
        return firma;
    }

    public boolean isDni() {
        return dni;
    }

    public boolean isHistorial() {
        return historial;
    }

    public int getCod_u() {
        return cod_u;
    }
    
}
