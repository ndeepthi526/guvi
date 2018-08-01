  int num, number, temp, total = 0;
Scanner s=new Scanner(System.in);
num=s.nextInt();
number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number = number/ 10;
        }

        if(total == num)
            System.out.println("yes");
        else
            System.out.println("no");
    }
