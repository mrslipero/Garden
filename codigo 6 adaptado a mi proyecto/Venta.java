import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Venta {
    private LocalDateTime fecha;
    private List<PlantaJardin> plantasVendidas;
    // Otros atributos de la venta

    public Venta() {
        fecha = LocalDateTime.now();
        plantasVendidas = new ArrayList<>();
    }

    public void agregarPlanta(PlantaJardin planta) {
        plantasVendidas.add(planta);
    }

    // Otros métodos relacionados a la venta
}
