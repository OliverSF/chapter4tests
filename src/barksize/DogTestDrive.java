package barksize;

import java.util.Scanner;

public class DogTestDrive {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Create new Dog Objects
		Dog one = new Dog();
		
			System.out.print("What is the name of your dog ");
			one.name = input.next();
			System.out.print("What is the size of your dog ");
			one.size = input.nextInt();
		
		Dog two = new Dog();
		
			System.out.print("What is the name of your dog ");
			two.name = input.next();
			System.out.print("What is the size of your dog ");
			two.size = input.nextInt();
			
		Dog three = new Dog ();
			
			System.out.print("What is the name of your dog ");
			three.name = input.next();
			System.out.print("What is the size of your dog ");
			three.size = input.nextInt();
		
		System.out.print(one.name + " says ");
		one.bark();
		
		System.out.print(two.name + " says ");
		two.bark();
		
		System.out.print(three.name + " says ");
		three.bark();
		
		input.close();
		

	}

}
