/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,flag=1,i;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				if(n/i<1)
				{
					flag=1;
				}
			}
		}
		if(flag==1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
	
