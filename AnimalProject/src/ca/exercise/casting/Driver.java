package ca.exercise.casting;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();
		
		//create object
		Dog d1 = new Dog("Puppy");
		Fish f1 = new Fish("Captain");
		Bird b1 = new Bird("Sunny");
		Dog d0 = null;
		
		animals.add(d1);
		animals.add(f1);
		animals.add(b1);
		animals.add(d0);
	
		for (Animal a : animals) {
			if (a instanceof Dog) {
				//downcasting
				Dog d2 = (Dog)a;
				System.out.println("I am " + d2.getName());
				d2.Jump();
			} else if (a instanceof Bird) {
				Bird b2 = (Bird)a;
				System.out.println("I am " + b2.getName());
				b2.Fly();
			} else if (a instanceof Fish) {
				Fish f2 = (Fish)a;
				System.out.println("I am " + f2.getName());
				f2.Swim();
			} else {
				System.out.println("Something went wrong");
			}
		}
		
		/*
		 
		 
		//upcasting
		Animal a1 = new Dog("Puppy");
		System.out.println(a1.getName()); //Puppy

		//downcasting but runtime error
		//Fish f2 = (Fish)new Animal("FishName");
		//System.out.println(f2.getName());
		
		//downcasting
		Animal a2 = new Fish("Captain");
		Fish f3 = (Fish)a2;
		System.out.println(f3.getName()); //Captain
		
		Animal a3 = new Bird("Tiki");
		Bird b2 = (Bird)a3;
		System.out.println(b2.getName());
		
		Animal a4 = null;
		
		System.out.println(a1 instanceof Animal); //true
		System.out.println(a1 instanceof Dog); //true
		System.out.println(a1 instanceof Bird); //false
		System.out.println(a2 instanceof Dog); //false
		System.out.println(a4 instanceof Animal); //false
		System.out.println(d1 instanceof Dog); //true
		System.out.println(d1 instanceof Animal); //true
		
		//downcasting and instanceof
		Animal a5 = new Bird("Sunshine");
		if (a5 instanceof Bird) {
			Bird b3 = (Bird)a5;
			System.out.println(a5.getName());
		} else {
			System.out.println("Datatype is not correct. Class cast exception");
		}
		
		*/
		
	}
}
