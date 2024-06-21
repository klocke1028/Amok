package pets_amok;

public class RoboticDog extends Robotic implements Dog {

    public RoboticDog(String name, String description, int happiness, int health, int robotMaintenance) {
        super(name, description, happiness, health, robotMaintenance);

    }

    public void walkAllDogs() {
        happiness += 5;
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
