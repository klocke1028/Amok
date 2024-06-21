package pets_amok;

public class OrganicDog extends Organic implements Dog {
    int bathroomNeed = 15;

    public OrganicDog(String name, String description, int happiness, int hunger, int thirst, int health,
            int cleanliness, int bathroomNeed) {
        super(name, description, happiness, hunger, thirst, cleanliness, health);
        this.bathroomNeed = bathroomNeed;
    }

    public void feedOrganicPets() {
        hunger += 5;
    }

    public void waterOrganicPets() {
        thirst += 5;
    }

    public void walkAllDogs() {
        happiness += 5;
    }

    public void cleanCages() {
        cleanliness += 5;
    }

    public void letDogsDoBusiness() {
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

    @Override
    protected void getAllOrgPets() {

    }

}
