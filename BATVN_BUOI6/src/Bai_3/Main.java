package Bai_3;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Nhap so luong: ");
		int n = sc.nextInt();
		ArrayList<Hang_Hoa_Gia_Dung> a = new ArrayList<Hang_Hoa_Gia_Dung>(n);
		ArrayList<Hang_Hoa_Dien_Tu> b = new ArrayList<Hang_Hoa_Dien_Tu>(n);
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap Hang hoa gia dung thu " + (i + 1));
			Hang_Hoa_Gia_Dung tmp = new Hang_Hoa_Gia_Dung();
			tmp.input();
			a.add(tmp);
		}
		for (Hang_Hoa_Gia_Dung x : a) {
			System.out.println(x.TongTien());
			x.output();
		}
	}
}
