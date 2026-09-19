package codind;

import java.util.List;

public class Detalils {
	
	private int prodectId;
	
	private String prodectName;
	private float price;
	private String processor;
	List<Gpu> gp;
	public int getProdectId() {
		return prodectId;
	}
	public void setProdectId(int prodectId) {
		this.prodectId = prodectId;
	}
	public String getProdectName() {
		return prodectName;
	}
	public void setProdectName(String prodectName) {
		this.prodectName = prodectName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}

	
	
	public List<Gpu> getGp() {
		return gp;
	}
	public void setGp(List<Gpu> gp) {
		this.gp = gp;
	}
	public Detalils(int prodectId, String prodectName, float price, String processor, List<Gpu> gp) {
		super();
		this.prodectId = prodectId;
		this.prodectName = prodectName;
		this.price = price;
		this.processor = processor;
		this.gp = gp;
	}
	@Override
	public String toString() {
		return "Detalils [prodectId=" + prodectId + ", prodectName=" + prodectName + ", price=" + price + ", processor="
				+ processor + ", gp=" + gp + "]";
	}
	
	

}
