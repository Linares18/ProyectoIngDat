/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author rodri
 */
public class Verificacion {
    private String verificacion;
    private int cod_trabajador;
    private int cod_pago;

    public Verificacion(String verificacion, int cod_trabajador, int cod_pago) {
        this.verificacion = verificacion;
        this.cod_trabajador = cod_trabajador;
        this.cod_pago = cod_pago;
    }

    public String getVerificacion() {
        return verificacion;
    }

    public int getCod_trabajador() {
        return cod_trabajador;
    }

    public int getCod_pago() {
        return cod_pago;
    }
    
}
