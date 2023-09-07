package Bai_1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap chuoi: ");
		String input = scanner.nextLine();

		int sum = tinhTongSoTrongChuoi(input);
		System.out.println("Tong cac so nguyen xuat hien trong chuoi la: " + sum);

		scanner.close();
	}

	public static int tinhTongSoTrongChuoi(String str) {
		int sum = 0;
		StringBuilder currentNumber = new StringBuilder();

		for (char c : str.toCharArray()) {
			if (Character.isDigit(c) || (c == '-' && currentNumber.length() == 0)) {

				currentNumber.append(c);
			} else if (currentNumber.length() > 0) {

				sum += Integer.parseInt(currentNumber.toString());
				currentNumber.setLength(0);
			}
		}

		if (currentNumber.length() > 0) {
			sum += Integer.parseInt(currentNumber.toString());
		}

		return sum;
	}
}
