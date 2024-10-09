package p1;

public class MainClass {

    public static void main(String[] args) {

        MainClass app = new MainClass();


        Employee e1 = app.createEmployee(true,101,"Ramesh");
        Employee e2 = app.createEmployee(false,102,"Mike");
        Employee e3 = app.createEmployee(false,103,"Jenny");
        Employee e4 = app.createEmployee(false,104,"Raj");


        Employee arr[] = {e1,e2,e3,e4};

        for ( Employee e  : arr  )
        {
            // check the wifi status
            if(e.getLaptop().isWifi() == false)
            {
                System.out.println(e); // HASHCODE
            }
        }



    }//end main

    public Employee createEmployee(boolean wifiStatus,int empId,String name)
    {
        // is to generate Employee & return
        //1) write code to create Employee


        //  public Employee(int id, String name, Laptop laptop)
        Laptop laptop = createLaptops(wifiStatus);
        Employee emp = new Employee(empId,name,laptop);


        //2) write code to return Employee
        return emp;
    }

    public Laptop createLaptops(boolean wifiStatus)
    {
        // is to generate laptop & return
        //1) write code to create laptop
        Laptop l = new Laptop(wifiStatus);

        //2) write code to return laptop

        return l;
    }

}//end class
