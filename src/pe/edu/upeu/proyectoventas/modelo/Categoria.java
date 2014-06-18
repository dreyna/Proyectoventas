/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.proyectoventas.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author admin-harold.rojas
 */
public class Categoria {
    private int idcategoria;
    private String cat;

    public Categoria() {
    }

    public Categoria(String cat) {
        this.cat = cat;
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }
    public Categoria loadCategoria(ResultSet rs) throws SQLException{
    Categoria categoria = new Categoria();
       categoria.setIdcategoria(rs.getInt("idcategoria"));
       categoria.setCat(rs.getString("categoria"));    
    return categoria;
    }
}
