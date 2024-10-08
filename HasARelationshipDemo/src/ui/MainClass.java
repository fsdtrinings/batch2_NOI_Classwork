package ui;

import backend.EmployeeOperations;
import entity.Employee;
import entity.Laptop;

import java.util.Random;
import java.util.Scanner;

public class MainClass {

    EmployeeOperations ops = new EmployeeOperations();
    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        MainClass app = new MainClass();

        while(true) {




        System.out.println("---- MENU -----");
        System.out.println("1. Add Employee");
        System.out.println("2. Show All Employee");
        System.out.println("3. Show Employee By Id");
        System.out.println("4. Show Employees By project");
        System.out.println("5. Show Employees By Location");
        System.out.println("6. Show Employees By Salary Range");
        System.out.println("7. Allocate Laptop to Employee");
        System.out.println("8. Show Employee's Laptop Detail");
        System.out.println("9. Show Employee by Laptop");

        System.out.println("0. Exit");



        System.out.println("Enter your choice: ");
        int choice = new Scanner(System.in).nextInt();
        switch (choice) {

            case 0: System.exit(0);

            case 1: app.addEmployee();
            break;

            case 2: app.showAllEmployees();
            break;

            case 3: app.filterEmployeeById();
            break;

            case 7: app.allocateLaptopEmployee();
            break;

            case 9: app.filterEmployeeByLaptop();
            break;

            default:
                    System.out.println("Wrong option!!!");

        }//end switch

            }//end while


    }//end main


    public void addEmployee() {
        System.out.println("Enter Employee Name ");
        String name = sc.nextLine();
        System.out.println("Enter Employee Salary ");
        int salary = Integer.parseInt(sc.nextLine());
        int id = new Random().nextInt(5000);

        Employee temp = new Employee(id,name,salary,null);

        boolean status = ops.insertEmployee(temp);
        if (status) {
            System.out.println("Employee Added Successfully "+id);
        }
        else System.out.println("Insertion Error , Contact to Admin!!!");
    }

    public void filterEmployeeByLaptop()
    {
        System.out.println("Enter Laptop Serial Number ");
        String searialNumber = sc.nextLine();


    }

    public void showAllEmployees() {

        Employee allEmployee[] = ops.getAllEmployees();
        int postion = ops.getPosition();

        for (int i = 0; i < postion ; i++) {
           printEmployee(allEmployee[i]);
        }
    }

    public int getUserInputEmployeeId(){
        System.out.println("Enter Employee ID ");
        int id = Integer.parseInt(sc.nextLine());
        return id;
    }

    public void filterEmployeeById() {
        int id =getUserInputEmployeeId();
        Employee employee = ops.getEmployeeById(id);
        if (employee != null) {
            printEmployee(employee);
        }
        else {
            System.out.println("Employee Not Found "+id+", Search Again ");
        }

    }

    public void allocateLaptopEmployee() {


        int id =getUserInputEmployeeId();

        System.out.println("Enter Laptop BrandName");
        String brandName = sc.nextLine();

        System.out.println("Enter Laptop Serial Number");
        String sNo = sc.nextLine();

        Laptop laptop = new Laptop(brandName,sNo);

        Employee emp = ops.allocateLaptop(id,laptop);

    }

    public void printEmployee(Employee emp) {
        System.out.println("Employee ID "+emp.getId()+" Name "+emp.getName()+" Salary "+emp.getSalary());
        if(emp.getLaptop() != null) {
            System.out.println("Laptop Brand "+emp.getLaptop().getBrand()+" Serial Number "+emp.getLaptop().getsNO());
        }
        else {
            System.out.println("Laptop : null");
        }
        System.out.println("----------------------------------------------------------------------------------");
    }
}//end class
