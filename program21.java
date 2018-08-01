/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,a,d,s;
		Scanner S=new Scanner(System.in);
		n=S.nextInt();
		a=S.nextInt();
		d=S.nextInt();
		s=(n*(2*a+(n-1)*d))/2;
		System.out.println(s);
	}
}
