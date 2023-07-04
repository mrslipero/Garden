import java.util.ArrayList;

public class GardenPlantSalesSystem {
    private GardenPlantStore plantStore;

    public GardenPlantSalesSystem() {
        plantStore = new GardenPlantStore();
    }

    public void addPlant(String name, double price) {
        GardenPlant newPlant = new GardenPlant(name, price);
        plantStore.addPlant(newPlant);
    }

    public void displayAllPlants() {
        ArrayList<GardenPlant> plants = plantStore.getAllPlants();
        for (GardenPlant plant : plants) {
            System.out.println(plant);
        }
    }

    public GardenPlant searchPlantByName(String name) {
        return plantStore.searchPlantByName(name);
    }

    public boolean sellPlant(String name) {
        return plantStore.sellPlant(name);
    }
}
