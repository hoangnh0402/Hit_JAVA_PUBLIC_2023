package BAI_1;

import java.util.Scanner;

public class Hang {
	private String maHang;
	private String tenHang;
	private NSX x = new NSX();

	public Hang() {

	}

	public static Scanner sc = new Scanner(System.in);

	public Hang(String maHang, String tenHang, NSX x) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		x.nhap(sc);
		this.x = x;
	}

	public String getmaHang() {
		return maHang;
	}

	public void setmaHang(String maHang) {
		this.maHang = maHang;
	}

	public String gettenHang() {
		return tenHang;
	}

	public void settenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public NSX getX() {
		return x;
	}

	public void setX(NSX x) {
		this.x = x;
	}

	public void nhap(Scanner sc) {
		System.out.print("Nhap ma hang: ");
		maHang = sc.nextLine();
		System.out.print("Nhap ten hang: ");
		tenHang = sc.nextLine();
	}

	public void xuat() {
		System.out.println("Ma hang la: " + this.maHang);
		System.out.println("Ten hang la: " + this.tenHang);
	}

}
