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
		Scanner s=new Scanner(System.in);
		str=s.next();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)%2!=0)
			{
				System.out.println(str.charAt(i)+" ");
			}
		}
	}
}
