/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author rodri
 */
public class Observacion {
    private String observacion;
    private int cod_trabajador;
    private int cod_paquete;

    public Observacion(String observacion, int cod_trabajador, int cod_paquete) {
        this.observacion = observacion;
        this.cod_trabajador = cod_trabajador;
        this.cod_paquete = cod_paquete;
    }

    public String getObservacion() {
        return observacion;
    }

    public int getCod_trabajador() {
        return cod_trabajador;
    }

    public int getCod_paquete() {
        return cod_paquete;
    }
    
}
