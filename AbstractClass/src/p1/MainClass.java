package p1;

public class MainClass {

	public static void main(String[] args) {

		MainClass kidsApp = new MainClass();

		Animal a = new Dog();
		// = new Dog();
		a.doEat();
		a.doWalk();

		// type casting
		// short s = (short)10;
		if (a instanceof Dog) {
			Dog d = (Dog) a;
			d.doPlayGames();
		}
		if (a instanceof Cat) {
			Cat c = (Cat) a;
			c.doHuntRat();
		}

	}

	public Animal chooseAnimal() {

		return new Dog();
	}

}
