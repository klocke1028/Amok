package pets_amok;

import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        VirtualPetShelter availablePets = new VirtualPetShelter();
        VirtualPet orgCat1 = new OrganicCat("Gomez", "Organic Cat", 15, 15, 15, 15);
        VirtualPet orgDog1 = new OrganicDog("Max", "Organic Dog", 15, 15, 15, 15, 15, 15, 15);
        VirtualPet roboDog1 = new RoboticDog("Bo", "Robotic Dog", 15, 10, 10);
        VirtualPet roboCat1 = new RoboticCat("Fluffy", "Robotic Cat", 15, 15, 15);

        availablePets.admitPet(orgCat1);
        availablePets.admitPet(orgDog1);
        availablePets.admitPet(roboDog1);
        availablePets.admitPet(roboCat1);

        do {
            System.out.println("Organic Pet Stats:");
            System.out.println("Litter Box Fullness: " + OrganicCat.getLitterBoxFullness());
            System.out.println("Name | Description | Happiness | Hunger | Thirst | Health |");
            for (Map.Entry<String, VirtualPet> virtualPet : availablePets.getKateShelter().entrySet()) {
                if (virtualPet instanceof Organic) {
                    Organic orgPet = (Organic) virtualPet;
                    System.out.println(orgPet.getName() + " | " + orgPet.getDescription() + " | "
                            + orgPet.getHappiness() + " | " + orgPet.getHunger() + " | " + orgPet.getThirst() + " | "
                            + orgPet.getHealth() + " | ");
                } else if (virtualPet instanceof Robotic) {
                    Robotic roboPet = (Robotic) virtualPet;
                    System.out.println("Robotic Pet Stats:");
                    System.out.println("Name | Description | Happiness | Health | Maintenance |");
                    System.out.println(
                            roboPet.getName() + " | " + roboPet.getDescription() + " | " + roboPet.getHappiness()
                                    + " | " + roboPet.getHealth() + " | " + roboPet.getRobotMaintenance());
                }
            }

            System.out.println("What would you like to do?");
            System.out.println("[1] Feed the organic pets.");
            System.out.println("[2] Give the organic pets water.");
            System.out.println("[3] Clean the litter box.");
            System.out.println("[4] Clean the dog cages.");
            System.out.println("[5] Walk all of the dogs.");
            System.out.println("[6] Oil the robotic pets.");
            System.out.println("[7] to adopt out a pet.");
            System.out.println("[8] to admit a new pet to the shelter.");
            System.out.println("[9] to exit the game.");
            int selectOption;

            selectOption = userInput.nextInt();
            userInput.nextLine();

            if (selectOption == 9) {
                System.out.println("Thanks for playing! See you soon!");
                System.exit(selectOption);
                break;
            } else if (selectOption == 1) {
                availablePets.feedOrgPets();

            } else if (selectOption == 2) {
                availablePets.waterOrgPets();

            } else if (selectOption == 3) {
                availablePets.changeLitterBox();
                System.out.println("The litter box is much cleaner.");

            } else if (selectOption == 4) {
                availablePets.cleanCages();
                System.out.println("The dog cages smell much better.");

            } else if (selectOption == 5) {
                availablePets.walkAllDogs();

            } else if (selectOption == 6) {
                availablePets.oilRoboticPets();

            } else if (selectOption == 7) {
                System.out.println("Which pet would you like to adopt out?");
                String name = userInput.nextLine();
                availablePets.adoptOutPet(name);
                System.out.println("Goodbye " + name + "!");

            } else if (selectOption == 8) {
                System.out.println("Please tell us the pet's type.");
                System.out.println("[A] for organic cat.");
                System.out.println("[B] for robotic cat.");
                System.out.println("[C] for organic dog.");
                System.out.println("[D] for robotic dog.");
                String petType = userInput.nextLine();
                if (petType.contains("A")) {
                    System.out.println("What is their name?");
                    String orgCatName = userInput.nextLine();
                    System.out.println("Describe them.");
                    String description = userInput.nextLine();
                    VirtualPet newOrgCat = new OrganicCat(orgCatName, description, 15, 15, 15, 15);
                    availablePets.admitPet(newOrgCat);
                    System.out.println("Hello " + orgCatName);
                } else if (petType.contains("B")) {
                    System.out.println("What is their name?");
                    String roboCatName = userInput.nextLine();
                    System.out.println("Describe them.");
                    String description = userInput.nextLine();
                    VirtualPet newRoboCat = new RoboticCat(roboCatName, description, 15, 15, 15);
                    availablePets.admitPet(newRoboCat);
                    System.out.println("Hello " + roboCatName);
                } else if (petType.contains("C")) {
                    System.out.println("What is their name?");
                    String orgDogName = userInput.nextLine();
                    System.out.println("Describe them.");
                    String description = userInput.nextLine();
                    VirtualPet newOrgDog = new OrganicDog(orgDogName, description, 15, 15, 15, 15, 15, 15, 15);
                } else if (petType.contains("D")) {
                    System.out.println("What is their name?");
                    String roboDogName = userInput.nextLine();
                    System.out.println("Describe them");
                    String description = userInput.nextLine();
                    VirtualPet newRoboDog = new RoboticDog(roboDogName, description, 15, 15, 15);
                    availablePets.admitPet(newRoboDog);
                }

            }
        } while (true);

        userInput.close();
    }


}
