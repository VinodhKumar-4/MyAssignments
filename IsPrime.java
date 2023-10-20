import java.util.*;
public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int count=0;
		Scanner vr=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=vr.nextInt();
		
		for (int i = 1; i <=num; i++) 
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(num + "is prime");
		}
		else
		{
			System.out.println(num + "is not prime");
		}
		
		
		
				
			}
		}
		
 
		
