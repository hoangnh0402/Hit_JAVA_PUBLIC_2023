package Bai_3;

import java.util.Scanner;


public class Hang_Hoa {
	private String maHang;
	private String tenHang;
	private float soLuong;
	private float donGia;
	private Vat_Lieu[] dsVL;

	public Hang_Hoa() {
	}

	public Hang_Hoa(String maHang, String tenHang, float soLuong, float donGia, Vat_Lieu[] dsVL) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.dsVL = dsVL;
	}

	public String getMaHang() {
		return maHang;
	}

	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public float getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(float soLuong) {
		this.soLuong = soLuong;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public Vat_Lieu[] getDsVL() {
		return dsVL;
	}

	public void setDsVL(Vat_Lieu[] dsVL) {
		this.dsVL = dsVL;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Nhap ma hang: ");
		maHang = sc.nextLine();
		System.out.printf("Nhap ten hang: ");
		tenHang = sc.nextLine();
		System.out.printf("Nhap so luong: ");
		soLuong = sc.nextFloat();
		System.out.printf("Nhap Don gia: ");
		donGia = sc.nextFloat();
		dsVL = new Vat_Lieu[(int) soLuong];
		for (int i = 0; i < soLuong; i++) {
			sc.nextLine();
			System.out.println("Nhap vat lieu " + (i + 1));
			dsVL[i] = new Vat_Lieu();
			dsVL[i].Nhap();
		}
	}

	public void output() {
		System.out.println("Ma Hang: " + maHang);
		System.out.println("Ten Hang: " + tenHang);
		System.out.println("So luong: " + soLuong);
		System.out.println("Don gia: " + donGia);
		for (int i = 0; i < soLuong; i++) {
			System.out.println("Vat Lieu " + (i + 1));
			dsVL[i].Xuat();
		}
	}

	public float TongTien() {
		return soLuong * donGia;
	}
}
