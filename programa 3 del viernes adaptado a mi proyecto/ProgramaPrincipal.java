public class ProgramaPrincipal {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Planta planta1 = new Planta("Rosa", 10.99);
        Planta planta2 = new Planta("Orquídea", 15.99);
        inventario.agregarPlanta(planta1);
        inventario.agregarPlanta(planta2);
        
        Cliente cliente = new Cliente("Juan Pérez", "Calle Principal 123");
        
        Planta plantaBuscada = inventario.buscarPlanta("Rosa");
        if (plantaBuscada != null) {
            int cantidad = 2;
            Venta venta = new Venta(plantaBuscada, cliente, cantidad);
            double total = venta.calcularTotal();
            System.out.println("Cliente: " + cliente.getNombre());
            System.out.println("Dirección: " + cliente.getDireccion());
            System.out.println("Planta: " + plantaBuscada.getNombre());
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Total: $" + total);
        } else {
            System.out.println("La planta no se encuentra disponible en el inventario.");
        }
    }
}
