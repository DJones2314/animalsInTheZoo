package zooListAnimals;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		Zoo newZoo = new Zoo();
		
		System.out.println(newZoo.createList());
		newZoo.createList();
		newZoo.mammalList();
	//	System.out.println(newZoo.mammalList());

		
		
		
		// TODO Auto-generated method stub

				//List<Animals> Animals = new ArrayList<Animals>();
				// List<Birds> flying = new ArrayList<Birds>();
				// List<Mammals> crawling = new ArrayList<Mammals>();
				
		//List<Animals> walks = Animals.stream().filter(creature -> onlyPrime(primeNumbers)).forEach(action);

		//System.out.println(oddNumbers);
		
		
		
		//public static boolean placeCreature() {
		//	return null;
		//}

		// forloop or stream

		// Animals.stream().filter(animal -> animal instanceof Birds).forEach(animal ->
		// flying.add((Birds) animal));

		// Animals.stream().filter(animal -> animal instanceof Mammals).forEach(animal
		// -> crawling.add((Mammals) animal));

		/*
		 * if(Animals instanceof Birds) { Animals.stream().toString(animal -> animal
		 * instanceof Birds).forEach()); }
		 */

		// crawling.stream().collect(Collectors.toList());
		// flying.stream().collect(Collectors.toList());

		/*
		 * public String toString() { return "Name: " + this. }
		 */

		// crawling.stream().forEach(System.out::println);

	
	}
}
