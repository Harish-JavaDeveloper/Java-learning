package codind;

import java.util.ArrayList;
import java.util.List;

public class MainPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Detalils in = new Detalils();
//		in.setProdectId(1);
//		in.setProdectName("Hp");
//		in.setProcessor("Ryzen 5 9950");
//		in.setPrice(55000.54f);
//		
//		Detalils p1 = new Detalils();
//		p1.setProdectId(2);
//		p1.setProdectName("Asus");
//		p1.setProcessor("Ryzen 9 9500 X3D");
//		p1.setPrice(90950.19f);
//		
//		Detalils p2 = new Detalils();
//		
//		p2.setProdectId(3);
//		p2.setProdectName("Gigabyte");
//		p2.setProcessor("Ryzen 9 9900 X3D w");
//		p2.setPrice(109999.32f);
//		
//		Detalils p3 = new Detalils();
//		p3.setProdectId(4);
//		p3.setProdectName("Acer");
//		p3.setProcessor("I5 with");
//		p3.setPrice(50000.89f);
//		
//		Detalils d1= new Detalils(5, "Victus", 6000.65f, "Ryzen 9 ");
//		
//		
//		System.out.println(in.toString());
//		System.out.println(p1.toString());
//		System.out.println(p2.toString());
//		System.out.println(p3.toString());
//		System.out.println(d1.toString());
//		
//		System.out.println("Using List");
//		
//		List<Object> li =new ArrayList<Object>();
//		li.add(in);
//		li.add(p1);
//		li.add(p2);
//		li.add(p3);
//		li.add(d1);
//		for(Object  a : li) {
//			System.out.println(a.toString());
//		}
		
		List<Gpu> li=new ArrayList<Gpu>();
		Gpu g1 =new Gpu("Nvdia", "RTX 5090");
		Gpu g2= new Gpu("AMD", "RX 9050");
		li.add(g1);
		li.add(g2);
		
		
		
		Detalils d1 = new Detalils(1, "HP",45000.7f, "Intel i5", li);
		
		
		System.out.println(d1.toString());
		
		
		
		
		
		
		
	
	}

}
