package Bai_3;

import java.util.*;

public class Hang_Hoa_Dien_Tu extends Hang_Hoa {
	private int thoiGianBaoHanh;
	private int congSuat;

	public Hang_Hoa_Dien_Tu() {
	}

	public int getThoigianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoigianBaoHanh(int thoiGianBaoHanh) {
		thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public int getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(int congSuat) {
		congSuat = congSuat;
	}

	public Hang_Hoa_Dien_Tu(int thoiGianBaoHanh, int congSuat) {
	        thoiGianBaoHanh = thoiGianBaoHanh;
	        congSuat = congSuat;
	    }

	public Hang_Hoa_Dien_Tu(String maHang, String tenHang, float soLuong, float donGia, Vat_Lieu[] dsVL,
	            int thoiGianBaoHanh, int congSuat) {
	        super(maHang, tenHang, soLuong, donGia, dsVL);
	        thoiGianBaoHanh = thoiGianBaoHanh;
	        congSuat = congSuat;
	    }

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Nhap thoi gian bao hang: ");
		thoiGianBaoHanh = sc.nextInt();
		System.out.printf("Nhap Cong suat: ");
		congSuat = sc.nextInt();
		super.input();
	}

	@Override
	public void output() {
		System.out.println("Thoi gian bao hanh: " + thoiGianBaoHanh);
		System.out.println("Cong suat: " + congSuat);
		super.output();
	}
}
