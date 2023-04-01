

class Employee{
           
		    String id;
			String name;
			String date_of_birth;
			String joining_date;
			String blood_group;
			String address;
			double monthly_salary;
			
			
			//Use set-get Method:
		 
		 void setid(String id)
		 {
			 this.id = id;
		 }
		 String getid()
		 {
			 return this.id;
		 }
		 
		 
		 
		 void setname(String name)
		 {
			 this.name = name;
		 }
		 String getname()
		 {
			 return this.name;
		 }
		 


         void set_date_of_birth(String date_of_birth)
		 {
			 this.date_of_birth = date_of_birth;
		 }
		 String get_date_of_birth()
		 {
			 return this.date_of_birth;
		 }



		 void set_joining_date(String joining_date)
		 {
			 this.joining_date = joining_date;
		 }
		 String get_joining_date()
		 {
			 return this.joining_date;
		 }
		 
		 
		 
		 void set_blood_group(String blood_group)
		 {
			 this.blood_group = blood_group;
		 }
		 String get_blood_group()
		 {
			 return this.blood_group;
		 }



         void setaddress(String address)
		 {
			 this.address = address;
		 }
		 String getaddress()
		 {
			 return this.address;
		 }
		 
		 
		 
		 void set_monthly_salary(double monthly_salary)
		 {
			 this.monthly_salary = monthly_salary;
		 }
		 double get_monthly_salary()
		 {
			 return this.monthly_salary;
		 }
		 
		 
		 
        //Default Constructor:		

        Employee()
		{
			getid();
			getname();
			get_date_of_birth();
			get_joining_date();
			get_blood_group();
			getaddress();
			get_monthly_salary();
				
		}			


       //Peramiterazied Constructor:
		
		Employee(String id,String name,String date_of_birth,String joining_date,String blood_group,String address,double monthly_salary)
		{
			
			   this.id = id;
			   this.name = name;
			   this.date_of_birth = date_of_birth;
			   this.joining_date = joining_date;
			   this.blood_group = blood_group;
			   this.address = address;
			   this.monthly_salary = monthly_salary;
			   
			   
		}
		
       //Use Function:
	   
	   void Employeeinfo()
	   {
		   
		   System.out.println();
		   System.out.println("ID    : " + getid());
		   System.out.println("Name  : " + getname());
		   System.out.println("Date_of_Birth  : " + get_date_of_birth());
		   System.out.println("Joining_date  : " + get_joining_date());
		   System.out.println("Blood_group  : " + get_blood_group());
		   System.out.println("Address  : " + getaddress());
		   System.out.println("Monthly_salary  : " + get_monthly_salary()+ " /-");
		   
		   
	   }

		
}
		 