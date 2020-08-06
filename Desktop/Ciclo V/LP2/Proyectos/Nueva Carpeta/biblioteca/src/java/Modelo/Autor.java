
package Modelo;


public class Autor {
    private int idautor;
    private String nombres;
    private String apellidos;
    private String f_nac;
    private String nacionalidad;
    private String estado;

    public Autor() {
    }

    public Autor(int idautor, String nombres, String apellidos, String f_nac, String nacionalidad, String estado) {
        this.idautor = idautor;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.f_nac = f_nac;
        this.nacionalidad = nacionalidad;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdautor() {
        return idautor;
    }

    public void setIdautor(int idautor) {
        this.idautor = idautor;
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

    public String getF_nac() {
        return f_nac;
    }

    public void setF_nac(String f_nac) {
        this.f_nac = f_nac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
}
