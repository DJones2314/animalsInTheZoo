package zooListAnimals;

public class Dog extends Mammals implements Noises{
//////////////////////////Attributes///////////////////////////

	

////////////////////////Constructors//////////////////////////

	public Dog() {
		
	}
	
///////////////////////Methods///////////////////////////////
  
	public int wagTail() {
		return 7;
	};
	
	public String eat(){
		return "With mouth";
  };

  public String makeNoise() {
	  return "woof!";
  };


	
	
	
}
