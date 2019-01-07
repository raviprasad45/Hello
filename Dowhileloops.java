import java.util.*;
public class Dowhileloops
{
	public static void main(String args[])
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The number");
		n=sc.nextInt();
		do
		{
			System.out.println(" "+n);
			n++;
		}
		while(n<10);
	}
}