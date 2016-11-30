package cn.edu.sdut.softlab.list;

public class Student {
	
	public String name;
	public int id;
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String toString() {
		return name + "" + id + "";
		
	}
}
