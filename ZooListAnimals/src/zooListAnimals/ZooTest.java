package zooListAnimals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//import Zoo.Animals;
import zooListAnimals.Owl;

public class ZooTest {
	
	
	
	@Test
	public void owlTest(){
		Owl owl = new Owl(55, "brown");
		assertEquals("The owl goes hoot", owl.makeNoise(),"Hoot");
	}
	

	@Test
	public void dogTailTest() {
		Dog dog = new Dog();
		assertEquals("How many times the dog wagged its tail", dog.wagTail(), 7);
	}
	
	@Test 
	public void eatTest() {
		Dog dog1 = new Dog();
		assertEquals("how does the dog eat?", dog1.eat(), "With mouth");
	}
	
	@Test
	public void preyTest() {
		Eagle eagle = new Eagle();
		assertEquals("what did the eagle kill?", eagle.killedPrey(), "mouse");
	}
	

}
