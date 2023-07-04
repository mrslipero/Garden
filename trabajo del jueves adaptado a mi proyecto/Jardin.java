import java.util.Scanner;

public class Jardin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroPlantas = 0;
        Planta[] lasPlantas = new Planta[50];

        String identificacion, nombre, especie;
        double precio;
        int stock;
        double totalVentas = 0;

        while (true) {
            System.out.println("\nMenu de opciones:");
            System.out.println("1. Adicionar una planta");
            System.out.println("2. Realizar una venta");
            System.out.println("3. Mostrar el total de ventas");
            System.out.println("4. Salir");
            System.out.println("Escoja una opción:");
            int opcionMenu = sc.nextInt();

            if (opcionMenu == 1) {
                System.out.println("Digite la identificación de la planta:");
                identificacion = sc.next();
                System.out.println("Digite el nombre de la planta:");
                nombre = sc.next();
                System.out.println("Digite la especie de la planta:");
                especie = sc.next();
                System.out.println("Digite el precio de la planta:");
                precio = sc.nextDouble();
                System.out.println("Digite el stock de la planta:");
                stock = sc.nextInt();

                Planta unaPlanta = new Planta(identificacion, nombre, especie, precio, stock);
                lasPlantas[numeroPlantas] = unaPlanta;
                numeroPlantas++;
            } else if (opcionMenu == 2) {
                System.out.println("Digite la identificación de la planta a vender:");
                String identificacionVenta = sc.next();
                System.out.println("Digite la cantidad a vender:");
                int cantidadVenta = sc.nextInt();

                boolean encontrado = false;
                for (int i = 0; i < numeroPlantas; i++) {
                    if (lasPlantas[i].identificacion.equals(identificacionVenta)) {
                        encontrado = true;
                        if (lasPlantas[i].stock >= cantidadVenta) {
                            double subtotal = lasPlantas[i].precio * cantidadVenta;
                            System.out.println("Venta realizada: Subtotal = " + subtotal);
                            totalVentas += subtotal;
                            lasPlantas[i].stock -= cantidadVenta;
                        } else {
                            System.out.println("No hay suficiente stock para realizar la venta");
                        }
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("La planta no existe en el inventario");
                }
            } else if (opcionMenu == 3) {
                System.out.println("El total de ventas es: " + totalVentas);
            } else if (opcionMenu == 4) {
                System.out.println("Saliendo del programa...");
                break;
            } else {
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }
}

