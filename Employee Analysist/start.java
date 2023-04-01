
//Assignment:

class start{
	   public static void main(String[] args)
	   
		   
	   {

		   IT_Executive i1 = new IT_Executive();
		   i1.setid("E-0001");
		   i1.setname("Gobinda");
		   i1.set_date_of_birth("10 March 1990");
		   i1.set_joining_date("3 December,2006");
		   i1.set_blood_group("B+");
		   i1.setaddress("Khulna");
		   i1.set_monthly_salary(50000.20);
		   i1.set_project_bonus(14000.20);
		   i1.IT_Executive_info();

           IT_Executive i2 = new IT_Executive("E-0002","Akib","1 january 1986","20 February,2005","AB-","Sylhet",65430.25,15945.25);
		   i2.IT_Executive_info();
		   
		   
		   
		   
		   HR_Manager h1 = new HR_Manager();
		   h1.setid("E-0003");
		   h1.setname("Salman");
		   h1.set_date_of_birth("10 August 1987");
		   h1.set_joining_date("3 December,2008");
		   h1.set_blood_group("A-");
		   h1.setaddress("Comilla");
		   h1.set_monthly_salary(63456.25);
		   h1.setKPI(1458.63);
		   h1.HR_Manager_info();

           HR_Manager h2 = new HR_Manager("E-0004","Rony","15 June 1990","20 September,2015","AB-","Narayangonj",65430.25,15945.25);
		   h2.HR_Manager_info();
		   


		   
		   Market_Analyst m1 = new Market_Analyst();
		   m1.setid("E-0005");
		   m1.setname("Subrata");
		   m1.set_date_of_birth("10 March 1892");
		   m1.set_joining_date("3 December,2014");
		   m1.set_blood_group("AB+");
		   m1.setaddress("Jessore");
		   m1.set_monthly_salary(67942.78);
		   m1.setcommission(5000.00);
		   m1.Market_Analyst_info();

           Market_Analyst m2 = new Market_Analyst("E-0006","Susmoy","1 july 1994","20 December,20016","A-","Rajshahi",68965.45,4500.00);
		   m2.Market_Analyst_info();
		   


		   
           Part_Timer p1 = new Part_Timer();
		   p1.setid("E-0007");
		   p1.setname("Ramjan");
		   p1.set_date_of_birth("10 March 1989");
		   p1.set_joining_date("15 September,2012");
		   p1.set_blood_group("B+");
		   p1.setaddress("Bogura");
		   p1.set_monthly_salary(150452.00);
		   p1.Part_Timer_info();

           Part_Timer p2 = new Part_Timer("E-0008","Piyash","2 July 1995","27 June,2018","AB-","Munshiganj",167650.00);
		   p2.Part_Timer_info();
		      
	   }
}