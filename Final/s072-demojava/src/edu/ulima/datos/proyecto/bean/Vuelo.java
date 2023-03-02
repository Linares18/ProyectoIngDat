/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author rodri
 */
public class Vuelo {
    private int codigo;
    private String origen;
    private String destino;
    private String salida;
    private String retorno;
    private String aerolinea;

    public Vuelo(int codigo, String origen, String destino, String salida, String retorno, String aerolinea) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.salida = salida;
        this.retorno = retorno;
        this.aerolinea = aerolinea;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getSalida() {
        return salida;
    }

    public String getRetorno() {
        return retorno;
    }

    public String getAerolinea() {
        return aerolinea;
    }
    
}
