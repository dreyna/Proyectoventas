/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.proyectoventas.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import pe.edu.upeu.proyectoventas.config.Conexion;

/**
 *
 * @author admin-harold.rojas
 */
public class CategoriaDAO {
    Connection cx;
    Statement st;
    ResultSet rs;
    Categoria ct = new Categoria();
    public ArrayList<Categoria> listarCategoria(){
    ArrayList<Categoria> lista = new ArrayList();
    String sql = "SELECT *FROM Categoria";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(ct.loadCategoria(rs));            
            }
        } catch (SQLException | ClassNotFoundException ex) {
            
        }    
    return lista;
    }
    public int retorIdCategoria(String cat){
        int idcat=0;
        String sql = "SELECT *FROM Categoria WHERE categoria='"+cat+"'";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            idcat = rs.getInt("idCategoria");
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
    return idcat;
    }
}
