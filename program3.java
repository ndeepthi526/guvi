
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		char chr;
		Scanner S=new Scanner(System.in);
		chr=S.next().charAt(0);
		if(chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u')
		{
			System.out.println("vowel");
		}
		else
		{
			System.out.println("Consonants");
		}
	}
}
