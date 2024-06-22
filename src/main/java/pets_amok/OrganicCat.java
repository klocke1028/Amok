package pets_amok;

public class OrganicCat extends Organic implements Cat {

    public OrganicCat(String name, String description, int happiness, int hunger, int thirst, int health,
            int cleanliness) {
        super(name, description, happiness, hunger, thirst, cleanliness, health);
    }

    public int getCleanliness() {
        return cleanliness;
    }

    public void setCleanliness(int cleanliness) {
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
