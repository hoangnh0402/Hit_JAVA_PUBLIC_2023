package Bai_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Classroom {
	private int classId;
	private int numberOfStudent;
	private ArrayList<Student> listStudents = new ArrayList<>();

	public Classroom(int classId, int numberOfStudent, ArrayList<Student> students) {
		this.classId = classId;
		this.numberOfStudent = numberOfStudent;
		this.listStudents = students;
	}

	public Classroom() {
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public int getNumberOfStudent() {
		return numberOfStudent;
	}

	public void setNumberOfStudent(int numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}

	public ArrayList<Student> getStudents() {
		return listStudents;
	}

	public void setStudents(ArrayList<Student> students) {
		this.listStudents = students;
	}

	public void input(Scanner sc) {
		System.out.print("Nhap ID lop: ");
        classId = sc.nextInt();
        System.out.print("Nhap so luong hoc sinh: ");
        numberOfStudent = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.println("Nhap thong tin hoc sinh thu "+(i+1)+": ");
            Student s = new Student();
            s.input(sc);
            listStudents.add(s);
        }
	}

	public void output() {
		System.out.println(this.classId + " " + this.numberOfStudent);
		System.out.println("Danh sach sinh vien trong lop: ");
		for (Student student : listStudents) {
			System.out.println(student.toString());
		}
	}

	public static ArrayList<Student> searchByName(String nameToSearch, ArrayList<Student> listStudent) {
		ArrayList<Student> result = new ArrayList<>();

		for (Student student : listStudent) {
			if (student.getName().equalsIgnoreCase(nameToSearch)) {
				result.add(student);
			}
		}

		return result;
	}
}
