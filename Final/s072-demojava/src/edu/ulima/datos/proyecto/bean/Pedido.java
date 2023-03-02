/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author rodri
 */
public class Pedido {
    private int cod_pedido;
    private String servicio;

    public Pedido(int cod_pedido, String servicio) {
        this.cod_pedido = cod_pedido;
        this.servicio = servicio;
    }

    public int getCod_pedido() {
        return cod_pedido;
    }

    public String getServicio() {
        return servicio;
    }
    
}
