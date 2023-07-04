import java.util.ArrayList;
import java.util.List;

public class InventarioPlantas {
    private List<PlantaJardin> inventario;

    public InventarioPlantas() {
        inventario = new ArrayList<>();
    }

    public void agregarPlanta(PlantaJardin planta) {
        inventario.add(planta);
    }

    public void mostrarInventario() {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío");
        } else {
            System.out.println("Inventario de plantas:");
            for (PlantaJardin planta : inventario) {
                System.out.println(planta.getNombre() + " - Precio: $" + planta.getPrecio());
            }
        }
    }
}
