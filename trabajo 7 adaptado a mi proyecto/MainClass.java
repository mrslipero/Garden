import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GardenPlantSalesSystem plantSystem = new GardenPlantSalesSystem();

        int menuOption;
        do {
            System.out.println("\n---- Menú ----");
            System.out.println("1. Agregar una planta");
            System.out.println("2. Mostrar todas las plantas");
            System.out.println("3. Buscar planta por nombre");
            System.out.println("4. Vender una planta");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            menuOption = sc.nextInt();

            switch (menuOption) {
                case 1:
                    sc.nextLine();
                    System.out.print("Ingrese el nombre de la planta: ");
                    String plantName = sc.nextLine();
                    System.out.print("Ingrese el precio de la planta: ");
                    double plantPrice = sc.nextDouble();
                    plantSystem.addPlant(plantName, plantPrice);
                    System.out.println("Planta agregada correctamente");
                    break;
                case 2:
                    System.out.println("\n---- Plantas disponibles ----");
                    plantSystem.displayAllPlants();
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("Ingrese el nombre de la planta a buscar: ");
                    String searchName = sc.nextLine();
                    GardenPlant foundPlant = plantSystem.searchPlantByName(searchName);
                    if (foundPlant != null) {
                        System.out.println("\nPlanta encontrada:");
                        System.out.println(foundPlant);
                    } else {
                        System.out.println("Planta no encontrada");
                    }
                    break;
                case 4:
                    sc.nextLine();
                    System.out.print("Ingrese el nombre de la planta a vender: ");
                    String plantToSell = sc.nextLine();
                    boolean sold = plantSystem.sellPlant(plantToSell);
                    if (sold) {
                        System.out.println("Venta realizada correctamente");
                    } else {
                        System.out.println("No se pudo realizar la venta. La planta no está disponible");
                    }
                    break;
                default:
                    System.out.println("Ha seleccionado Salir");
            }
        } while (menuOption != 5);
    }
}
