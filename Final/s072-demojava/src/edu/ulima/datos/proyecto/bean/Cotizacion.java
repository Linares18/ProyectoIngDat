/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author rodri
 */
public class Cotizacion {
    private int cod_cotizacion;
    private String servicio;
    private float precio;
    private int cod_producto;

    public Cotizacion(int cod_cotizacion, String servicio, float precio, int cod_producto) {
        this.cod_cotizacion = cod_cotizacion;
        this.servicio = servicio;
        this.precio = precio;
        this.cod_producto = cod_producto;
    }

    public int getCod_cotizacion() {
        return cod_cotizacion;
    }

    public String getServicio() {
        return servicio;
    }

    public float getPrecio() {
        return precio;
    }

    public int getCod_producto() {
        return cod_producto;
    }
    
}
