/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author rodri
 */
public class Cliente {
    private String calle;
    private String numero;
    private String departamento;
    private String provincia;
    private int cod_c;

    public Cliente(String calle, String numero, String departamento, String provincia, int cod_c) {
        this.calle = calle;
        this.numero = numero;
        this.departamento = departamento;
        this.provincia = provincia;
        this.cod_c = cod_c;
    }

    public String getCalle() {
        return calle;
    }

    public String getNumero() {
        return numero;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public int getCod_c() {
        return cod_c;
    }
    
}
