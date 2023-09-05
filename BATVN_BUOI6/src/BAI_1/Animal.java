package BAI_1;

import java.util.Scanner;

public class Animal {
	protected String name;
	protected Byte age;
	protected Float weight;
	
	public Animal(){
		
	}
	public Animal(String name,Byte age, Float weight ) {
		name = name;
		age = age;
		weight = weight;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Byte getAge() {
		return age;
	}
	public void setAge(Byte age) {
		this.age = age;
	}
	public Float getWeight() {
		return weight;
	}
	public void setWeight(Float weight) {
		this.weight = weight;
	}
	 public void Nhap(){
	        Scanner sc = new Scanner(System.in);
	        System.out.printf("Nhap ten: ");
	        name = sc.nextLine();
	        System.out.printf("Nhap tuoi: ");
	        age = sc.nextByte();
	        System.out.printf("Nhap can nang: ");
	        weight = sc.nextFloat();
	    }
	    
	    public void Xuat(){
	        System.out.printf("ten: " + name);
	        System.out.printf("\ttuoi: " + age);
	        System.out.printf("\tcan nang: " + weight);
	    }
	    
	    public void tiengKeu(){
	    }
}
