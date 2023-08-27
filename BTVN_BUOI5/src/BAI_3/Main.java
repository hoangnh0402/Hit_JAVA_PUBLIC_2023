package BAI_3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quan_Ly ql = new Quan_Ly();
        Phong_May pm = new Phong_May();
        
        ql.Nhap(sc);
        pm.Nhap(sc);
        sc.nextLine();
        int sl = pm.getN();
        May[] m = new May[sl];
        for (int i = 0; i < sl; i++) {
            May ms = new May();
            ms.Nhap(sc);
            m[i] = ms;
        }

        System.out.println("\nThong tin da duoc nhap la:");
        System.out.println("1. Thong tin quan ly:");
        ql.Xuat();
        System.out.println("\n2. Thong tin phong may:");
        pm.Xuat();
        System.out.println("\n3. Thong tin may:");
        for (int i = 0; i < sl; i++) {
            System.out.println("\nMay thu " + (i + 1) + ": ");
            m[i].Xuat();
        }
    }
}
