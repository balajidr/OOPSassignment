package Ex3;
import java.util.Scanner;
public class Duplicate {

	
		int[] values=new int[5];
		int n;
		Scanner input=new Scanner(System.in);
		public Duplicate()
		{
			n=0;
		}
		
		public void push(int a)
		{	
			int i;
			for(i=0;i<n;i++)
			{
				if(values[i]==a)
					return;
			}
			values[i]=a;
			n++;
		}	
		public void initialize()
		{
			for(int i=0;i<5;i++)
				values[i]=0;
		}
		public void display()
		{
			for(int i=0;i<n;i++)
				System.out.println(values[i]);
		}
		
		public void setdata()
		{
			int u = 0;
			System.out.println("Enter any 5 values between 10 to 100");
			for(int p=0;p<5;p++)
			{
				u=input.nextInt();
				push(u);
				display();
			}
		}
			
		public static void main(String[] args) {
			Duplicate a=new Duplicate();
			a.initialize();
			a.setdata();

	}

}
