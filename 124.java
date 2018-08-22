/* package whatever; // don't place package name! */
import java.util.Random;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Random r=new Random();
		int d=1+r.nextInt(10);
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++)
		{
			int n=sc.nextInt();
			if(d==n)
			{
				System.out.println("yes");
				break;
			}
			else
			{
				System.out.println("no");
			}
		}
	}
}
