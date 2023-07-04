import java.util.Scanner;

public class VentaPlantasJardin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VentaPlantasJardin ventaPlantas = new VentaPlantasJardin();

        System.out.println("Bienvenido a la tienda de plantas de jardín");
        System.out.println("------------------------------------------");

        int opcion;
        do {
            ventaPlantas.mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el salto de línea después de leer la opción

            switch (opcion) {
                case 1:
                    ventaPlantas.registrarPlanta(sc);
                    break;
                case 2:
                    ventaPlantas.mostrarInventario();
                    break;
                case 3:
                    ventaPlantas.realizarVenta(sc);
                    break;
                case 4:
                    System.out.println("Gracias por utilizar nuestro sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
            System.out.println();
        } while (opcion != 4);

        sc.close();
    }

    public void mostrarMenu() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Registrar planta");
        System.out.println("2. Mostrar inventario");
        System.out.println("3. Realizar venta");
        System.out.println("4. Salir");
        System.out.print("Opción: ");
    }

    public void registrarPlanta(Scanner sc) {
        System.out.println("Registro de planta:");
        // Aquí puedes agregar la lógica para capturar los datos de la planta a registrar
        // y almacenarlos en tu estructura de datos de inventario
    }

    public void mostrarInventario() {
        System.out.println("Inventario de plantas:");
        // Aquí puedes agregar la lógica para mostrar el inventario de plantas
        // que has registrado previamente
    }

    public void realizarVenta(Scanner sc) {
        System.out.println("Realizar venta:");
        // Aquí puedes agregar la lógica para realizar una venta de plantas
        // según el inventario y los datos proporcionados por el usuario
    }
}

