package BAI_2;

import java.util.Scanner;

public class Student {
	private String name;
	private String Class;
	private double score;
	private Faculty y = new Faculty();
	

    public Student() {
    	
    }

    public Student(String name, String Class, double score, Faculty y) {
        this.name = name;
        this.Class = Class;
        this.score = score;
        this.y = y;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return this.Class;
    }

    public void setClass(String Class) {
        this.Class = Class;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Faculty getY() {
        return y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }
    
    public void nhap(Scanner sc) {
        y.nhap(sc);
        System.out.print("Nhap ten hoc sinh: ");
        name = sc.nextLine();
        System.out.print("Nhap ten lop: ");
        this.Class = sc.nextLine();
        System.out.print("Nhap diem: ");
        score = sc.nextDouble();
    }

    public void xuat() {
        y.xuat();
        System.out.println("Ten hoc sinh la: " + this.name);
        System.out.println("Hoc sinh lop: " + this.Class);
        System.out.println("Diem: " + this.score);
    }

}
