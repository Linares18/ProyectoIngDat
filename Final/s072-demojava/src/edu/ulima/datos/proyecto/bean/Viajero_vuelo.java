/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author rodri
 */
public class Viajero_vuelo {
    private String clase;
    private String asiento;
    private int cod_via;
    private int cod_vue;

    public Viajero_vuelo(String clase, String asiento, int cod_via, int cod_vue) {
        this.clase = clase;
        this.asiento = asiento;
        this.cod_via = cod_via;
        this.cod_vue = cod_vue;
    }

    public String getClase() {
        return clase;
    }

    public String getAsiento() {
        return asiento;
    }

    public int getCod_via() {
        return cod_via;
    }

    public int getCod_vue() {
        return cod_vue;
    }
    
}
