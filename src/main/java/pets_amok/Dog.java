package pets_amok;

public class Dog extends VirtualPet{
    public Dog(String name, String description, int happiness, int health) {
        super (name, description, happiness, health);

}

public void walkAllDogs() {
    happiness += 5;
}
}
