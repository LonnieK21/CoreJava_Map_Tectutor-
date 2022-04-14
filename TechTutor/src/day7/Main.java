package day7;

public class Main {
	public static void main(String[] args) {
		Table tobj=new Table();
		ThreadOne thone=new ThreadOne(tobj);
		Thread thtwo=new ThreadTwo(tobj);
		thone.start();
		thtwo.start();
		
	}

}
