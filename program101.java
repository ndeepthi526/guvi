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
		int n;
		Scanner s=new Scanner(System.in);
		str=s.next();
		n=s.nextInt();
		for(int i=str.length()-n;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
		
	}
}
