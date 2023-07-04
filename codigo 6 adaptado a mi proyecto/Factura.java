import java.time.LocalDateTime;
import java.util.List;

public class Factura {
    private LocalDateTime fecha;
    private Cliente cliente;
    private List<PlantaJardin> plantasVendidas;
    // Otros atributos de la factura

    public Factura(Cliente cliente, List<PlantaJardin> plantasVendidas) {
        this.fecha = LocalDateTime.now();
        this.cliente = cliente;
        this.plantasVendidas = plantasVendidas;
    }

    // Otros métodos relacionados a la factura
}

