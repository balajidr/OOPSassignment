package Ex4;
import java.util.Scanner;
import java.util.Array;
public class Sales {
	Scanner input=new Scanner(System.in);
	int count;
	int[] salesSalary;
	int[] counts=new int[9];
	public void set()
	{
		System.out.println("Enter the size of the array");
		count=input.nextInt();
		salesSalary=new int[count];
	}
	public void setData()
	{
		System.out.println("Enter sales grosses for all the employees one by one");
		for(int i=0;i<salesSalary.length;i++)
		{
			salesSalary[i]=input.nextInt();
		}
	}
	public void cal()
	{
		for(int i=0;i<salesSalary.length;i++)
		{
			salesSalary[i]=(int) (200+(0.09)*salesSalary[i]);
				
		}
	}
	public void group()
	{
		for(int k=0;k<counts.length;k++)
			counts[k]=0;
		for(int j=0;j<salesSalary.length;j++)
		{
			if((salesSalary[j]>=200) && (salesSalary[j]<300))
				counts[0]++;
			else if((salesSalary[j]>=300) && (salesSalary[j]<400))
				counts[1]++;
			else if((salesSalary[j]>=400) && (salesSalary[j]<500))
				counts[2]++;
			else if((salesSalary[j]>=500) && (salesSalary[j]<600))
					counts[3]++;
			else if((salesSalary[j]>=600) && (salesSalary[j]<700))
					counts[4]++;
			else if((salesSalary[j]>=700) && (salesSalary[j]<800))
					counts[5]++;
			else if((salesSalary[j]>=800) && (salesSalary[j]<900))
					counts[6]++;
			else if((salesSalary[j]>=900) && (salesSalary[j]<1000))
					counts[7]++;
			else counts[8]++;
		}
		System.out.println("200-299 300-399 400-499 500-599 600-699 700-799 800-899 900-999 1000above");
		for(int k=0;k<counts.length;k++)
				System.out.printf(" |  "+counts[k]+ " | ");
		
		}
		
	
	public static void main(String[] args) {
	Sales s1=new Sales();
	s1.set();
	s1.setData();
	s1.cal();
	s1.group();

}}
