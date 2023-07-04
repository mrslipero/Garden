import java.util.Scanner;

public class Jardin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPlantas;
        Planta[] plantas = new Planta[50];
        String nombre, tipo;
        double precio;
        double precioTotal = 0;

        System.out.println("Digite el número de plantas: ");
        numPlantas = sc.nextInt();

        for (int i = 0; i < numPlantas; i++) {
            System.out.println("Digite el nombre de la planta: ");
            nombre = sc.next();
            System.out.println("Digite el tipo de planta: ");
            tipo = sc.next();
            System.out.println("Digite el precio de la planta: ");
            precio = sc.nextDouble();

            Planta planta = new Planta(nombre, tipo, precio);
            plantas[i] = planta;
        }

        for (int i = 0; i < numPlantas; i++) {
            precioTotal += plantas[i].getPrecio();
        }

        System.out.println("\nEl precio total de las plantas es: " + precioTotal);
    }
}
