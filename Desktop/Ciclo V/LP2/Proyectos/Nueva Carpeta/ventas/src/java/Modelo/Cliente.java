
package Modelo;


public class Cliente {
    private int idcliente;
    private String nombre;
    private String pais;
    private String tipo_de_pago;
    private String pedidos;
    private String estado;

    public Cliente() {
    }

    public Cliente(int idcliente, String nombre, String pais, String tipo_de_pago, String pedidos, String estado) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.pais = pais;
        this.tipo_de_pago = tipo_de_pago;
        this.pedidos = pedidos;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTipo_de_pago() {
        return tipo_de_pago;
    }

    public void setTipo_de_pago(String tipo_de_pago) {
        this.tipo_de_pago = tipo_de_pago;
    }

    public String getPedidos() {
        return pedidos;
    }

    public void setPedidos(String pedidos) {
        this.pedidos = pedidos;
    }
    
    
}
