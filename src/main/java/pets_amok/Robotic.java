package pets_amok;

public abstract class Robotic extends VirtualPet {
    int robotMaintenance;

    public Robotic(String name, String description, int happiness, int health, int robotMaintenance) {
        super(name, description, happiness, health);
    }

    public int getRobotMaintenance() {
        return robotMaintenance;
    }

    public void setRobotMaintenance(int robotMaintenance) {
        this.robotMaintenance = robotMaintenance;
    }

    public void oilRoboticPets() {
        robotMaintenance += 5;
        happiness += 5;
    }

    public void tick() {
    }

}
