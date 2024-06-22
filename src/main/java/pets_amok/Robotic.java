package pets_amok;

public abstract class Robotic extends VirtualPet {
    int robotMaintenance = 15;

    public Robotic(String name, String description, int happiness, int health, int robotMaintenance) {
        super(name, description, happiness, health);
    }

    public void oilRoboticPets() {
        robotMaintenance += 5;
    }

    public void tick() {
    }

}
