package p3;

/* Animal class is abstract becoz 
 *   1) It is a Super class
 *   2) It contains abstract methods 
 *        a) doEat() : 
 *        b) doWalk() :
 *   3) doSee()  : non-abstract
 * */

abstract public class Animal {

	private int weight; // doEat() impact weight
	private int legs; // doWalk() or run() needs legs
	private int eyes ; // doSee()
	private String animalType;
	private String healthStatus = "Very Good";
	
	
	// ------------------ Constructor ----------------------
	public Animal() {	}
	
	
	public Animal(int weight, int legs, int eyes, String animalType) {
		this.weight = weight;
		this.legs = legs;
		this.eyes = eyes;
		this.animalType = animalType;
	}

	// ----------- Getters & Setters -----------------------
	
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public int getLegs() {
		return legs;
	}


	public void setLegs(int legs) {
		this.legs = legs;
	}


	public int getEyes() {
		return eyes;
	}


	public void setEyes(int eyes) {
		this.eyes = eyes;
	}


	public String getAnimalType() {
		return animalType;
	}

	public String getHealthStatus() {
		return healthStatus;
	}


	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}

	// -----------------------------  Business Methods -------------------------
	
	public void doSee()
	{
		System.out.println(animalType+" able to See through "+eyes);
	}
	


	public abstract void doEat(int foodQuantity);
	public abstract void doWalk(int distance,int speed);



	
	//----------------- to String or other Object class methods --------------
	
	@Override
	public String toString() {
		return "Animal [weight=" + weight + ", legs=" + legs + ", eyes=" + eyes + ", animalType=" + animalType + "]";
	}
	
}//end class
