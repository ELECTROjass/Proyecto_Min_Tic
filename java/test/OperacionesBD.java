package test;

import beans.Libro;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {
    
    public static void main(String[] args) {
        listarLibro();
    }
    public static void actualizarLibro(int id, String categoria){
        DBConnection con = new DBConnection();
        String sql = "UPDATE libro SET categoria = '" + categoria + "' WHERE id =" + id;
        try {
            Statement st = con.getConnection() .createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
    }
    public static void listarLibro(){
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM libro"; 
        try {
            Statement st = con.getConnection() .createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String categoria = rs.getString("categoria");
                int num_paginas = rs.getInt("num_paginas");
                int inventario = rs.getInt("inventario");
                String descripcion = rs.getString("descripcion");
                String autor = rs.getString("autor");
                String editorial = rs.getString("editorial");
                Libro libro = new Libro(id, titulo,categoria,num_paginas,inventario,descripcion,autor,editorial);
                System.out.println(libro.toString());
            }
            st.executeQuery(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }  
    }
    
}
