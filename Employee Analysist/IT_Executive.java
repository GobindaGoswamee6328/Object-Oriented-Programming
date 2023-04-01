

//IT Executive:

class IT_Executive extends Employee
{
    double project_bonus;
	
	//Use Set-Get Method:
	
       void set_project_bonus(double project_bonus)
		 {
			 this.project_bonus = project_bonus;
		 }
		 double get_project_bonus()
		 {
			 return this.project_bonus;
		 }

      
	  
    //Default Constructor:
	  
	   IT_Executive()
		 {
           get_project_bonus();
		 }
		 
		 
    //Peramiterazied Constructor:
	
	    IT_Executive(String id,String name,String date_of_birth,String joining_date,String blood_group,String address,double monthly_salary,double project_bonus)
		{
		super(id,name,date_of_birth,joining_date,blood_group,address,monthly_salary);
		this.project_bonus = project_bonus;
		}
		
		
    //Show Function:
	
	void IT_Executive_info()
	{
		System.out.println();
		Employeeinfo();
		System.out.println("Project_Bonus : " + get_project_bonus() + " /-");
		total_income();
	
	}
	
	//void function for calculate total income:
	
	void total_income()
	{
		double total = monthly_salary + get_project_bonus();
		System.out.println("Total Income : " + total + " /-");
		
	}
		 
}