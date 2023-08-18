package BAI_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap so luong sach :");
		int n = sc.nextInt();

		Sach[] list = new Sach[n];

		for (int i = 0; i < n; i++) {
			System.out.println("\nNhap thong tin cuon sach thu " + (i + 1));
			list[i] = new Sach();
			list[i].nhapThongtin();
		}

		System.out.println("Thong tin sach:");
		System.out.printf("%-15s %-30s %-20s %-20s %-10s%n", "Ma sach", "Ten sach", "Tac gia", "Nha xuat ban",
				"Nam xuat ban");
		System.out.println("------------------------------------------------------------------------------");
		for (int i = 0; i < n; i++) {
			list[i].xuatThongtin();
		}
	}
}