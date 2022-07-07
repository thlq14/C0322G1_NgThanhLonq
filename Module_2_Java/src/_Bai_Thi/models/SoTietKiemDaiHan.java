package _Bai_Thi.models;

import java.time.LocalDate;

public class SoTietKiemDaiHan {
    private int maSo;
    private String maKhachHang;
    private LocalDate ngayMoSo;
    private LocalDate thoiGianGui;
    private double kyHan;
    private double soTienGui;
    private double laiSuat;
    private String uuDai;

    public SoTietKiemDaiHan() {
    }

    public SoTietKiemDaiHan(int maSo, String maKhachHang, LocalDate ngayMoSo, LocalDate thoiGianGui, double kyHan, double soTienGui, double laiSuat, String uuDai) {
        this.maSo = maSo;
        this.maKhachHang = maKhachHang;
        this.ngayMoSo = ngayMoSo;
        this.thoiGianGui = thoiGianGui;
        this.kyHan = kyHan;
        this.soTienGui = soTienGui;
        this.laiSuat = laiSuat;
        this.uuDai = uuDai;
    }

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public LocalDate getNgayMoSo() {
        return ngayMoSo;
    }

    public void setNgayMoSo(LocalDate ngayMoSo) {
        this.ngayMoSo = ngayMoSo;
    }

    public LocalDate getThoiGianGui() {
        return thoiGianGui;
    }

    public void setThoiGianGui(LocalDate thoiGianGui) {
        this.thoiGianGui = thoiGianGui;
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

    public String getUuDai() {
        return uuDai;
    }

    public void setUuDai(String uuDai) {
        this.uuDai = uuDai;
    }

    @Override
    public String toString() {
        return "SoTietKiemDaiHan{" +
                "maSo=" + maSo +
                ", maKhachHang='" + maKhachHang + '\'' +
                ", ngayMoSo=" + ngayMoSo +
                ", thoiGianGui=" + thoiGianGui +
                ", kyHan=" + kyHan +
                ", soTienGui=" + soTienGui +
                ", laiSuat=" + laiSuat +
                ", uuDai='" + uuDai + '\'' +
                '}';
    }
}
