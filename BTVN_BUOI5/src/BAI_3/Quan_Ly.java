package BAI_3;

import java.util.Scanner;

public class Quan_Ly {
	private static final String HoTen = null;
	private String maQL;
	private String hoVaTen;

	public String getMaQL() {
		return maQL;
	}

	public void setMaQL(String MaQL) {
		this.maQL = MaQL;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String HoTen) {
		this.hoVaTen = HoTen;
	}

	public Quan_Ly() {

	}

	public Quan_Ly(String MaQL, String HoTen) {
		this.maQL = MaQL;
		this.hoVaTen = HoTen;
	}

	public void Nhap(Scanner sc) {
		System.out.print("Nhap ma quan ly: ");
		maQL = sc.nextLine();
		System.out.print("Nhap ten quan ly: ");
		hoVaTen = sc.nextLine();
	}

	public void Xuat() {
		System.out.println("Ma quan ly la: " + this.maQL);
		System.out.println("Ten quan ly la: " + this.hoVaTen);
	}
}
