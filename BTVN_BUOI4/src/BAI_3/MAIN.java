package BAI_3;

import java.util.Scanner;

public class MAIN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so sinh vien:");
		int n = sc.nextInt();

		SINH_VIEN[] list = new SINH_VIEN[n];

		for (int i = 0; i < n; i++) {
			System.out.println("\nNhap thong tin cua sinh vien thu  " + (i + 1));
			list[i] = new SINH_VIEN();
			list[i].nhapThongTin();
		}

		System.out.println("Danh sách các sinh viên:");
		System.out.printf("%-10s %-20s %-8s %-8s %-8s %-8s%n", "Mã SV", "Họ tên", "Điểm Toán", "Điểm Lý", "Điểm Hóa",
				"Điểm TB");
		System.out.println("-------------------------------------------------------------------------------------");
		for (int i = 0; i < n; i++) {
			list[i].xuatThongTin();
		}

	}
}