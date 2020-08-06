
package Modelo;


public class Sugerencias {
    private int idsugerencia;
    private String mensaje;
    private int idpersona;
    private int idarea;
    private int idrol;
    private String estado;

    public Sugerencias() {
    }

    public Sugerencias(int idsugerencia, String mensaje, int idpersona, int idarea, int idrol, String estado) {
        this.idsugerencia = idsugerencia;
        this.mensaje = mensaje;
        this.idpersona = idpersona;
        this.idarea = idarea;
        this.idrol = idrol;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdsugerencia() {
        return idsugerencia;
    }

    public void setIdsugerencia(int idsugerencia) {
        this.idsugerencia = idsugerencia;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public int getIdarea() {
        return idarea;
    }

    public void setIdarea(int idarea) {
        this.idarea = idarea;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }
    
    
}
