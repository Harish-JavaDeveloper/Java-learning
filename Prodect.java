package comparitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prodect {
	
	int ProdectId;
	String ProdectName;
	int price;
	
	

	public Prodect(int prodectId, String prodectName, int price) {
		super();
		ProdectId = prodectId;
		ProdectName = prodectName;
		this.price = price;
	}

	

	@Override
	public String toString() {
		return "Prodect [ProdectId=" + ProdectId + ", ProdectName=" + ProdectName + ", price=" + price + "]";
	}



	public static void main(String[] args) {
		List<Prodect> ProdectList = new ArrayList<Prodect>();
		Prodect p = new Prodect(101, "Laptop", 55000);
		Prodect p1 = new Prodect(102, "mobile", 40000);
		Prodect p2 = new Prodect(103, "Mouse", 500);
		Prodect p3 = new Prodect(104, "Keyboard", 650);
		Prodect p4= new Prodect(105, "Monitor", 7000);
		
		ProdectList.add(p);
		ProdectList.add(p1);
		ProdectList.add(p2);
		ProdectList.add(p3);
		ProdectList.add(p4);
		Collections.sort(ProdectList,(a,b) -> b.price - a.price);
		System.out.println(ProdectList);
		
		
	}

}
