package day9CollectionDemo;

import java.util.*;
public class StudentMain {
	private Scanner sc;
	private Set<Student> studentset;
	public StudentMain()
	{
		sc=new Scanner(System.in);
		studentset=new HashSet<Student>();
		
	}
	public void insert()
	{
		System.out.println("Enter no of students u want to enter");
		int noofstudent=sc.nextInt();
		for(int x=1;x<=noofstudent;x++)
		{
			Student s=new Student();
			System.out.println("Enter student code");
			s.setStudentid(sc.nextInt());
			System.out.println("Enter Student name ");
			s.setStudentname(sc.next());
			System.out.println("Enter score");
			s.setScore(sc.nextInt());
			if(!studentset.add(s))
			{
				System.out.println("That student already exist");
			}
			else
			{
				System.out.println("Student added ");
			}
					
		}
	}
	public static void main(String[] args) {
		StudentMain stmain=new StudentMain();
		stmain.insert();
	}
	

}
