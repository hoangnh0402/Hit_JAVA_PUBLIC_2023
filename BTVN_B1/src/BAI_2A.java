import java.util.Scanner;

public class BAI_2A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao 1 so nguyen duong n: ");
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Vui long nhap lai 1 so n nguyen duong!");
			return;
		}
		double sum = 0.0;
		for (int i = 1; i <= n; i++) {
			sum += 1.0 / i;
		}
		System.out.println("Gia tri cua bieu thuc S = " + sum);
	}
}
