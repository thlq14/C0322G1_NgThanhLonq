package _Extra_Exercises._candidate_management.utils.file;

import _Extra_Exercises._candidate_management.models.Experience;
import _Extra_Exercises._candidate_management.models.Fresher;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void writeFile(String source, List<String> list) {
        File file = new File(source);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String item : list) {
                bufferedWriter.write(item);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeExperience(String pathFile, List<Experience> experiences) {
        List<String> list = new ArrayList<>();
        for (Experience item : experiences) {
            list.add(item.getInfo());
        }
        writeFile(pathFile, list);
    }

    public static void writeFresher(String pathFile, List<Fresher> freshers) {
        List<String> list = new ArrayList<>();
        for (Fresher item : freshers) {
            list.add(item.getInfo());
        }
        writeFile(pathFile, list);
    }

    public static List<String> readFile(String source) {
        File file = new File(source);
        List<String> list = new ArrayList<>();
        String line;
        try (FileReader fileReader = new FileReader(file)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<Experience> readExperience(String path) {
        List<String> list = readFile(path);
        List<Experience> experiences = new ArrayList<>();
        String[] item;
        for (String arr : list) {
            item = arr.split(",");
            experiences.add(new Experience(item[0], item[1], LocalDate.parse(item[2]), Integer.parseInt(item[3]), item[4], item[5], item[6], Double.parseDouble(item[7]), item[8]));
        }
        return experiences;
    }

    public static List<Fresher> readFresher(String path) {
        List<String> list = readFile(path);
        List<Fresher> freshers = new ArrayList<>();
        String[] item;
        for (String arr : list) {
            item = arr.split(",");
            freshers.add(new Fresher(item[0], item[1], LocalDate.parse(item[2]), Integer.parseInt(item[3]), item[4], item[5], item[6], Double.parseDouble(item[7]), item[8], item[9]));
        }
        return freshers;
    }
}
