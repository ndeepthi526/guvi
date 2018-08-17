/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str;
		int n=0;
		Scanner s=new Scanner(System.in);
		str=s.next();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				n=1;
				
			}
		}
		if(n==1)
		{
			System.out.println("yes");
		}
			else
			{
				System.out.println("no");
			}
		
	}
}
