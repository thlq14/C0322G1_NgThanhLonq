package _Bai_Thi.models;

import java.time.LocalDate;

public class SoTietKiemCoThoiHan extends SoTietKiemNganHan {
    private double kyHan;
    private double soTienGui;
    private double laiSuat;

    public SoTietKiemCoThoiHan() {
    }

    public SoTietKiemCoThoiHan(double kyHan, double soTienGui, double laiSuat) {
        this.kyHan = kyHan;
        this.soTienGui = soTienGui;
        this.laiSuat = laiSuat;
    }

    public SoTietKiemCoThoiHan(String maSo, String maKhachHang, LocalDate ngayMoSo, LocalDate thoiGianGui, double kyHan, double soTienGui, double laiSuat) {
        super(maSo, maKhachHang, ngayMoSo, thoiGianGui);
        this.kyHan = kyHan;
        this.soTienGui = soTienGui;
        this.laiSuat = laiSuat;
    }

    public double getKyHan() {
        return kyHan;
    }

    public void setKyHan(double kyHan) {
        this.kyHan = kyHan;
    }

    public double getSoTienGui() {
        return soTienGui;
    }

    public void setSoTienGui(double soTienGui) {
        this.soTienGui = soTienGui;
    }

    public double getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(double laiSuat) {
        this.laiSuat = laiSuat;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",
                super.getMaSo(), super.getMaKhachHang(), super.getNgayMoSo(), super.getThoiGianGui(),
                this.getKyHan(), this.getSoTienGui(), this.getLaiSuat());
    }

    @Override
    public String toString() {
        return "SoTietKiemCoThoiHan{" + super.toString() +
                "kyHan=" + kyHan +
                ", soTienGui=" + soTienGui +
                ", laiSuat=" + laiSuat +
                '}';
    }
}
