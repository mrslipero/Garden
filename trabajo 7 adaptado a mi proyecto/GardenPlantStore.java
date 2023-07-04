import java.util.ArrayList;

public class GardenPlantStore {
    private ArrayList<GardenPlant> plants;

    public GardenPlantStore() {
        plants = new ArrayList<>();
    }

    public ArrayList<GardenPlant> getAllPlants() {
        return plants;
    }

    public void addPlant(GardenPlant plant) {
        plants.add(plant);
    }

    public GardenPlant searchPlantByName(String name) {
        for (GardenPlant plant : plants) {
            if (plant.getName().equalsIgnoreCase(name)) {
                return plant;
            }
        }
        return null;
    }

    public boolean sellPlant(String name) {
        for (GardenPlant plant : plants) {
            if (plant.getName().equalsIgnoreCase(name)) {
                plants.remove(plant);
                return true;
            }
        }
        return false;
    }
}
