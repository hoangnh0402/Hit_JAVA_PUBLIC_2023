package BAI_1;

import java.util.Scanner;

public class Dog extends Animal {
	 private String character;
	    public Dog(){}
	    public Dog(String name, Byte age, float weight, String character){
	        super(name, age, weight);
	        this.character = character;
	    }
	    public String getCharacter() {
	        return character;
	    }
	    public void setCharacter(String character) {
	        this.character = character;
	    }
	    @Override
	    public void Nhap(){
	        Scanner sc2 = new Scanner(System.in);
	        super.Nhap();
	        System.out.printf("Nhap tinh cach: ");
	        character = sc2.nextLine();
	    }
	    @Override
	    public void Xuat(){
	        super.Xuat();
	        System.out.println("tinh cach: " + character);
	    }
	    @Override
	    public void tiengKeu(){
	        System.out.println("Gau Gau ");
	    }
	}
