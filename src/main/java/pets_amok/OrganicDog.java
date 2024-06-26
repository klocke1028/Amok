package pets_amok;

public class OrganicDog extends Organic implements Dog {
    protected int bathroomNeed;
    protected int cageCleanliness = 0;

    public OrganicDog(String name, String description, int happiness, int hunger, int thirst, int health,
            int cleanliness, int bathroomNeed, int cageCleanliness) {
        super(name, description, happiness, hunger, thirst, health);
        this.bathroomNeed = bathroomNeed;
    }

    public int getBathroomNeed() {
        return bathroomNeed;
    }

    public void setBathroomNeed(int bathroomNeed) {
        this.bathroomNeed = bathroomNeed;
    }

    public int getCageCleanliness() {
        return cageCleanliness;
    }

    public void setCageCleanliness(int cageCleanliness) {
        this.cageCleanliness = cageCleanliness;
    }

    public void cleanCages() {
        cageCleanliness += 5;
    }

    public void letDogsDoBusiness() {
        bathroomNeed -= 5;
    }

    public void tick() {
        hunger += 2;
        thirst += 2;
        cageCleanliness -= 2;
        happiness -= 2;
        if (hunger >= 20 || thirst >= 20 || cageCleanliness >= 20 || bathroomNeed >= 20 || happiness <= 10) {
            health -= 2;
        }

    }

    @Override
    public void walkAllDogs() {
        happiness += 5;
        bathroomNeed -= 5;

    }

}
