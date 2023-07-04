public class Venta {
    private Planta planta;
    private Cliente cliente;
    private int cantidad;
    
    public Venta(Planta planta, Cliente cliente, int cantidad) {
        this.planta = planta;
        this.cliente = cliente;
        this.cantidad = cantidad;
    }
    
    public double calcularTotal() {
        return planta.getPrecio() * cantidad;
    }
}
