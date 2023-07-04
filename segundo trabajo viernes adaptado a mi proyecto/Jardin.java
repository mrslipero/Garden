public class Jardin {
    private Cliente[] clientes;
    private int numClientes;
    
    public Jardin() {
        clientes = new Cliente[50];
        numClientes = 0;
    }
    
    public void agregarCliente(Cliente cliente) {
        clientes[numClientes] = cliente;
        numClientes++;
    }
    
    public void mostrarClientes() {
        for (int i = 0; i < numClientes; i++) {
            Cliente cliente = clientes[i];
            System.out.println("Cliente #" + (i + 1));
            System.out.println("Identificación: " + cliente.getIdentificacion());
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Dirección: " + cliente.getDireccion());
            System.out.println("--------------------------------");
        }
    }
}
