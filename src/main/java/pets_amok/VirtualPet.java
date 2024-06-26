package pets_amok;

public abstract class VirtualPet {
    protected String name;
    protected String description;
    protected int happiness;
    protected int health;
    

    public VirtualPet(String name, String description, int happiness, int health) {
        this.name = name;
        this.description = description;
        this.happiness = happiness;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int boredom) {
        this.happiness = boredom;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void playWithPet() {
        happiness += 5;
    }

    public void tick() {

    }

 
}
