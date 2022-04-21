package day9CollectionDemo;

import java.util.*;
public class SetDemo {
	private Set<String> setdemo;
	private Scanner sc;
	public SetDemo()
	{
		sc=new Scanner(System.in);
		setdemo=new HashSet<String>();
	}
	public void addData()//will not allow duplicate data in a hashset, no error just doesn't add data again
	{
		setdemo.add("first");
		setdemo.add("two");
		setdemo.add("three");
		setdemo.add("two");
		setdemo.add("five");
		setdemo.add("first");
		for(String s:setdemo)
		{
			System.out.println("Values are "+s);
		}
	}
	public static void main(String[] args) {
		SetDemo sdemo=new SetDemo();
		sdemo.addData();
	}

}
