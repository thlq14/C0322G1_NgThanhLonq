package _Bai_Thi.services.impl;

import _Bai_Thi.models.SoTietKiemCoThoiHan;
import _Bai_Thi.models.SoTietKiemVoThoiHan;
import _Bai_Thi.services.ISoTietKiemVoThoiHan;
import _Bai_Thi.utils.file.ReadAndWriteFile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoTietKiemVoThoiHanImpl implements ISoTietKiemVoThoiHan{
    static Scanner scanner = new Scanner(System.in);
    static List<SoTietKiemVoThoiHan> list = new ArrayList<>();
    static final String PATH_SHORTTERM = "src/_Bai_Thi/data/shortTerm.csv";
    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public void add() {
        list.clear();
        list = ReadAndWriteFile.readSoTietKiemVoThoiHan(PATH_SHORTTERM);

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

        SoTietKiemVoThoiHan soTietKiemVoThoiHan = new SoTietKiemVoThoiHan(maSo, maKH, ngayMoSo, thoiGianGui, soTien, laiSuat);
        list.add(soTietKiemVoThoiHan);

        ReadAndWriteFile.writeSoTietKiemVoThoiHan(PATH_SHORTTERM, list);
        System.out.println("Đã thêm thành công.");
    }

    @Override
    public void display() {
        list.clear();
        list = ReadAndWriteFile.readSoTietKiemVoThoiHan(PATH_SHORTTERM);

        for (SoTietKiemVoThoiHan item : list) {
            System.out.println(item);
        }
    }

    @Override
    public void remove() {



    }
}
