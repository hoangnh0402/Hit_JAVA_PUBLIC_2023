package BAI_3;

import java.util.Scanner;

public class SINH_VIEN {

	private String maSinhVien;
	private String hoTen;
	private double diemToan;
	private double diemLy;
	private double diemHoa;

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}

	public double getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(double diemLy) {
		this.diemLy = diemLy;
	}

	public double getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(double diemHoa) {
		this.diemHoa = diemHoa;
	}

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma sinh vien:");
		maSinhVien = sc.nextLine();
		System.out.println("Nhap ho ten:");
		hoTen = sc.nextLine();
		System.out.println("Nhap diem Toan:");
		diemToan = sc.nextDouble();
		System.out.println("Nhap diem Ly:");
		diemLy = sc.nextDouble();
		System.out.println("Nhap diem Hoa:");
		diemHoa = sc.nextDouble();
	}

	public void xuatThongTin() {
		System.out.printf("%-10s %-20s %-8.2f %-8.2f %-8.2f %-8.2f%n", maSinhVien, hoTen, diemToan, diemLy, diemHoa,
				diemTrungBinh());
	}

	public double diemTrungBinh() {
		return (double) ((diemToan + diemLy + diemHoa) / 3);
	}
}
