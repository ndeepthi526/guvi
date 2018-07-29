	int n,q,i,j,count=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		q=s.nextInt();
		for(i=n+1;i<q;i++)
		{
		  for(j=2;j<=n;j++)
		  {
		  	if(i%j==0)
		  	{
		  		count++;
		  	}
		  }
		
		}
		if(count==0)
		{
			System.out.println(i+"");
		}
		}
}	
			
		
