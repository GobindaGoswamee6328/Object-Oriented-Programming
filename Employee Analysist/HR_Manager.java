
//HR Manager:

class HR_Manager extends Employee
{
     double KPI;

     //Use Set-Get Method:

       void setKPI(double KPI)
		 {
			 this.KPI = KPI;
		 }
		 double getKPI()
		 {
			 return this.KPI;
		 }


     //Default Constructor:
	 
	
        HR_Manager()
		 {
           getKPI();
		 }
		 
		 
    //Peramiterazied Constructor:
	
	    HR_Manager(String id,String name,String date_of_birth,String joining_date,String blood_group,String address,double monthly_salary,double KPI)
		{
		super(id,name,date_of_birth,joining_date,blood_group,address,monthly_salary);
		this.KPI = KPI;
		}
		
		
    //Show Function:
	
	void HR_Manager_info()
	{
		System.out.println();
		Employeeinfo();
		System.out.println("KPI : " + getKPI() + " /-");
		total_income();
	
	}
	
	
	//void function for calculate total income:
	
	void total_income()
	{
		double total = monthly_salary + getKPI();
        System.out.println("Total Income : " + total + " /-");

		
	}

}