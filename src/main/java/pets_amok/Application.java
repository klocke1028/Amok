package pets_amok;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        VirtualPetShelter availablePets = new VirtualPetShelter();
        VirtualPet pet1 = new VirtualPet("Gomez", "Organic", 10, 10, 10, 10);
        VirtualPet pet2 = new VirtualPet("Fester", "Organic", 10, 10, 10, 10);
        VirtualPet pet3 = new VirtualPet("Bo", "Robotic", 10, 10, 10, 10);

        availablePets.admitPet(pet1);
        availablePets.admitPet(pet2);
        availablePets.admitPet(pet3);

        System.out.println("Welcome to Kate's Animal Shelter! We really appreciate you volunteering.");
        System.out.println("Here is a list of current shelter animals and their stats.");

        int selectOption;

        do {
            System.out.println("Name | Description | Hunger | Thirst | Boredom  | Health");
            for (VirtualPet availablePet : availablePets.getAllPets()) {
                System.out.println(availablePet.getName() + " | " + availablePet.getDescription() + " | " + availablePet.getHunger() + " | "
                        + availablePet.getThirst() + " | " + availablePet.getBoredom());
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
                System.out.println("Which pet would you like to play with?");
                String name = userInput.nextLine();
                availablePets.findPetName(name).playWithPet();

            } else if (selectOption == 7) {
                System.out.println("Which pet would you like to adopt out?");
                String name = userInput.nextLine();
                availablePets.adoptOutPet(name);
                System.out.println("Goodbye " + name);
                

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
                } else if (petType.contains("B")) {
                    System.out.println("What is their name?");
                    String roboCatName = userInput.nextLine();
                    VirtualPet newRoboCat = new RoboticCat(roboCatName, roboCatName, selectOption, selectOption);
                }
            
            
    } while (true);

        userInput.close();
    }

}

