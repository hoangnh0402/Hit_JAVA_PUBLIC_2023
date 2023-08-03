import java.util.Scanner;

public class BAI_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so thuc a: ");
		double a = sc.nextDouble();

		System.out.print("Nhap vao so thuc b: ");
		double b = sc.nextDouble();

		System.out.print("Nhap vao so thuc c: ");
		double c = sc.nextDouble();

		double denta = b * b - 4 * a * c;

		if (denta < 0) {
			System.out.println("Phuong tring khong co nghiem thuc.");
		} else if (denta == 0) {
			double x = Math.sqrt(-b / (2 * a));
			System.out.println("Phuong trinh co nghiem hai nghiem la: x1 = " + x + " va x2 = " + (-x));
		} else {
			double x1 = Math.sqrt((-b + Math.sqrt(denta)) / (2 * a));
			double x2 = Math.sqrt((-b - Math.sqrt(denta)) / (2 * a));
			System.out.println(
					"Phuong trinh co 4 nghiem: x1 = " + x1 + ", x2 = " + (-x1) + ", x3 = " + x2 + ", x4 = " + (-x2));
		}
	}
}
