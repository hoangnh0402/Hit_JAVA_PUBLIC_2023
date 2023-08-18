package BAI_1;

import java.util.Scanner;

public class Sach {
	private String maSach;
	private String tenSach;
	private String tacGia;
	private String nhaXuatban;
	private double giaTien;

	public Sach() {

	}

	public Sach(String maSach, String tenSach, String tacGia, String nhaXuatban, double giaTien) {
		this.maSach = maSach;
		this.tenSach = tenSach;
		this.tacGia = tacGia;
		this.nhaXuatban = nhaXuatban;
		this.giaTien = giaTien;
	}

	public void setmaSach() {
		this.maSach = maSach;
	}

	public String getmaSach() {
		return maSach;
	}

	public void settenSach() {
		this.tenSach = tenSach;
	}

	public String gettenSach() {
		return tenSach;
	}

	public void settacGia() {
		this.tacGia = tacGia;
	}

	public String gettacGia() {
		return tacGia;
	}

	public void setnhaXuatban() {
		this.nhaXuatban = nhaXuatban;
	}

	public String getnhaXuatban() {
		return nhaXuatban;
	}

	public void setgiaTien() {
		this.giaTien = giaTien;
	}

	public double getgiaTien() {
		return giaTien;
	}

	public void nhapThongtin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma sach: ");
		maSach = sc.nextLine();
		System.out.println("Nhap ten sach: ");
		tenSach = sc.nextLine();
		System.out.println("Nhap ten tac gia: ");
		tacGia = sc.nextLine();
		System.out.println("Nhap ten nha xuat ban: ");
		nhaXuatban = sc.nextLine();
		System.out.println("Nhap gia tien: ");
		giaTien = sc.nextDouble();
	}

	public void xuatThongtin() {
		System.out.printf("%-15s %-30s %-20s %-20s %-10.2f%n", maSach, tenSach, tacGia, nhaXuatban, giaTien);
	}
}
