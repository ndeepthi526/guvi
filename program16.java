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
		  			count = 0;
					break;
				}
				else
				{
					count = 1;
				}
			}
			if(count == 1)
			{
				System.out.println(i);
			}
		}
	}
	
}
