/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto;

import edu.ulima.datos.proyecto.bean.Producto_Q;
import edu.ulima.datos.proyecto.bean.Usuario;
import edu.ulima.datos.util.JdbcUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Giancarlos
 */
public class InsertProducto {
    public static void registrarProducto(Producto_Q prod) throws Exception{
        Connection conn = JdbcUtil.getConnection();
        String sql = "INSERT INTO USUARIO VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, prod.getCod_producto());
        pst.setFloat(2, prod.getPrecio());
        pst.setString(3, prod.getLink());
        pst.setString(4, prod.getNombre());
        pst.setFloat(5, prod.getProfundidad());
        pst.setFloat(6, prod.getAltura());
        pst.setFloat(7, prod.getAncho());
        pst.setFloat(8, prod.getPeso());
        pst.setString(9, prod.getCategoria());
        pst.executeUpdate();
        pst.close();
        conn.close();
    }     

    public static void main(String[] args) throws Exception{
        
        Producto_Q u1 = new Usuario(100, "Juan", "Perez", "994156752", "juanperez@gmail.com", "1", "Aceptado");
        Producto_Q u2 = new Usuario(200, "Ana", "Gomez", "975185624", "anagomez@gmail.com", "1", "Aceptado");
        registrarProducto(u1);
        registrarProducto(u2);
        
        System.out.println("Usuarios registrados correctamente");
    }
        pst.executeUpdate();
        pst.close();
        conn.close();
    }     

    public static void main(String[] args) throws Exception{
        
        Usuario u1 = new Usuario(100, "Juan", "Perez", "994156752", "juanperez@gmail.com", "1", "Aceptado");
        Usuario u2 = new Usuario(200, "Ana", "Gomez", "975185624", "anagomez@gmail.com", "1", "Aceptado");
        registrarUsuario(u1);
        registrarUsuario(u2);
        
        System.out.println("Usuarios registrados correctamente");
    }
}
