package p3;

public class Cow extends Animal{

	@Override
	public void doEat(int foodQuantity) {
		
		int weight = super.getWeight();
		weight+=(foodQuantity*0.40);
		super.setWeight(weight);
		
	}

	@Override
	public void doWalk(int distance, int speed) {
		
		int weight = super.getWeight();
		weight-=((distance*speed)*0.02);
		super.setWeight(weight);
		
	}
	
	

}
