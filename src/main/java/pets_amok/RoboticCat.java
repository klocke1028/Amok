package pets_amok;

public class RoboticCat extends Robotic implements Cat {

    public RoboticCat(String name, String description, int happiness, int health, int robotMaintenance) {
        super(name, description, happiness, health, robotMaintenance);
    }

    public void tick() {
        robotMaintenance -= 1;
        happiness -= 1;
        if (robotMaintenance < 10 || happiness < 10) {
            health -= 2;
        }
    }

    @Override
    protected void getAllRoboPets() {

    }
}
