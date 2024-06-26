package pets_amok;

public abstract class Organic extends VirtualPet {
    protected int hunger;
    protected int thirst;

    public Organic(String name, String description, int happiness, int hunger, int thirst, int health) {
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
    

    public void feedOrganicPets() {
        hunger -= 5;
    }

    public void waterOrganicPets() {
        thirst -= 5;
    }

    public void tick() {
    }

}
