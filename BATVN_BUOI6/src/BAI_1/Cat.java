package BAI_1;

import java.util.Scanner;

public class Cat extends Animal {
	private String color;
	private String preferences;
	private String ownerName;
	
	public Cat(String name, Byte age, Float weight, String color, String preferences, String ownerName) {
		super(name, age, weight);
		this.color=color;
		this.preferences=preferences;
		this.ownerName=ownerName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPreferences() {
		return preferences;
	}

	public void setPreferences(String preferences) {
		this.preferences = preferences;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	@Override
    public void Nhap(){
        Scanner sc1 = new Scanner(System.in);
        super.Nhap();
        System.out.printf("Nhap mau: ");
        color = sc1.nextLine();
        System.out.printf("Nhap so thich: ");
        preferences = sc1.nextLine();
        System.out.printf("Nhap ten chu: ");
        ownerName = sc1.nextLine();
    }
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("mau: " + color);
        System.out.println("so thich: " + preferences);
        System.out.println("chu: " + ownerName);
    }
    @Override
    public void tiengKeu(){
        System.out.println("Meow Meow ");
    }
}

