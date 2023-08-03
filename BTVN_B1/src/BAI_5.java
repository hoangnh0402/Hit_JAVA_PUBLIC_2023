import java.util.Scanner;

public class BAI_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap so luong qua chanh (a): ");
		int a = sc.nextInt();

		System.out.print("Nhap so luong qua tao (b): ");
		int b = sc.nextInt();

		System.out.print("Nhap so luong qua le (c): ");
		int c = sc.nextInt();

		int x = Math.min(Math.min(a, b / 2), c / 4);

		int Tong_So_Qua_Max = 7 * x;
		System.out.println("Tong so qua toi da ma Teo dung de nau Si-ro la: " + Tong_So_Qua_Max);

	}
}
