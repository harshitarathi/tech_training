package Day12;
import java.util.*;
//defining class....................................
class Product{
	private int id;
	private String name;
	private double price;
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id=id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public double getprice() {
		return price;
	}
	public void setprice(double price) {
		this.price=price;
	}
}

public class Productcatalogue {

	public static void main(String[] args) {
		// taking input......................
		ArrayList<Product>plist=new ArrayList<Product>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of product which you want you to add in catalogue");
		int size=sc.nextInt();
		for(int i=1;i<=size;i++) {
			System.out.println("enter the id of product");
			int id=sc.nextInt();
			System.out.println("enter the name of product");
			String name=sc.next();
			System.out.println("enter the price of product");
			double price=sc.nextDouble();
	//creating object.....................................
			Product p=new Product();
	//setting values...............................
			p.setid(id);
			p.setname(name);
			p.setprice(price);
			
			plist.add(p);
		}
	//finding details.......................
			System.out.println("enter the id for getting the product details");
			int search=sc.nextInt();
			boolean found=false;
			for(Product p:plist)
			{
			   if(p.getid()==search)
			   {
				   System.out.println(" Product found with \nid "+p.getid());
				   System.out.println("Name:"+p.getname());
				   System.out.println("Price:"+p.getprice());
				   found=true;
				   break;
			   }
			}
			if(found==false)
			System.out.println("Product Not found");

			
		}

	}

