/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,c;
		char ch;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		ch=s.next().charAt(0);
		switch(ch)
		{
			case '/':
				c=a/b;
				System.out.println(c);
				break;
			case '%':
				c=a%b;
				System.out.println(c);
				break;
		}
	}
}
			
		
	
