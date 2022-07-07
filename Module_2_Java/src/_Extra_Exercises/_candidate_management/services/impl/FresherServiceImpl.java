package _Extra_Exercises._candidate_management.services.impl;

import _Extra_Exercises._candidate_management.models.Fresher;
import _Extra_Exercises._candidate_management.services.FresherService;
import _Extra_Exercises._candidate_management.utils.file.ReadAndWriteFile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FresherServiceImpl implements FresherService {
    static Scanner scanner = new Scanner(System.in);
    static final String PATH_FRESHER = "src/_Extra_Exercises/_candidate_management/datas/fresher.csv";
    static List<Fresher> freshers = new ArrayList<>();
    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public void display() {
        freshers.clear();
        freshers = ReadAndWriteFile.readFresher(PATH_FRESHER);

        System.out.println("List Fresher: ");
        for (Fresher item : freshers) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {
        freshers.clear();
        freshers = ReadAndWriteFile.readFresher(PATH_FRESHER);

        System.out.println("Enter CandidateID: ");
        String candidateId = scanner.nextLine();

        System.out.println("Enter FullName: ");
        String fullName = scanner.nextLine();

        System.out.println("Enter BirthDay: ");
        LocalDate birthDay = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);

        System.out.println("Enter Phone: ");
        int phone = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Email: ");
        String email = scanner.nextLine();

        System.out.println("Enter Candidate Type: 1. Experience; 2. Fresher: ");
        String candidateType;
        int choose;
        do {
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    candidateType = "Experience";
                    break;
                case 2:
                    candidateType = "Fresher";
                    break;
                default:
                    candidateType = "Error. Enter Again (0 / 1): ";
            }
        } while (choose < 0 || choose > 1);

        System.out.println("Enter Candidate Count: ");
        String candidateCount = scanner.nextLine();

        System.out.println("Enter Graduation Date: ");
        double graduationDate = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter Graduation Rank: ");
        String graduationRank = scanner.nextLine();

        System.out.println("Enter Education: ");
        String education = scanner.nextLine();

        Fresher fresher = new Fresher(candidateId, fullName, birthDay, phone, email, candidateType, candidateCount, graduationDate, graduationRank, education);
        freshers.add(fresher);

        ReadAndWriteFile.writeFresher(PATH_FRESHER, freshers);
        System.out.println("Added Fresher Success.");
    }

    @Override
    public void remove() {
        freshers.clear();
        freshers = ReadAndWriteFile.readFresher(PATH_FRESHER);

        for (Fresher item : freshers) {
            System.out.println(item);
        }

        System.out.println("Enter Id Want Remove: ");
        int inputId = Integer.parseInt(scanner.nextLine());
        int choose;
        for (int i = 0; i < freshers.size(); i++) {
            try {
                if (freshers.get(i).getCandidateID().equals(inputId)) {
                    System.out.println("Are You Want To Remove: \n" +
                            "1. Yes.\n" +
                            "2. No.\n" +
                            "Choose Option: ");
                    choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            freshers.remove(i);
                            System.out.println("Removed Experience Success.");
                            break;
                        case 2:
                            System.out.println("Return Remove Menu: ");

                            break;
                        default:
                            System.err.println("Error: Enter Again (1 - 2):");

                    }
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.err.println("Incorrect Format. Enter Again: ");
            }
        }
        ReadAndWriteFile.writeFresher(PATH_FRESHER, freshers);
    }

    @Override
    public void find() {

    }
}
