import java.util.Scanner;

public class VentaJardin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numClientes;
        Jardin jardin = new Jardin();
        String identificacion, nombre, direccion;
        
        System.out.println("Bienvenido al programa de venta de jardín");
        System.out.println("========================================");
        
        System.out.println("Ingrese el número de clientes: ");
        numClientes = sc.nextInt();
        
        for (int i = 0; i < numClientes; i++) {
            System.out.println("Cliente #" + (i + 1));
            System.out.println("Ingrese la identificación del cliente: ");
            identificacion = sc.next();
            System.out.println("Ingrese el nombre del cliente: ");
            nombre = sc.next();
            System.out.println("Ingrese la dirección del cliente: ");
            direccion = sc.next();
            
            Cliente cliente = new Cliente(identificacion, nombre, direccion);
            jardin.agregarCliente(cliente);
            
            System.out.println("Cliente registrado correctamente.");
            System.out.println("--------------------------------");
        }
        
        System.out.println("\nLista de clientes registrados:");
        jardin.mostrarClientes();
    }
}
