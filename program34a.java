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
		int count=0;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i )== '.' || str.charAt(i)==' ')
			{
				count=count+1;
			}
		}
			System.out.println(count);
		
	}
}

	
