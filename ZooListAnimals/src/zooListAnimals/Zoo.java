package zooListAnimals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zoo {
	
	List<Animals> Animals = new ArrayList<Animals>();
	Dog dog = new Dog();
	Cat cat = new Cat();
	Owl owl1 = new Owl(12,"grey");
	Eagle eagle = new Eagle();
	
	public List<Animals> createList(){
		Animals.add(dog);
		Animals.add(cat);
		Animals.add(owl1);
		Animals.add(eagle);
		return Animals;
	}
	
	public void mammalList(){
		Animals.stream().filter(creature -> creature instanceof Mammals).toList();
	}
	
	public List<Animals> birdList(){
		return Animals.stream().filter(creature -> creature instanceof Birds).collect(Collectors.toList());
	}
	
	
	
}
