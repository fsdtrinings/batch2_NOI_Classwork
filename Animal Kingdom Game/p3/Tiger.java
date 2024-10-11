package p3;

import java.util.Scanner;

public class Tiger extends Animal implements Hunting {
	
	String strips;
	
	public Tiger() {
		super();
	}

	public Tiger(int weight, int legs, int eyes, String animalType) {
		super(weight, legs, eyes, animalType); 
		// all these properties are initializing super class properties 
	
		this.strips = "Black";
	}

	@Override   // this method belongss to hunting interface
	public int doHunt() {
		
		
		if(super.getHealthStatus().equals("Very Good"))
		{
			int weight = super.getWeight();
			weight-=20;
			super.setWeight(weight);
			
			System.out.println("Is Hunting Successful<0/1>");
			int hunting = new Scanner(System.in).nextInt();
			
			if(hunting == 0)
			{
				return 0;
			}
			else 
			{
				System.out.println("Enter Weight of Hunt");
				int foodWeight = new Scanner(System.in).nextInt();
				return foodWeight;
			}
		}
		else
		{
			int weight = super.getWeight();
			weight-=30;
			super.setWeight(weight);
			
			if(weight<50)
			{
				super.setHealthStatus("Bad");
			}
			
			return 0;
		}
		
		
		
		
	}

	@Override
	public void doEat(int foodQuantity) {
		
		int weight = super.getWeight();
		weight+=(foodQuantity*0.20);
		super.setWeight(weight);
		
	}

	@Override
	public void doWalk(int distance, int speed) {
		
		int weight = super.getWeight();
		weight-=((distance*speed)*0.05);
		super.setWeight(weight);
	}


	

}
