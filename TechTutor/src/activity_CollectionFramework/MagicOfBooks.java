package activity_CollectionFramework;
import java.util.*;

public class MagicOfBooks {
	private Scanner sc;
	private List<User> userList;
	private List<Book> newBookList;
	private List<Book> favBookList;
	private List<Book> readBookList;
	MagicOfBooks ()
	{
		sc=new Scanner(System.in);
	}
	public void addUser() 
	{
		
	}
	public void addBooks() 
	{
		System.out.println("Enter no of books u want to add");
		int numBooks=sc.nextInt();
		for(int x=1;x<=numBooks;x++)
		{
			Book  b = new Book();
			System.out.println("Enter Book " +x+ "s ID");
			b.setBookId(sc.nextInt());
			System.out.println("Enter Book " +x+ "s name");
			b.setBookName(sc.next());
			System.out.println("Enter Book " +x+ "s author");
			b.setAuthorName(sc.next());
			System.out.println("Enter Book " +x+ "s description");
			b.setDescription(sc.next());
					
		}
	}
	public void verifyUser() 
	{
		
	}
	public void showNew() 
	{
		
	}
	public void addNew() 
	{
		
	}
	public void showComplete() 
	{
		
	}
	public void addComplete() 
	{
		
	}
	public void addFav()
	{
		
	}
	public void showFav()
	{
		
	}
	public static void Main(String[] args) 
	{
		
	}
}
