

//Market Analyst:

class Market_Analyst extends Employee
{
    double commission;
	
	//Use Set-Get Method:
	
       void setcommission(double commission)
		 {
			 this.commission = commission;
		 }
		 double getcommission()
		 {
			 return this.commission;
		 }

      
	  
    //Default Constructor:
	  
	   Market_Analyst()
		 {
           getcommission();
		 }
		 
		 
    //Peramiterazied Constructor:
	
	    Market_Analyst(String id,String name,String date_of_birth,String joining_date,String blood_group,String address,double monthly_salary,double commission)
		{
		super(id,name,date_of_birth,joining_date,blood_group,address,monthly_salary);
		this.commission = commission;
		}
		
		
    //Show Function:
	
	void Market_Analyst_info()
	{
		System.out.println();
		Employeeinfo();
		System.out.println("Commission : " + getcommission() + " /-");
		total_income();
	}


    //void function for calculate total income:
	
	void total_income()
	{
		double total = monthly_salary + getcommission();
        System.out.println("Total Income : " + total + " /-");

		
	}
		 
}