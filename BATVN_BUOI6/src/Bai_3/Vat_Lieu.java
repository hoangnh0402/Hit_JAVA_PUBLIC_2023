package Bai_3;

import java.util.Scanner;

public class Vat_Lieu {
	private String ten;
	private String mauSac;
	private int doCung;

	public Vat_Lieu(){}

	public Vat_Lieu(String ten, String mauSac, int doCung) {
	        this.ten = ten;
	        this.mauSac = mauSac;
	        this.doCung = doCung;
	    }

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getMauSac() {
		return mauSac;
	}

	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}

	public int getDoCung() {
		return doCung;
	}

	public void setDoCung(int doCung) {
		this.doCung = doCung;
	}

	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter ten: ");
		ten = sc.nextLine();
		System.out.printf("Enter mau sac: ");
		mauSac = sc.nextLine();
		System.out.printf("Enter Do cung: ");
		doCung = sc.nextInt();
	}

	public void Xuat() {
		System.out.println("Ten: " + ten);
		System.out.println("Mau sac: " + mauSac);
		System.out.println("Do Cung: " + doCung);
	}
}
