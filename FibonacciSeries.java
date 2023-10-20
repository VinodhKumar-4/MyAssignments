
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c;
		int range=30;
		System.out.println(a);
		System.out.println(b);
		for(int j=0;j<=range;j++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
