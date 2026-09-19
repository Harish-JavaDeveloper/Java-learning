package codind;

public class Gpu {

	private String gpu_Brands;
	private String gpu;
	private int vRam;
	public String getGpu_Brands() {
		return gpu_Brands;
	}
	public void setGpu_Brands(String gpu_Brands) {
		this.gpu_Brands = gpu_Brands;
	}
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	public int getvRam() {
		return vRam;
	}
	public void setvRam(int vRam) {
		this.vRam = vRam;
	}
	@Override
	public String toString() {
		return "Gpu [gpu_Brands=" + gpu_Brands + ", gpu=" + gpu + "]";
	}
	public Gpu(String gpu_Brands, String gpu) {
		super();
		this.gpu_Brands = gpu_Brands;
		this.gpu = gpu;
	}
	
	
	
	
}
