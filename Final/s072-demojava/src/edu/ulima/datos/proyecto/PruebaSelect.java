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
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JC
 */
public class PruebaSelect {
    
    public static List<Usuario> obtenerUsuarios() throws Exception{
        List<Usuario> listaUsuarios = new ArrayList<>();        
        Connection conn = JdbcUtil.getConnection();
        String sql = "SELECT * FROM USUARIO";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            int codigo = rs.getInt("COD_USUARIO");
            String nombre = rs.getString("NOMBRE");
            String apellido = rs.getString("APELLIDO");
            String telefono = rs.getString("TELEFONO");
            String correo = rs.getString("CORREO_ELECTRONICO");
            String verificacion = rs.getString("VERIFICACION");
            String estado = rs.getString("ESTADO");
            Usuario usua = new Usuario(codigo, nombre, apellido, telefono, correo, verificacion, estado);
            listaUsuarios.add(usua);
        }
        rs.close();
        pst.close();
        conn.close();
        return listaUsuarios;
    }
    public static Usuario obtenerUsuario(int cod) throws Exception{
        Usuario u = null;
        Connection conn = JdbcUtil.getConnection();
        String sql = "SELECT * FROM USUARIO WHERE COD_USUARIO = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, cod);
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            int codigo = rs.getInt("COD_USUARIO");
            String nombre = rs.getString("NOMBRE");
            String apellido = rs.getString("APELLIDO");
            String telefono = rs.getString("TELEFONO");
            String correo = rs.getString("CORREO_ELECTRONICO");
            String verificacion = rs.getString("VERIFICACION");
            String estado = rs.getString("ESTADO");
            u = new Usuario(codigo, nombre, apellido, telefono, correo, verificacion, estado);
        }
        rs.close();
        pst.close();
        conn.close();
        return u;
    }
    
    public static void main(String[] args) throws Exception{
        List<Usuario> Usuario = obtenerUsuarios();
        System.out.println(Usuario);
        
        Usuario u = obtenerUsuario(100);
        System.out.println(u);
        
    }
    /*
        Referencia adicional: https://www.javatpoint.com/ResultSet-interface
    */
}
