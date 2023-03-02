/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author rodri
 */
public class Paquete {
    private int cod_paquete;
    private String estado;
    private int cod_pedido;

    public Paquete(int cod_paquete, String estado, int cod_pedido) {
        this.cod_paquete = cod_paquete;
        this.estado = estado;
        this.cod_pedido = cod_pedido;
    }

    public int getCod_paquete() {
        return cod_paquete;
    }

    public String getEstado() {
        return estado;
    }

    public int getCod_pedido() {
        return cod_pedido;
    }
    
}
