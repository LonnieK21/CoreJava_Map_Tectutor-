package day8;

public class Student {
	private int studentid;
	private String studentname;
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	private int score;
	@Override
	public int hashCode() {
		return studentid+studentname.hashCode();
	}
	/*
	 * Student s1=new Student(1,"Namita");
	 * Student s2=new Student(1,"Namita");
	 * 1+1056;
	 * 1+1056
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studentid != other.studentid)
			return false;
		if (studentname == null) {
			if (other.studentname != null)
				return false;
		} else if (!studentname.equals(other.studentname))
			return false;
		return true;
	}
	public int getStudentid()
	{
	return studentid;	
	}
	public void setStudentid(int studentid)
	{
		this.studentid=studentid;
	}
	
}

/*
 * Property name should always start from small letter
 * Getters can be used to read values of property
 * Setters can be used to write values in property;
 * The return type of getter method should be same as data type of parameter in setter method.
 * Getter method will start getPropertyname
 * Setter method will start from setPropertyname
 */
