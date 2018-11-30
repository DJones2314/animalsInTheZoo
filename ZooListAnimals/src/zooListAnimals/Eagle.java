package zooListAnimals;

public class Eagle extends Birds implements Noises {
	
		public String makeNoise() {
			return "screech";
		};
		
		public String eat() {
			return "With beak";
			
		}
	
		
		public String killedPrey() {
			return "mouse";
		};

}
