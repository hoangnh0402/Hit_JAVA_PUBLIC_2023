import java.util.Scanner;

public class BAI_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao 1 so nguyen duong n: ");
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Vui long nhap lai 1 so nguyen duong n!");
			return;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
