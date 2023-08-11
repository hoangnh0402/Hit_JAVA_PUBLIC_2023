import java.util.Scanner;
public class BAI_1 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhap so phan tu trong mang: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Nhap cac phan tu cua mang:");
	        for (int i = 0; i < n; ++i) {
	            arr[i] = sc.nextInt();
	        }

	        final int MAX_VALUE = 1000;  // gia su gia tri max trong mang

	        // mang danh dau de dem so phan tu
	        int[] count = new int[MAX_VALUE + 1];

	        // dem so lan cac phan tu xuat hien trong mang
	        for (int i = 0; i < n; i++) {
	            count[arr[i]]++;
	        }

	        // In kết quả
	        System.out.println("So lan xuat hien cua cac phan tu:");
	        for (int i = 0; i <= MAX_VALUE; i++) {
	            if (count[i] > 0) {
	                System.out.println(i + ": " + count[i] + " lan");
	            }
	        }
	    }
	}
	




