class vowel_consonent_assignment{
             public static void main(String[] args)
		{
			char[] vow = new char[10];
			
			vow [0] = 'a';
			vow [1] = 'b';
			vow [2] = 'c';
			vow [3] = 'd';
			vow [4] = 'e';
			vow [5] = 'f';
			vow [6] = 'g';
			vow [7] = 'h';
			vow [8] = 'i';
			vow [9] = 'j';
			
			int vowel = 0,  consonent = 0;
			for(int i=0; i<vow.length; i++)
			{
               if(vow[i] == 'a'|| vow[i] == 'e'|| vow[i] == 'i'|| vow[i] == 'o'|| vow[i] == 'u')
			{
			  System.out.println(vow[i]+ " is vowel ");
			  vowel++;
			}
			else 
			{
			System.out.println(vow[i]+ " is consonent ");
			consonent++;
			}
		}
		
			System.out.println("Total Vowel : " + vowel);
			System.out.println("Total Consonent : " + consonent);
         
		}
    }
				
			