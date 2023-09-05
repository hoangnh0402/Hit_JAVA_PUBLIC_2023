package Bai_2;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap so luong sinh vien: ");
        int n = sc.nextInt();
        ArrayList<Student> a = new ArrayList<Student>(n);
        for(int i = 0; i < n; i++){
            System.out.println("Sinh vien thu " + (i + 1));
            Student tmp = new Student();
            tmp.input();
            a.add(tmp); 
        }
        for(int i = 0; i < n; i++){
            Student student = a.get(i);
            student.output();
        }

    }
}
