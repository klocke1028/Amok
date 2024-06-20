package pets_amok;

public class OrganicCat extends Cat implements Organic {

    int hunger = 10;
    int thirst = 10;
    int cleanliness = 10;

    public OrganicCat(String name, String description, int happiness, int health, int hunger, int thirst, int cleanliness) {
        super (name, description, happiness, health);
        this.hunger = hunger;
        this.thirst = thirst;
        this.cleanliness = cleanliness;
    }

    public void feedOrganicPets() {
        hunger += 5;
    }

    public void waterOrganicPets() {
        thirst += 5;
    }

    public void changeLitter() {
        cleanliness += 5;
    }

    public void tick() {
        hunger -= 1;
        thirst -= 1;
        cleanliness -= 1;
        happiness -= 1;
        if (hunger < 10 || thirst < 10 || cleanliness < 10 || happiness < 10) {
            health -= 2;
        }

    }

    

}
