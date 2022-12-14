package controller;
import java.sql.ResultSet;
import java.sql.Statement;
import com.google.gson.Gson;
import beans.Usuario;
import connection.DBConnection;

public class UsuarioController implements IUsuarioController{
    @Override
    public String login(String username, String clave){
        Gson gson = new Gson();
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM usuario WHERE username = '" + username + 
                "' AND clave = '" + clave + "'";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String ciudad = rs.getString("ciudad");
                String direccion = rs.getString("direccion");
                String email = rs.getString("email");
                int numero = rs.getInt("numero");
                double saldo = rs.getDouble("saldo");
                
                Usuario usuario = new Usuario(username, clave, nombres, apellidos, ciudad, direccion, email, numero, saldo);
                return gson.toJson(usuario);
            }
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
        return "false";
    }
}
