/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,c,f=0,i;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		for(i=b;i<=c;i++)
		{
			if(i==a)
			{
				f=1;
				break;
			}
		}
			if(f==1)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
			
		}
	}
