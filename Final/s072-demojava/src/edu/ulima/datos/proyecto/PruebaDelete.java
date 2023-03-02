/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.datos.proyecto;

import edu.ulima.datos.util.JdbcUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author JC
 */
public class PruebaDelete {
    public static void eliminarUsuario(int cod) throws Exception{
        Connection conn = JdbcUtil.getConnection();
        String sql = "DELETE FROM USUARIO WHERE COD_USUARIO = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, cod);
        pst.executeUpdate();
        pst.close();        
        conn.close();
    }
    
    public static void main(String[] args) throws Exception{
        eliminarUsuario(100);
        eliminarUsuario(200);
        System.out.println("Usuario eliminado correctamente");
    }
}
