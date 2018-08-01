  int num = 370, number, temp, total = 0;

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
