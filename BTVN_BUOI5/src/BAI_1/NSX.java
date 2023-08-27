package BAI_1;

import java.util.*;

public class NSX {
	private String maNSX;
	private String tenNSX;
	private String diaChiNSX;

	public NSX() {

	}

	public NSX(String maNSX, String tenNSX, String diaChiNSX) {
		this.maNSX = maNSX;
		this.tenNSX = tenNSX;
		this.diaChiNSX = diaChiNSX;
	}

	public String getmaNSX() {
		return maNSX;
	}

	public void setmaNSX(String maNSX) {
		this.maNSX = maNSX;
	}

	public String gettenNSX() {
		return tenNSX;
	}

	public void settenNSX(String tenNSX) {
		this.tenNSX = tenNSX;
	}

	public String getdiaChiNSX() {
		return diaChiNSX;
	}

	public void setdiaChiNSX(String diaChiNSX) {
		this.diaChiNSX = diaChiNSX;
	}

	public void nhap(Scanner sc) {
		System.out.print("Nhap ma nha san xuat: ");
		maNSX = sc.nextLine();
		System.out.print("Nhap ten nha san xuat: ");
		tenNSX = sc.nextLine();
		System.out.print("Nhap dia chi nha san xuat: ");
		diaChiNSX = sc.nextLine();
	}

	public void xuat() {
		System.out.println("Ma nha san xuat la: " + this.maNSX);
		System.out.println("Ten nha san xuat la: " + this.tenNSX);
		System.out.println("Dia chi nha san xuat la: " + this.diaChiNSX);
	}
}
