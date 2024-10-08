package insurance;

import java.util.Random;

class InsuranceUtil
{
	
	final int SUMASSUREDAmount = 500000;
	
	
	public int getPremium(char gender,int age)
	{
		int surChargeAmount = 0;
		
		
		
		// --- code to calculate
		if(gender == 'm' || gender == 'M')
		{
			if(age >30 && age <=50)
			{
				int x = age - 30;
				if(x == 0) x = 1;
				
				surChargeAmount = (int)((SUMASSUREDAmount*0.07)/100)*x;
			}
			else if(age>50 && age<=70)
			{
				int x = age - 50;
				if(x == 0) x = 1;
				
				
				surChargeAmount = (int)((SUMASSUREDAmount*0.10)/100)*x;
			}
			
			
		}
		if(gender == 'f' || gender == 'F')
		{
			if(age<=30)
			{
				
			}
			else if(age >30 && age <50)
			{
				
			}
			else if(age>50 && age<=70)
			{
				
			}
			else
			{
				return 10000;
			}
			
		}
		
		
		
		return surChargeAmount;
	}
	
	

}//

public class ApplicationDemo {

	public static void main(String[] args) {
	
		ApplicationDemo insuranceApp = new ApplicationDemo();
		InsuranceUtil obj = new InsuranceUtil();
		
		int basePremiumMale = 8000;
		// ----- case 1 ----
		System.out.println("\n============ Case 1 when Male , age below 30 =======\n");
		
		insuranceApp.printInsuranceDetails("ramesh",20,'M',8000,0);
		
		
		// ----- case 2 ----
		System.out.println("\n============ Case 2 when Male , age 40 =======\n");
		int age = 40;
		int basePremiumMalePolicy_M1 = 8000;
		
		int surcharged = obj.getPremium('M', age);
		
		
		insuranceApp.printInsuranceDetails("Suresh kumar",40,'M',basePremiumMalePolicy_M1,surcharged);
		
		// ----- case 3 ----
		System.out.println("\n============ Case 3 when Male , age 69 =======\n");
		age = 69;
		int basePremiumMalePolicy_M2 = 15000;
		surcharged = obj.getPremium('M', age);
		
		
		insuranceApp.printInsuranceDetails("Suresh kumar",40,'M',basePremiumMalePolicy_M2,surcharged);
		
		
		
	}
	
	public void printInsuranceDetails(String username,int age,char gender,int basepremiumAmount,int surChargeAmount)
	{
		int insuranceId = getInsuranceId();
		
		System.out.println("Name : "+username+" Insurance Id "+insuranceId);
		System.out.println("Age "+age+" Gender "+gender);
		System.out.println("Sum Assured "+500000);
		System.out.println("Premium Amount \n");
		System.out.println("\t Base Premium "+basepremiumAmount);
		System.out.println("\t Sur Charged Amount  "+surChargeAmount);
		System.out.println("\t Total Premium  "+(basepremiumAmount+surChargeAmount));
		
	}
	
	
	public int getInsuranceId()
	{
		// in actual code , should come from DB
		/*Random random = new Random();
		int id = random.nextInt(100000);
		return id;*/
		
		return new Random().nextInt(100000);
		
	}
	
	
	
	
}//end class




