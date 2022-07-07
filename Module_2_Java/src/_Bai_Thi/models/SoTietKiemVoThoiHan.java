package _Bai_Thi.models;

import java.time.LocalDate;

public class SoTietKiemVoThoiHan extends SoTietKiemNganHan {
    private double soTienGui;
    private double laiSuat;

    public SoTietKiemVoThoiHan() {
    }

    public SoTietKiemVoThoiHan(String maSo, String maKhachHang, LocalDate ngayMoSo, LocalDate thoiGianGui) {
        super(maSo, maKhachHang, ngayMoSo, thoiGianGui);
    }

    public SoTietKiemVoThoiHan(double soTienGui, double laiSuat) {
        this.soTienGui = soTienGui;
        this.laiSuat = laiSuat;
    }

    public SoTietKiemVoThoiHan(String maSo, String maKhachHang, LocalDate ngayMoSo, LocalDate thoiGianGui, double soTienGui, double laiSuat) {
        super(maSo, maKhachHang, ngayMoSo, thoiGianGui);
        this.soTienGui = soTienGui;
        this.laiSuat = laiSuat;
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
                super.getMaSo(), super.getMaKhachHang(), super.getNgayMoSo(), super.getNgayMoSo(), super.getThoiGianGui(),
                this.getSoTienGui(), this.getLaiSuat());
    }

    @Override
    public String toString() {
        return "SoTietKiemVoThoiHan{" + super.toString() +
                "soTienGui=" + soTienGui +
                ", laiSuat=" + laiSuat +
                '}';
    }
}
