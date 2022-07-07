package _Bai_Thi.controllers;

import _Bai_Thi.services.impl.SoTietKiemCoThoiHanImpl;
import _Bai_Thi.services.impl.SoTietKiemVoThoiHanImpl;

import java.util.Scanner;

public class SoTietKiemController {
    static Scanner scanner = new Scanner(System.in);
    static SoTietKiemCoThoiHanImpl soTietKiemCoThoiHan = new SoTietKiemCoThoiHanImpl();
    static SoTietKiemVoThoiHanImpl soTietKiemVoThoiHan = new SoTietKiemVoThoiHanImpl();

    public static void displayMainMenu() {
        int choose;
        while (true) {
            try {
                System.out.println("_____MENU_____\n" +
                        "1. Add .\n" +
                        "2. Remove .\n" +
                        "3. Display .\n" +
                        "4. Exit.\n" +
                        "Choose Option: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        addMenu();
                        break;
                    case 2:
                        removeMenu();
                        break;
                    case 3:
                        displayMenu();
                        break;
                    case 4:
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
                        "1. Display ALl .\n" +
                        "2. Display STK Dài Hạn.\n" +
                        "3. Display STK Vô Thời Hạn.\n" +
                        "4. Display STK Có Thời Hạn.\n" +
                        "5. Return Main Menu.\n" +
                        "Choose Option: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("List All : ");

                        break;
                    case 2:
                        System.out.println("List : ");

                        break;
                    case 3:
                        System.out.println("List STK Vô Thời Hạn: ");
                        soTietKiemVoThoiHan.display();
                        break;
                    case 4:
                        System.out.println("List STK Có Thời Hạn: ");
                        soTietKiemCoThoiHan.display();
                    case 5:
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
                        "1. Add STK Dài Hạn.\n" +
                        "2. Add STK Ngắn Hạn.\n" +
                        "3. Return Main Menu.\n" +
                        "Choose Option: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Add Add STK Dài Hạn: ");

                        break;
                    case 2:
                        System.out.println("Add STK Ngắn Hạn: ");
                        addMenuSoTietKiem();
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
                        "1. Remove .\n" +
                        "2. Remove .\n" +
                        "3. Return Main Menu.\n" +
                        "Choose Option: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Remove : ");

                        break;
                    case 2:
                        System.out.println("Remove : ");

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

    public static void addMenuSoTietKiem() {
        int choose;
        while (true) {
            try {
                System.out.println("_____Add Menu_____\n" +
                        "1. Add STK Có Thời Hạn.\n" +
                        "2. Add STK Vô Thời Hạn.\n" +
                        "3. Return Main Menu.\n" +
                        "Choose Option: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Add STK Có Thời Hạn: ");
                        soTietKiemCoThoiHan.add();
                        break;
                    case 2:
                        System.out.println("Add STK Vô Thời Hạn: ");
                        soTietKiemVoThoiHan.add();
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
