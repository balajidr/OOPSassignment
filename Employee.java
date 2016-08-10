import java.util.*;
public class Employee {
public String firstName,lastName;
double monthSal;

public Employee()
{
	firstName=" ";
	lastName=" ";
	monthSal=0;
}
Scanner input=new Scanner(System.in);
public void setfirst()
{
	System.out.println("Enter the firstname");
	firstName=input.next();
}
public void setlast()
{
	System.out.println("Enter the lastname");
	lastName=input.next();
}
public void setsal()
{
	double d;
	System.out.println("Enter the salary");
	d=input.nextDouble();
	if(d>=0)
		monthSal=d;
}


public String getfirst()
{
	return firstName;
}
public String getlast()
{
	return lastName;
}
public double getsal()
{
	return monthSal;
}




public void display()
{
	System.out.println("  The firstname is :"+ getfirst()+" \n  The lastname is :"+ getlast()+"\n  Incremented Monthly Salary is  :"+getsal());
	
}
public void calc()

{
	monthSal=monthSal+0.1*monthSal;
    
}


	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2=new Employee();
		e1.setfirst();e1.setlast();e1.setsal();
		e2.setfirst();e2.setlast();e2.setsal();

		e1.calc();
		e2.calc();
		e1.display();
		e2.display();
System.out.println("  yearly salary of "+e1.firstName+" "+e1.lastName+" is "+ e1.monthSal*12);
System.out.println("  yearly salary of "+e2.firstName+" "+e2.lastName+" is "+ e2.monthSal*12);
	}

}
