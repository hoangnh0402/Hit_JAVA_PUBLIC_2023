package BAI_3;

import java.util.Scanner;

public class Phong_May {
	private String maPhong;
	private String tenPhong;
	private String dienTich;
	private Quan_Ly x;
	private May y;
	private int n;

	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String MaPhong) {
		this.maPhong = MaPhong;
	}

	public String getTenPhong() {
		return tenPhong;
	}

	public void setTenPhong(String TenPhong) {
		this.tenPhong = TenPhong;
	}

	public String getDienTich() {
		return dienTich;
	}

	public void setDienTich(String DienTich) {
		this.dienTich = DienTich;
	}

	public Quan_Ly getX() {
		return x;
	}

	public void setX(Quan_Ly x) {
		this.x = x;
	}

	public May getY() {
		return y;
	}

	public void setY(May y) {
		this.y = y;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public Phong_May() {
	}

	public Phong_May(String MaPhong, String TenPhong, String DienTich, Quan_Ly x, May y) {
		this.maPhong = MaPhong;
		this.tenPhong = TenPhong;
		this.dienTich = DienTich;
		this.x = x;
		this.y = y;
	}

	public void Nhap(Scanner sc) {
		System.out.print("Nhap ma phong may: ");
		maPhong = sc.nextLine();
		System.out.print("Nhap ten phong may: ");
		tenPhong = sc.nextLine();
		System.out.print("Nhap dien tich phong may: ");
		dienTich = sc.nextLine();
		System.out.print("Nhap so luong may: ");
		this.n = sc.nextInt();
	}

	public void Xuat() {
		System.out.println("Ma phong may la: " + this.maPhong);
		System.out.println("Ten phong may la: " + this.tenPhong);
		System.out.println("Dien tich phong may la: " + this.dienTich);
		System.out.println("So luong may la: " + this.n);
	}
}
