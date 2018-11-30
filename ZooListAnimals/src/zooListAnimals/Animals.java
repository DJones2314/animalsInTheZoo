package zooListAnimals;

public abstract class Animals {

//////////////////////////Attributes///////////////////////////
	String type;
	String noise;
	int age;
	
	
////////////////////////Constructors//////////////////////////
	public Animals() {
		type = "";
		noise = "";
		age = 0;
	}
	public Animals(String vType, String vNoise, int vAge) {
		this.type=vType;
		this.noise=vNoise;
		this.age=vAge;
	}

///////////////////////Methods///////////////////////////////
	public abstract String eat();
	
	
	
}
