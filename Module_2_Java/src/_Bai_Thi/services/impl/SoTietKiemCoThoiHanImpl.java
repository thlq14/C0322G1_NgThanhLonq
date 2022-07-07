package _Bai_Thi.services.impl;

import _Bai_Thi.models.SoTietKiemCoThoiHan;
import _Bai_Thi.services.ISoTietKiemCoThoiHan;
import _Bai_Thi.utils.file.ReadAndWriteFile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoTietKiemCoThoiHanImpl implements ISoTietKiemCoThoiHan {
    static Scanner scanner = new Scanner(System.in);
    static List<SoTietKiemCoThoiHan> list = new ArrayList<>();
    static final String PATH_SHORTTERM = "src/_Bai_Thi/data/shortTerm.csv";
    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public void add() {
        list.clear();
        list = ReadAndWriteFile.readSoTietKiemCoThoiHan(PATH_SHORTTERM);

        System.out.println("Nhập Mã Số Sổ: ");
        String maSo = scanner.nextLine();

        System.out.println("Nhập Mã Khách Hàng: ");
        String maKH = scanner.nextLine();

        System.out.println("Nhập Ngày Mở Sổ: ");
        LocalDate ngayMoSo = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);

        System.out.println("Nhập Thời Gian Gửi: ");
        LocalDate thoiGianGui = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);

        System.out.println("Nhập Số Tiền Gửi: ");
        double soTien = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập Lãi Suất: ");
        double laiSuat = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập Kỳ Hạn: ");
        double kyHan = Double.parseDouble(scanner.nextLine());

        SoTietKiemCoThoiHan soTietKiemCoThoiHan = new SoTietKiemCoThoiHan(maSo, maKH, ngayMoSo, thoiGianGui, soTien, laiSuat, kyHan);
        list.add(soTietKiemCoThoiHan);

        ReadAndWriteFile.writeSoTietKiemCoThoiHan(PATH_SHORTTERM, list);
        System.out.println("Đã thêm thành công.");
    }

    @Override
    public void display() {
        list.clear();
        list = ReadAndWriteFile.readSoTietKiemCoThoiHan(PATH_SHORTTERM);

        for (SoTietKiemCoThoiHan item : list) {
            System.out.println(item);
        }
    }

    @Override
    public void remove() {
        list.clear();
        list = ReadAndWriteFile.readSoTietKiemCoThoiHan(PATH_SHORTTERM);

        for (SoTietKiemCoThoiHan item : list) {
            System.out.println(item);
        }
    }
}
