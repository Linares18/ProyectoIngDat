/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author rodri
 */
public class Viajero_pedido {
    private String estado;
    private String tiempo;
    private float comision;
    private int cod_viajero;
    private int cod_pedido;

    public Viajero_pedido(String estado, String tiempo, float comision, int cod_viajero, int cod_pedido) {
        this.estado = estado;
        this.tiempo = tiempo;
        this.comision = comision;
        this.cod_viajero = cod_viajero;
        this.cod_pedido = cod_pedido;
    }

    public String getEstado() {
        return estado;
    }

    public String getTiempo() {
        return tiempo;
    }

    public float getComision() {
        return comision;
    }

    public int getCod_viajero() {
        return cod_viajero;
    }

    public int getCod_pedido() {
        return cod_pedido;
    }
    
}
