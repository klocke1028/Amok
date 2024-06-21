package pets_amok;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        VirtualPetShelter availablePets = new VirtualPetShelter();
        VirtualPet orgCat1 = new OrganicCat("Gomez", "Organic Cat", 15, 15, 15, 15, 15);
        VirtualPet orgCat2 = new OrganicCat("Fester", "Organic Cat", 15, 15, 15, 15, 15);
        VirtualPet roboDog1 = new RoboticDog("Bo", "Robotic Dog", 10, 10, 10);

        availablePets.admitPet(orgCat1);
        availablePets.admitPet(orgCat2);
        availablePets.admitPet(roboDog1);

        System.out.println("Welcome to Kate's Animal Shelter! We really appreciate you volunteering.");
        System.out.println("Here is a list of current shelter animals and their stats.");

        int selectOption;

        do {
            System.out.println("Organic Pet Stats:");
            System.out.println("Name | Description | Happiness | Hunger  | Thirst | Cleanliness  | ");
            for (VirtualPet : availablePets.getAllOrgPets()) {
                System.out.println(availablePets.getName() + " | " + availablePets.getDescription() + " | " + availablePets.getHunger() + " | "
                        + availablePets.getThirst() + " | " + availablePets.getBoredom());
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

            } else if (selectOption == 4) {
                availablePets.cleanCages();

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
                    VirtualPet newOrgCat = new OrganicCat(orgCatName, description, 15, 15, 15, 15, 15);
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
                    VirtualPet newOrgDog = new OrganicDog(orgDogName, description, 15, 15, 15, 15, 15, 15);
                    availablePets.admitPet(newOrgDog);
                } else if (petType.contains("D")) {
                    System.out.println("What is their name?");
                    String roboDogName = userInput.nextLine();
                    System.out.println("Describe them");
                    String description = userInput.nextLine();
                    VirtualPet newRoboDog = new RoboticDog(roboDogName, description, 15, 15, 15);
                    availablePets.admitPet(newRoboDog);
                }
            
            
    } while (true);

        userInput.close();
    }

}
}

