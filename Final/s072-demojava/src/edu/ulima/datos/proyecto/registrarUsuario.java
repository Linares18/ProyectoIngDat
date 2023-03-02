/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.datos.proyecto;

import edu.ulima.datos.proyecto.bean.Usuario;
import edu.ulima.datos.util.JdbcUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;


/**
 *
 * @author JC
 */
public class registrarUsuario {
    //ORM
    
    private final static int MAX = 100; 
    private Usuario[] array; 
    private int num; 
    
    
    public static void registrarUsuario(Usuario usua) throws Exception{
        Connection conn = JdbcUtil.getConnection();
        String sql = "INSERT INTO USUARIO VALUES(?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, usua.getCodigo());
        pst.setString(2, usua.getNombre());
        pst.setString(3, usua.getApellido());
        pst.setString(4, usua.getTelefono());
        pst.setString(5, usua.getCorreo());
        pst.setString(6, usua.getVerificacion());
        pst.setString(7, usua.getEstado());
        pst.executeUpdate();
        pst.close();
        conn.close();
    }  
    
    
    
    public boolean estaLleno() {
        // return this.num == MAX;
        if (this.num == MAX) {
            return true;
        } else {
            return false;
        }
    }

    // conocer si el arreglo esta vacio
    public boolean estaVacio() {
        return (this.num == 0);
    }

    // Agregar una persona al Arreglo
    public boolean agregar(Usuario usuario) {
        if (estaLleno() != true) {
            array[num] = usuario;
            num++;
            return true;
        } else {
            return false;
        }
    }
    
    public int numUsuario() {
        int numUsuario = 0;
        for (int i = 0; i < num; i++) {
            Usuario oTemp = array[i]; 
            
            if (oTemp instanceof Usuario) {     
                numUsuario++;
            }
        }
        return numUsuario;
    }
    public Usuario [] getListaUsuario() {
        int numUsuario = numUsuario();
        Usuario[] listaUsuario = new Usuario[numUsuario]; // Casilleros vacios
        int j = 0;
        for (int i = 0; i < num; i++) {
            if (array[i] instanceof Usuario) {
                listaUsuario[j] = array[i];
                j++;
            }
        }
        return listaUsuario;
    }

    public static void main(String[] args) throws Exception{
        
        Usuario u1 = new Usuario(100, "Juan", "Perez", "994156752", "juanperez@gmail.com", "1", "Aceptado");
        Usuario u2 = new Usuario(200, "Ana", "Gomez", "975185624", "anagomez@gmail.com", "1", "Aceptado");
        registrarUsuario(u1);
        registrarUsuario(u2);
        
        System.out.println("Usuarios registrados correctamente");
    }
}