package p1;

public class Dog extends Animal {

	private String name;
	private String dress;

	public Dog() {
		super();
		System.out.println("Dog Constructor");
	}

	@Override
	public void doEat() {
		System.out.println("Dog eat food method");
	}

	public void doPlayGames() {
		System.out.println("Dog play Games Called ");
	}

}
