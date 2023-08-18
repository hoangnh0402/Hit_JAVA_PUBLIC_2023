package BAI_2;

import java.util.Scanner;

public class Rectangle {
	private double length;
	private double width;

	public Rectangle() {

	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public void setlength() {
		this.length = length;
	}

	public double getlength() {
		return length;
	}

	public void setwidth() {
		this.width = width;
	}

	public double getwidth() {
		return width;
	}
	
	public void getInformation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chieu dai cua hinh chu nhat: ");
		length = sc.nextDouble();
		System.out.println("Nhap chieu rong cua hinh chu nhat: ");
		width = sc.nextDouble();
	}
	
	public void drawRectangle() {
		for(int i = 0; i < width; i++) {
			for(int j = 0; j < length; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	
	public double getPerimeter() {
		return (length + width) * 2;
	}
	
	public double getArea() {
		return length * width;
	}
	
	public void display() {
		System.out.println("Chu vi hinh chu nhat la: " + getPerimeter());
		System.out.println("Dien tich hinh chu nhat la: " + getArea());
	}
}
