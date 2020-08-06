
package Modelo;


public class Producto {
    private int idproducto;
    private String nombre;
    private int stock;
    private int pedidos;
    private int precio;
    private String estado;

    public Producto() {
    }

    public Producto(int idproducto, String nombre, int stock, int pedidos, int precio, String estado) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.stock = stock;
        this.pedidos = pedidos;
        this.precio = precio;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPedidos() {
        return pedidos;
    }

    public void setPedidos(int pedidos) {
        this.pedidos = pedidos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
