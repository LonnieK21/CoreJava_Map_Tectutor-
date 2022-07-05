package activity_CollectionFramework;

public class User {
	private String userName;
	private int userId;
	private int emailId;
	private String password;
	private Book newBooks;
	private Book favourite;
	private Book completed;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getEmailId() {
		return emailId;
	}
	public void setEmailId(int emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Book getNewBooks() {
		return newBooks;
	}
	public void setNewBooks(Book newBooks) {
		this.newBooks = newBooks;
	}
	public Book getFavourite() {
		return favourite;
	}
	public void setFavourite(Book favourite) {
		this.favourite = favourite;
	}
	public Book getCompleted() {
		return completed;
	}
	public void setCompleted(Book completed) {
		this.completed = completed;
	}
}
