import java.util.Scanner;
public class BAI_4 {
	public static boolean check(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String input = scanner.nextLine();

        boolean isPalindrome = check(input);

        if (isPalindrome) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        scanner.close();
    }

    
}

