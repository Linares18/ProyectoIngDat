/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author rodri
 */
public class Pago {
    private int cod_pago;
    private float monto;
    private String metodo;
    private String fecha;

    public Pago(int cod_pago, float monto, String metodo, String fecha) {
        this.cod_pago = cod_pago;
        this.monto = monto;
        this.metodo = metodo;
        this.fecha = fecha;
    }

    public int getCod_pago() {
        return cod_pago;
    }

    public float getMonto() {
        return monto;
    }

    public String getMetodo() {
        return metodo;
    }

    public String getFecha() {
        return fecha;
    }
    
}
