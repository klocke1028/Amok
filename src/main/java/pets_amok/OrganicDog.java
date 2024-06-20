package pets_amok;

public class OrganicDog extends Dog implements Organic {
    int hunger = 15;
    int thirst = 15;
    int bathroomNeed = 15;
    int cleanliness = 15;

    public OrganicDog(String name, String description, int happiness, int health, int hunger, int thirst, int bathroomNeed, int cleanliness) {
        super (name, description, happiness, health);
        this.hunger = hunger;
        this.thirst = thirst;
        this.bathroomNeed = bathroomNeed;
        this.cleanliness = cleanliness;
    }

    public void feedOrganicPets() {
        hunger += 5;
    }

    public void waterOrganicPets() {
        thirst += 5;
    }

    public void cleanCages() {
        cleanliness += 5;
    }

    public void letDogsDoBusiness () {
        bathroomNeed -= 5;
    }

    public void tick() {
        hunger -= 1;
        thirst -= 1;
        cleanliness -= 1;
        happiness -= 1;
        if (hunger < 10 || thirst < 10 || cleanliness < 10 || bathroomNeed > 20 || happiness < 10) {
            health -= 2;
        }

    }

}
