package _Extra_Exercises._candidate_management.controllers;

import _Extra_Exercises._candidate_management.services.impl.ExperienceServiceImpl;
import _Extra_Exercises._candidate_management.services.impl.FresherServiceImpl;

import java.util.Scanner;

public class CandidateController {
    static Scanner scanner = new Scanner(System.in);
    static ExperienceServiceImpl experienceService = new ExperienceServiceImpl();
    static FresherServiceImpl fresherService = new FresherServiceImpl();

    public static void displayMainMenu() {
        int choose;
        while (true) {
            try {
                System.out.println("_____MENU_____\n" +
                        "1. Display Candidate.\n" +
                        "2. Add Candidate.\n" +
                        "3. Remove Candidate.\n" +
                        "4. Find Candidate.\n" +
                        "5. Exit.\n" +
                        "Choose Option: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        displayMenu();
                        break;
                    case 2:
                        addMenu();
                        break;
                    case 3:
                        removeMenu();
                        break;
                    case 4:
                        findMenu();
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.err.println("Error. Enter Again: ");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Error: Enter Again: ");
            }
        }
    }

    public static void displayMenu() {
        int choose;
        while (true) {
            try {
                System.out.println("_____DISPLAY_____\n" +
                        "1. Display ALl Candidate.\n" +
                        "2. Display Experience.\n" +
                        "3. Display Fresher.\n" +
                        "4. Return Main Menu.\n" +
                        "Choose Option: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("List All Candidate: ");
                        experienceService.display();
                        fresherService.display();
                        break;
                    case 2:
                        System.out.println("List Experience: ");
                        experienceService.display();
                        break;
                    case 3:
                        System.out.println("List Fresher: ");
                        fresherService.display();
                        break;
                    case 4:
                        System.out.println("Return Main Menu: ");
                        displayMainMenu();
                        return;
                    default:
                        System.err.println("Error: Enter Again: ");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.err.println("Error: Incorrect Format.Enter Again: ");
            }
        }
    }

    public static void addMenu() {
        int choose;
        while (true) {
            try {
                System.out.println("_____Add Menu_____\n" +
                        "1. Add Experience.\n" +
                        "2. Add Fresher.\n" +
                        "3. Return Main Menu.\n" +
                        "Choose Option: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Add Experience: ");
                        experienceService.add();
                        break;
                    case 2:
                        System.out.println("Add Fresher: ");
                        fresherService.add();
                        break;
                    case 3:
                        System.out.println("Return Main Menu: ");
                        displayMainMenu();
                        return;
                    default:
                        System.err.println("Error. Enter Again: ");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Enter Again: ");
            }
        }
    }

    public static void removeMenu() {
        int choose;
        while (true) {
            try {
                System.out.println("_____Remove Menu_____\n" +
                        "1. Remove Experience.\n" +
                        "2. Remove Fresher.\n" +
                        "3. Return Main Menu.\n" +
                        "Choose Option: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Remove Experience: ");
                        experienceService.remove();
                        break;
                    case 2:
                        System.out.println("Remove Fresher: ");
                        fresherService.remove();
                        break;
                    case 3:
                        System.out.println("Return Main Menu: ");
                        displayMainMenu();
                        return;
                    default:
                        System.err.println("Error. Enter Again: ");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Enter Again: ");
            }
        }
    }

    public static void findMenu() {
        int choose;
        while (true) {
            try {
                System.out.println("_____Find Menu_____\n" +
                        "1. Find Experience.\n" +
                        "2. Find Fresher.\n" +
                        "3. Return Main Menu.\n" +
                        "Choose Option: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Find Experience: ");
                        experienceService.find();
                        break;
                    case 2:
                        System.out.println("Find Fresher: ");
                        fresherService.find();
                        break;
                    case 3:
                        System.out.println("Return Main Menu: ");
                        displayMainMenu();
                        return;
                    default:
                        System.err.println("Error. Enter Again: ");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Enter Again: ");
            }
        }
    }
}
