package tester;
import practice.*;
import java.util.Scanner;
public class TestOrg{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the maximun Number of Employees");
		Employee[] emp = new Employee[scan.nextInt()];
		boolean flag=true;
		int counter=0;
		do{
			System.out.println("1.Hire Manager");
			System.out.println("2.Hire Worker");
			System.out.println("3.Get Details");
			System.out.println("4.Employee Specific Details");
			System.out.println("5.Fire an Employee");
			System.out.println("6.Salary Increment");
			System.out.println("7.Exit");
				switch(scan.nextInt()){
				case 1:	if(counter == emp.length){
							System.out.println("Memory full");
							break;
						}
						scan.nextLine();
						System.out.println("Enter Name,Email,Department Id,Basic Salary,Performance Bonus");
						emp[counter++] = new Manager(scan.nextLine(),scan.nextLine(),scan.nextInt(),scan.nextDouble(),scan.nextDouble());
						scan.nextLine();
						break;
				case 2:	if(counter == emp.length){
							System.out.println("Memory full");
							break;
						}
						scan.nextLine();
						System.out.println("Enter Name,Email,Department Id,Basic Salary,Hours Worked, Hourly Rate");
						emp[counter++] = new Worker(scan.nextLine(),scan.nextLine(),scan.nextInt(),scan.nextDouble(),scan.nextInt(),scan.nextDouble());
						break;
				case 3: for(int i=0;i<counter;i++){
							System.out.println(emp[i]);
						}
						break;
				case 4: flag=true;
						System.out.println("Enter Employee Id");
						int temp = scan.nextInt();
						for(int i=0;i<counter;i++){
							if(emp[i].getId()==temp){
								System.out.println(emp[i]);
								flag=false;
								break;
							}
						}
						if(flag){
							System.out.println("Invalid Id");
						}
						break;
				case 5:	flag=true;
						System.out.println("Enter Employee Id to fire");
						temp = scan.nextInt();
						for(int i=0;i<counter;i++){
							if(emp[i].getId()==temp){
								emp[i]=null;
								for(int j=i;j<counter;j++){
									emp[j]=emp[j+1];
								}
								counter--;
								System.out.println("Fired Successfully");
								flag=false;
								break;
							}
						}
						if(flag){
							System.out.println("Invalid Id");
						}
						break;
				case 6: 
						break;
				case 7:	if(scan!=null)
						scan.close(); 
						return;
				}
				
			}while(true);
	}

}
