package Bai_3;

import java.util.Scanner;

public class Hang_Hoa_Gia_Dung extends Hang_Hoa {
	private String chucNang;

	public Hang_Hoa_Gia_Dung() {
	}

	public String getChucnang() {
		return chucNang;
	}

	public void setChucnang(String chucNang) {
		chucNang = chucNang;
	}

	public Hang_Hoa_Gia_Dung(String maHang, String tenHang, float soLuong, float donGia, Vat_Lieu[] dsVL,
			String chucNang) {
		super(maHang, tenHang, soLuong, donGia, dsVL);
		chucNang = chucNang;
	}

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Nhap chuc nang: ");
		chucNang = sc.nextLine();
		super.input();
	}

	@Override
	public void output() {
		System.out.println("Chuc nang: " + chucNang);
		super.output();
	}
}
