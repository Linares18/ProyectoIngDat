/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author rodri
 */
public class Wishlist {
    private int cod_wishlist;
    private String nombre;
    private String privacidad;
    private String link;
    private int cod_cliente;

    public Wishlist(int cod_wishlist, String nombre, String privacidad, String link, int cod_cliente) {
        this.cod_wishlist = cod_wishlist;
        this.nombre = nombre;
        this.privacidad = privacidad;
        this.link = link;
        this.cod_cliente = cod_cliente;
    }

    public int getCod_wishlist() {
        return cod_wishlist;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrivacidad() {
        return privacidad;
    }

    public String getLink() {
        return link;
    }

    public int getCod_cliente() {
        return cod_cliente;
    }
    
}
