import java.util.Scanner;
public class BAI_5 {
	public static String formatName(String name) {
        String[] words = name.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                String theFirstWord = word.substring(0, 1).toUpperCase();
                String restOfWord = word.substring(1).toLowerCase();
                result.append(theFirstWord).append(restOfWord).append(" ");
            }
        }

        return result.toString().trim();
    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten: ");
        String input = sc.nextLine();

        String formattedName = formatName(input);

        System.out.println("Ket qua: " + formattedName);

        sc.close();
    }
}
