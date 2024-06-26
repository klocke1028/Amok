package pets_amok;

public class OrganicCat extends Organic implements Cat {
    protected static int litterBoxFullness = 0;

    public OrganicCat(String name, String description, int happiness, int hunger, int thirst, int health) {
        super(name, description, happiness, hunger, thirst, health);
    }

    public static int getLitterBoxFullness() {
        return litterBoxFullness;
    }

    public static void setLitterBoxFullness(int litterBoxFullness) {
        OrganicCat.litterBoxFullness = litterBoxFullness;
    }

    public void changeLitterBox() {
        litterBoxFullness -= 5;
    }

    public void tick() {
        hunger += 2;
        thirst += 2;
        litterBoxFullness += 2;
        happiness -= 2;
        if (hunger >= 20 || thirst >= 20 || litterBoxFullness >= 20 || happiness <= 10) {
            health -= 2;
        }

    }

}
