package day11Java8Features;

import java.util.*;
import java.util.stream.Collectors;

public class ProductMain {//Example of using Stream API methods
	List<Product> productlist;
	public ProductMain()
	{
		productlist=new ArrayList<Product>();
		productlist.add(new Product(101,"Laptop",60000));
		productlist.add(new Product(102,"Mouse",1000));
		productlist.add(new Product(103,"mac",80000));
		productlist.add(new Product(104,"Ipad",30000));
		
	}
	//stream helps orginize data
	public void searchUsingStream()//Used forEach(System.out::println) to not have to convert output to list that is displayed ::
	{
		//List<String> productName=
				productlist.stream().filter(p->p.getPrice()>=60000).min(null)
				.map(p->p.getProductname()).forEach(System.out::println);
				
				//collect(Collectors.toList());
		//System.out.println("Name is "+productName);
	}
	public void findMinimum()
	{
		Optional<Double> minimumvalue=
	productlist.stream().filter(p->p.getPrice()>30000).
	map(p->p.getPrice()).min(Double::compare);
		if(minimumvalue.isPresent())
		{
			System.out.println("Minimum value "+minimumvalue.get());
		}
	}
	public void findMax()
	{
		Optional<Product> maxbyprice=productlist.stream().max(Comparator.comparing(Product::getPrice));
		if(maxbyprice.isPresent())
		{
			Product p=maxbyprice.get();
			System.out.println("Max Value Product name "+p.getProductname());
		}
	}
	public void sortData()
	{
		List<String> sortedlist=productlist.stream().
				sorted(Comparator.comparing(Product::getProductname))
				.map(p->p.getProductname()).collect(Collectors.toList());
		sortedlist.forEach(System.out::println);
	}
	public void search()
	{
		for(Product p:productlist)
		{
			if(p.getPrice()>30000)
			{
				System.out.println("Eligible product over 30000 " +p.getProductname());
			}
		}
	}
	public static void main(String[] args) {
		ProductMain prmain=new ProductMain();
		prmain.search();
		//prmain.searchUsingStream();
		prmain.findMinimum();
		prmain.findMax();
		prmain.sortData();
	
	}

}
