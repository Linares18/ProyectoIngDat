/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author rodri
 */
public class Usuario {
    public int codigo;
    public String nombre;
    public String apellido;
    public String telefono;
    public String correo;
    public String verificacion;
    public String estado;

    public Usuario(int codigo, String nombre, String apellido, String telefono, String correo, String verificacion, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.verificacion = verificacion;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getVerificacion() {
        return verificacion;
    }

    public String getEstado() {
        return estado;
    }
    
}
