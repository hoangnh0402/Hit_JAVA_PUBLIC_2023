package BAI_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hang a = new Hang();
		NSX b = new NSX();
		a.nhap(sc);
		b.nhap(sc);
		a.xuat();
		b.xuat();
	}
}
