package pets_amok;

import java.util.Map;
import java.util.HashMap;

public class VirtualPetShelter {

    private Map<String, VirtualPet> kateShelter = new HashMap<>();

    public Map<String, VirtualPet> getKateShelter() {
        return kateShelter;
    }

    public void setKateShelter(Map<String, VirtualPet> kateShelter) {
        this.kateShelter = kateShelter;
    }

    public VirtualPet findPetName(String name) {
        return kateShelter.get(name);
    }

    public void admitPet(VirtualPet newPet) {
        kateShelter.put(newPet.getName(), newPet);
    }

    public void adoptOutPet(String adoptablePet) {
        kateShelter.remove(adoptablePet);
    }

    public void playWithPet(String name) {
        kateShelter.get(name).playWithPet();
    }

    public void feedOrgPets() {
        for (Map.Entry<String, VirtualPet> virtualPetEntry : this.kateShelter.entrySet()) {
            if (virtualPetEntry instanceof Organic) {
                Organic orgPet = (Organic) virtualPetEntry;
                orgPet.feedOrganicPets();
            } else if (virtualPetEntry instanceof Robotic) {
                Robotic roboPet = (Robotic) virtualPetEntry;
                roboPet.tick();

            }
        }
    }

    public void waterOrgPets() {
        for (Map.Entry<String, VirtualPet> virtualPet : this.kateShelter.entrySet()) {
            if (virtualPet instanceof Organic) {
                Organic orgPet = (Organic) virtualPet;
                orgPet.waterOrganicPets();
            } else if (virtualPet instanceof Robotic) {
                Robotic roboPet = (Robotic) virtualPet;
                roboPet.tick();
            }
        }
    }

    public void changeLitterBox() {
        for (Map.Entry<String, VirtualPet> virtualPet : this.kateShelter.entrySet()) {
            if (virtualPet instanceof OrganicCat) {
                OrganicCat orgCat = (OrganicCat) virtualPet;
                orgCat.changeLitter();
            }
        }
    }

    public void walkAllDogs() {
        for (Map.Entry<String, VirtualPet> virtualPet : this.kateShelter.entrySet()) {
            if (virtualPet instanceof OrganicDog) {
                OrganicDog orgDog = (OrganicDog) virtualPet;
                orgDog.letDogsDoBusiness();
                orgDog.walkAllDogs();
            } else if (virtualPet instanceof RoboticDog) {
                RoboticDog roboDog = (RoboticDog) virtualPet;
                roboDog.walkAllDogs();
            }
        }
    }

    public void cleanCages() {
        for (Map.Entry<String, VirtualPet> virtualPet : this.kateShelter.entrySet()) {
            if (virtualPet instanceof OrganicDog) {
                OrganicDog orgDog = (OrganicDog) virtualPet;
                orgDog.cleanCages();
            }
        }
    }

    public void oilRoboticPets() {
        for (Map.Entry<String, VirtualPet> virtualPet : this.kateShelter.entrySet()) {
            if (virtualPet instanceof Robotic) {
                Robotic roboPet = (Robotic) virtualPet;
                roboPet.oilRoboticPets();
            }
        }
    }

    public void tickAllPets() {
        for (Map.Entry<String, VirtualPet> virtualPetEntry : this.kateShelter.entrySet()) {
            VirtualPet virtualPet = virtualPetEntry.getValue();
            virtualPet.tick();
        }
    }

}