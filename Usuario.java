package beans;
public class Usuario {
    private String username;
    private String clave;
    private String nombres;
    private String apellidos;
    private String ciudad;
    private String direccion;
    private String email;
    private int numero;
    private double saldo;

    public Usuario(String username, String clave, String nombres, String apellidos, String ciudad, String direccion, String email, int numero, double saldo) {
        this.username = username;
        this.clave = clave;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.email = email;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "username=" + username + ", clave=" + clave + ", nombres=" + nombres + ", apellidos=" + apellidos + ", ciudad=" + ciudad + ", direccion=" + direccion + ", email=" + email + ", numero=" + numero + ", saldo=" + saldo + '}';
    }
      
    
}
