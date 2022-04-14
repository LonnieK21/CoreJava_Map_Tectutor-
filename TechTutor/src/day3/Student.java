package day3;

public class Student
{
	public Student()
	{
		System.out.println("No name is there");
	}
	public Student(String name)
	{
		System.out.println("Name is "+name);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student("Dimple");
	}
	
}
