class prime_assignment{
         public static void main(String[] args)
	  {
         int[]assign = new int[10];
		 
		 assign[0] = 1;
		 assign[1] = 2;
		 assign[2] = 3;
		 assign[3] = 4;
		 assign[4] = 5;
		 assign[5] = 6;
		 assign[6] = 7;
		 assign[7] = 8;
		 assign[8] = 9;
		 assign[9] = 10;
		 
         int prime = 0, not_prime = 0;
		 for(int i=0; i<assign.length; i++)
		 {
			 for(int k=2; k<assign.length; k++)
			 {
			 if(assign[i]%k == 0)

             {
				System.out.println(assign[i] + " is not prime number ");
				not_prime++;
				break;
                
			 }
			 else if(assign[i] == 0 || assign[i] == 1)
			 {
				 System.out.println(assign[i] + " is not prime number ");
				 not_prime++;
				 break;
				 
			 }
			 else
			 {
				 System.out.println(assign[i] + " is a prime number ");
				 prime++;
				 break;
			 }
           }
		 }
		 
		 System.out.println("Total prime number is : " + prime);
		 System.out.println("Total not_prime number is : " + not_prime);
	  }
}