import java.util.Scanner;

public class BAI_2 {
	public static int[] add(int[] arr, int index, int value) {
		int n = arr.length;
		int[] newArray = new int[n + 1];

		for (int i = 0, j = 0; i < n + 1; i++) {
			if (i == index) {
				newArray[i] = value;
			} else {
				newArray[i] = arr[j];
				j++;
			}
		}

		return newArray;
	}

	public static int[] remove(int[] arr, int index) {
		int n = arr.length;
		int[] newArray = new int[n - 1];

		for (int i = 0, j = 0; i < n; i++) {
			if (i != index) {
				newArray[j] = arr[i];
				j++;
			}
		}

		return newArray;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap so phan tu cua mang: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Nhap mang:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Nhap vi tri can them hoac xoa phan tu: ");
		int position = sc.nextInt();

		if (position < 1 || position > n + 1) {
			System.out.println("Vi tri khong hop le!");
		} else {
			System.out.print("Chon thao tac (1: add, 2: delete): ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.print("Nhap gia tri cho phan tu moi: ");
				int newValue = sc.nextInt();
				arr = add(arr, position - 1, newValue);
			} else if (choice == 2) {
				arr = remove(arr, position - 1);
			} else {
				System.out.println("Thao tac khong hop le!");
			}

			System.out.print("Ket qua: [");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
				if (i < arr.length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println("]");
		}

		sc.close();
	}

}
