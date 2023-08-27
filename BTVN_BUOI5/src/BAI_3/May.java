package BAI_3;

import java.util.Scanner;

public class May {
	private String maMay;
	private String tenMay;
	private String tinhTrang;

	public May() {

	}

	public May(String MaMay, String TenMay, String TinhTrang) {
		this.maMay = MaMay;
		this.tenMay = TenMay;
		this.tinhTrang = TinhTrang;
	}

	public String getMaMay() {
		return maMay;
	}

	public void setMaMay(String MaMay) {
		this.maMay = MaMay;
	}

	public String getTenMay() {
		return tenMay;
	}

	public void setTenMay(String TenMay) {
		this.tenMay = TenMay;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String TinhTrang) {
		this.tinhTrang = TinhTrang;
	}

	public void Nhap(Scanner sc) {
		System.out.print("Nhap ma may: ");
		maMay = sc.nextLine();
		System.out.print("Nhap ten may: ");
		tenMay = sc.nextLine();
		System.out.print("Nhap tinh trang may: ");
		tinhTrang = sc.nextLine();
	}

	public void Xuat() {
		System.out.println("Ma may la: " + this.maMay);
		System.out.println("Ten may la: " + this.tenMay);
		System.out.println("Tinh trang may la: " + this.tinhTrang);
	}
}
