/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author rodri
 */
public class Producto_pedido {
    private int cantidad;
    private float precio_final;
    private int cod_producto;
    private int cod_pedido;

    public Producto_pedido(int cantidad, float precio_final, int cod_producto, int cod_pedido) {
        this.cantidad = cantidad;
        this.precio_final = precio_final;
        this.cod_producto = cod_producto;
        this.cod_pedido = cod_pedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPrecio_final() {
        return precio_final;
    }

    public int getCod_producto() {
        return cod_producto;
    }

    public int getCod_pedido() {
        return cod_pedido;
    }
    
}
