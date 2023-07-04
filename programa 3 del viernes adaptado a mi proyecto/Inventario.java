import java.util.ArrayList;
public class Inventario {
    private ArrayList<Planta> plantas;
    
    public Inventario() {
        plantas = new ArrayList<>();
    }
    
    public void agregarPlanta(Planta planta) {
        plantas.add(planta);
    }
    
    public void mostrarPlantas() {
        for (Planta planta : plantas) {
            System.out.println(planta.getNombre() + " - Precio: $" + planta.getPrecio());
        }
    }
    
    public Planta buscarPlanta(String nombrePlanta) {
        for (Planta planta : plantas) {
            if (planta.getNombre().equals(nombrePlanta)) {
                return planta;
            }
        }
        return null;
    }
}
