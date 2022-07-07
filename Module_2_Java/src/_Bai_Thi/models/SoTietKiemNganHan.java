package _Bai_Thi.models;

import java.time.LocalDate;

public abstract class SoTietKiemNganHan {
    private String maSo;
    private String maKhachHang;
    private LocalDate ngayMoSo;
    private LocalDate thoiGianGui;

    public SoTietKiemNganHan() {
    }

    public SoTietKiemNganHan(String maSo, String maKhachHang, LocalDate ngayMoSo, LocalDate thoiGianGui) {
        this.maSo = maSo;
        this.maKhachHang = maKhachHang;
        this.ngayMoSo = ngayMoSo;
        this.thoiGianGui = thoiGianGui;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
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

    public abstract String getInfo();

    @Override
    public String toString() {
        return "maSo=" + maSo +
                ", maKhachHang='" + maKhachHang + '\'' +
                ", ngayMoSo=" + ngayMoSo +
                ", thoiGianGui=" + thoiGianGui;
    }
}
