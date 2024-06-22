package pets_amok;

public abstract class Organic extends VirtualPet {

    protected int hunger = 15;
    protected int thirst = 15;
    protected int cleanliness = 15;

    public Organic(String name, String description, int happiness, int hunger, int thirst, int cleanliness,
            int health) {
        super(name, description, happiness, health);

    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getCleanliness() {
        return cleanliness;
    }

    public void setCleanliness(int cleanliness) {
        this.cleanliness = cleanliness;
    }

    public void feedOrganicPets() {

    }

    public void waterOrganicPets() {

    }

}
