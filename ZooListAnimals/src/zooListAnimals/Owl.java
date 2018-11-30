package zooListAnimals;

public class Owl extends Birds implements Noises{
	
	int size;
	
	String colour;
	
	public Owl() {
		size = 0;
		colour = "brown";
	}
	
	public Owl(int vSize, String vColour) {
		this.colour = vColour;
		this.size = vSize;
	}
	
	
	public String makeNoise() {
		return "Hoot";
	};
	
	
	

}
