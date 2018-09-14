/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if(n>=-32768 && n<=32767)
		{
			System.out.println("INT");
		}
		else if(n>=-2147483648 && n<=2147483647)
		{
			System.out.println("LONG");
		}
	}
}
