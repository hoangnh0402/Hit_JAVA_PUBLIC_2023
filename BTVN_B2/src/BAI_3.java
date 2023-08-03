import java.util.Scanner;
public class BAI_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao 1 so nguyen duong n: ");
		int n = sc.nextInt();
		if (n <= 1) {
			System.out.println("n khong phai la 1 so nguyen to!");
			return;
		}
		
		boolean SNT = true; // kiem tra so nguyen to
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if( n % i == 0) {
				SNT = false;
				break;
			}
		}
		
		if(SNT) {
			System.out.println("n la 1 so nguyen to.");
		} else {
			System.out.println("n khong phai la 1 so nguyen to.");
		}
	}
	
}
