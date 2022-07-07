package _Bai_Thi.utils.file;

import _Bai_Thi.models.SoTietKiemCoThoiHan;
import _Bai_Thi.models.SoTietKiemNganHan;
import _Bai_Thi.models.SoTietKiemVoThoiHan;

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

    public static void writeSoTietKiemNganHan(String pathFile, List<SoTietKiemNganHan> soTietKiemNganHans) {
        List<String> list = new ArrayList<>();
        for (SoTietKiemNganHan item : soTietKiemNganHans) {
            list.add(item.getInfo());
        }
        writeFile(pathFile, list);
    }

    public static void writeSoTietKiemVoThoiHan(String pathFile, List<SoTietKiemVoThoiHan> soTietKiemVoThoiHans) {
        List<String> list = new ArrayList<>();
        for (SoTietKiemVoThoiHan item : soTietKiemVoThoiHans) {
            list.add(item.getInfo());
        }
        writeFile(pathFile, list);
    }

    public static void writeSoTietKiemCoThoiHan(String pathFile, List<SoTietKiemCoThoiHan> soTietKiemCoThoiHans) {
        List<String> list = new ArrayList<>();
        for (SoTietKiemCoThoiHan item : soTietKiemCoThoiHans) {
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

    public static List<SoTietKiemCoThoiHan> readSoTietKiemCoThoiHan(String path) {
        List<String> list = readFile(path);
        List<SoTietKiemCoThoiHan> soTietKiemCoThoiHans = new ArrayList<>();
        String[] item;
        for (String arr : list) {
            item = arr.split(",");
            soTietKiemCoThoiHans.add(new SoTietKiemCoThoiHan(item[0], item[1], LocalDate.parse(item[2]), LocalDate.parse(item[3]), Double.parseDouble(item[4]), Double.parseDouble(item[5]), Double.parseDouble(item[6])));
        }
        return soTietKiemCoThoiHans;
    }

    public static List<SoTietKiemVoThoiHan> readSoTietKiemVoThoiHan(String path) {
        List<String> list = readFile(path);
        List<SoTietKiemVoThoiHan> soTietKiemVoThoiHans = new ArrayList<>();
        String[] item;
        for (String arr : list) {
            item = arr.split(",");
            soTietKiemVoThoiHans.add(new SoTietKiemVoThoiHan(item[0], item[1], LocalDate.parse(item[2]), LocalDate.parse(item[3]), Double.parseDouble(item[4]), Double.parseDouble(item[5])));
        }
        return soTietKiemVoThoiHans;
    }
}
