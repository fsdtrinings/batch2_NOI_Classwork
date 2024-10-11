package p3;

import java.util.Scanner;

// act as Main class
public class AnimalApp {

	public static void main(String[] args) {

		AnimalApp appUser = new AnimalApp();

		while (true) {

			System.out.println(" ---- Choose Animal ------");
			System.out.println("1. Tiger");
			System.out.println("2. Cow");
			System.out.println("3. Cat");
			System.out.println("9. Display Weight & Health");
			System.out.println("0. EXIT");

			System.out.println("Enter ur Choice");
			int animalType = new Scanner(System.in).nextInt();

			switch (animalType) {
			case 1: {
				Tiger t = new Tiger(120, 4, 2, "Tiger");
				appUser.gameScreenWithOptions(t);
				break;
			}
			case 2: // code for cow
			case 3: {
				Cat cat = new Cat(8, 4, 2, "Cat");
				appUser.gameScreenWithOptions(cat);
				break;
			}

			default: {
				System.out.println("Wrong option");
			}

			}// end of Switch

		} // end while
	}// end main

	public int gameScreenWithOptions(Animal userSelectedAnimal) {
		while (true) {
			System.out.println(" Game Option");
			System.out.println("1. Hunting ");
			System.out.println("2. Walking ");
			System.out.println("3. See (Identify Food)");
			System.out.println("0. Change Animal");

			System.out.println("Enter Animal Action : ");
			int animalAction = new Scanner(System.in).nextInt();

			switch (animalAction) {
			case 1:
				doHuntingWithAnimal(userSelectedAnimal);
				break;
			case 2:
			case 3:
			case 0: return 0; // return 0 , which we are not saving anywhere ... gives void result
			}// end switch

		} // end of while : use for playing with same animal again & again

	}

	public void displayDetails(Animal animal) // default print on top screen of App
	{
		System.out.println("Weight " + animal.getWeight() + " - Health Status " + animal.getHealthStatus());
	}

	public void doHuntingWithAnimal(Animal animal) // make a common method
	{
		if(animal instanceof Tiger)
		{
			Tiger t = (Tiger) animal;
			int foodQuantity = t.doHunt();
			animal.doEat(foodQuantity);
		}
		if(animal instanceof Cat)
		{
			Cat cat = (Cat) animal;
			int foodQuantity = cat.doHunt();
			animal.doEat(foodQuantity);
		}
		// Dog
		
		// Cow
		
		// ....
		
		
		//....
		displayDetails(animal);
	}

}// end class
