package BAI_2;

import java.util.Scanner;

public class Faculty {
	private String name;
	private String date;
	private School x = new School();

	public Faculty() {

	}

	public Faculty(String name, String date, School x) {
		this.name = name;
		this.date = date;
		this.x = x;
	}
	

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public School getX() {
        return x;
    }

    public void setX(School x) {
        this.x = x;
    }
    
    public void nhap(Scanner sc) {
        System.out.print("Nhap ten truong: ");
        x.setName(sc.nextLine());
        System.out.print("Nhap ngay vao truong: ");
        x.setDate(sc.nextLine());
        x.getDate();
        System.out.print("Nhap ten khoa: ");
        name = sc.nextLine();
        System.out.print("Nhap ngay vao khoa: ");
        date = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ten truong la: " + this.x.getName());
        System.out.println("Ngay vao truong la: " + this.x.getDate());
        System.out.println("Ten khoa la: " + this.name);
        System.out.println("Ngay vao khoa la: " + this.date);
    }
}
