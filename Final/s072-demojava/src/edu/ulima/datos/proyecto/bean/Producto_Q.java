/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author rodri
 */
public class Producto_Q {
    private int cod_producto;
    private float precio;
    private String link;
    private String nombre;
    private float profundidad;
    private float altura;
    private float ancho;
    private float peso;
    private String categoria;

    public Producto_Q(int cod_producto, float precio, String link, String nombre, float profundidad, float altura, float ancho, float peso, String categoria) {
        this.cod_producto = cod_producto;
        this.precio = precio;
        this.link = link;
        this.nombre = nombre;
        this.profundidad = profundidad;
        this.altura = altura;
        this.ancho = ancho;
        this.peso = peso;
        this.categoria = categoria;
    }

    public int getCod_producto() {
        return cod_producto;
    }

    public float getPrecio() {
        return precio;
    }

    public String getLink() {
        return link;
    }

    public String getNombre() {
        return nombre;
    }

    public float getProfundidad() {
        return profundidad;
    }

    public float getAltura() {
        return altura;
    }

    public float getAncho() {
        return ancho;
    }

    public float getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }
    
}
