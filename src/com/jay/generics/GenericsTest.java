package com.jay.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

//	public static void main(String[] args) {
//		List<Animal> animals = new ArrayList<>();
//		
//		animals.add(new Animal());
//		animals.add(new Cat());
//		animals.add(new Dog());
//		animals.add(new Cow());
//		animals.add(new Carnivore());
//		animals.add(new Herbivore());
//		animals.add(new Omnivore());
//		animals.add(new Leopard());
//		animals.add(new Lion());
//		
//		
//		List<? super Animal> animals2 = new ArrayList<>();
//		animals2.add(new Animal());
//		animals2.add(new Cat());
//		animals2.add(new Dog());
//		animals2.add(new Cow());
//		animals2.add(new Carnivore());
//		animals2.add(new Herbivore());
//		animals2.add(new Omnivore());
//		animals2.add(new Leopard());
//		animals2.add(new Lion());
//		
//		List<? extends Animal> animals3 = new ArrayList<>();
//		animals3.add(new Animal());
//		animals3.add(new Cat());
//		animals3.add(new Dog());
//		animals3.add(new Cow());
//		animals3.add(new Carnivore());
//		animals3.add(new Herbivore());
//		animals3.add(new Omnivore());
//		animals3.add(new Leopard());
//		animals3.add(new Lion());
//		
//		List<? super Carnivore> animals4 = new ArrayList<>();
//		animals4.add(new Animal());
//		animals4.add(new Cat());
//		animals4.add(new Dog());
//		animals4.add(new Cow());
//		animals4.add(new Herbivore());
//		animals4.add(new Omnivore());
//		animals4.add(new Carnivore());
//		animals4.add(new Leopard());
//		animals4.add(new Lion());
//		
//	
//		
//		List<? extends Carnivore> animals5 = new ArrayList<>();
//		animals5.add(new Animal());
//		animals5.add(new Cat());
//		animals5.add(new Dog());
//		animals5.add(new Cow());
//		animals5.add(new Herbivore());
//		animals5.add(new Omnivore());
//		animals5.add(new Carnivore());
//		animals5.add(new Leopard());
//		animals5.add(new Lion());
//		
//		List<? super Lion> animals6 = new ArrayList<>();
//		animals6.add(new Lion());
//		animals6.add(new Leopard());
//		animals6.add(new Carnivore());
//		animals6.add(new Animal());
//		
//		
//		List<? extends Lion> animals7 = new ArrayList<>();
//		animals7.add(new Lion());
//		animals7.add(new Leopard());
//		animals7.add(new Carnivore());
//		animals7.add(new Animal());
//		
//		
//		test(animals);
//		test(animals2);
//		test(animals3);
//		test(animals4);
//		test(animals5);
//		test(animals6);
//		test(animals7);
//		
//		List<Carnivore> animals8 = new ArrayList<>();
//		List<Lion> animals11 = new ArrayList<>();
//		animals8.add(new Cat());
//		animals8.add(new Animal());
//		animals8.add(new Lion());
//		animals8.add(new Leopard());
//		animals8.add(new Carnivore());
//		animals8 = animals11;
//		List<Herbivore> animals9 = new ArrayList<>();
//		List<Omnivore> animals10 = new ArrayList<>();
//		
//	}	
	
	
	public static void test(List<? super Animal> animals) {
		
	}
}