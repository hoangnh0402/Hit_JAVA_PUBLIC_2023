import java.util.Scanner;

import javax.xml.bind.SchemaOutputResolver;

public class BAI_2B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao 1 so nguyen duong n: ");
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Vui long nhap lai 1 so n nguyen duong!");
			return;
		}

		int sum = 0;
		int giaithua = 1;
		for (int i = 1; i <= n; i++) {
			giaithua *= i;
			sum += giaithua;
		}
		System.out.println("Gia tri cua bieu thuc P = " + sum);
	}

}
