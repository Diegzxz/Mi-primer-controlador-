package model;

public class Gamer {
    private int idGamer;
    private String nombre;
    private String usuario;
    private String password;
    private int nivel;

    // Constructor sin parámetros
    public Gamer() {
    }

    // Constructor con parámetros
    public Gamer(int idGamer, String nombre, String usuario, String password, int nivel) {
        this.idGamer = idGamer;
        this.nombre = nombre;
        this.usuario = usuario;
        this.password = password;
        this.nivel = nivel;
    }

    // Getters y Setters
    public int getIdGamer() {
        return idGamer;
    }

    public void setIdGamer(int idGamer) {
        this.idGamer = idGamer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
