package pets_amok;

public class RoboticCat extends Cat implements Robotic {

    int robotMaintenance = 15;
    
    public RoboticCat(String name, String description, int happiness, int health, int robotMaintenance) {
        super (name, description, happiness, health);
}

public void oilRoboticPets() {
    robotMaintenance += 5;
}

public void tick () {
    robotMaintenance -= 1;
    happiness -= 1;
    if (robotMaintenance < 10 || happiness < 10) {
        health -= 2;
    }
}
}
