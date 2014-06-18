/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.proyectoventas.modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import pe.edu.upeu.proyectoventas.config.Conexion;

/**
 *
 * @author admin-harold.rojas
 */
public class ProductoDAO {
    private int op=0;
    Connection cx;
    Statement st;
    public int registrarProducto(int idc, String prod, double precio, int cant){
        try {
            String sql = "INSERT INTO Producto VALUES(null, '"+prod+"', '"+precio+"', '"+cant+"', '"+idc+"')";
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            op = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            
        }
        return op;
    }
    
}
