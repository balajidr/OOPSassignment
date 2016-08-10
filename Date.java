package Ex2;

import java.util.Scanner;

public class Date {
	int month;
	int day;
	int year;
	
	public Date(){
		month=0;
		day=0;
		year=0;
	}
	
	Scanner input =new Scanner(System.in);
	public int getmonth()
	{
		return month;
	}
	public int getday()
	{
		return day;
	}
	public int getyear()
	{
		return year;
	}
	
	public void setmonth()
	{
		System.out.println("Enter the month(1-12)");
		month=input.nextInt();
	}
	public void setday()
	{
		System.out.println("Enter the day(1-31)");
		day=input.nextInt();
	}
	public void setyear()
	{
		System.out.println("Enter the year");
		year=input.nextInt();
	}
	
	public void displaydata(){
		System.out.println(getmonth()+"/"+getday()+"/"+getyear());
	}
	
	public static void main(String[] args) {
		Date D1= new Date();
		D1.setmonth();
		D1.setday();
		D1.setyear();
		D1.displaydata();
	}

}
