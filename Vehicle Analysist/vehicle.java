

class vehicle{
         int top_speed;
		 int number_of_seats;
		 String vehicle_colour;
		 String brand_name;
		 String transmition_mood;
		 
		 //Use set-get Method:
		 
		 void set_top_speed(int top_speed)
		 {
			 this.top_speed = top_speed;
		 }
		 int get_top_speed()
		 {
			 return this.top_speed;
		 }
		 
		 
		 void set_number_of_seats(int number_of_seats)
		 {
			 this.number_of_seats = number_of_seats;
		 }
		 int get_number_of_seats()
		 {
			 return this.number_of_seats;
		 }
		 
		 
		 void set_vehicle_colour(String vehicle_colour)
		 {
			 this.vehicle_colour= vehicle_colour;
		 }
		 String get_vehicle_colour()
		 {
			 return this.vehicle_colour;
		 }


		 void set_brand_name(String brand_name)
		 {
			 this.brand_name = brand_name;
		 }
		 String get_brand_name()
		 {
			 return this.brand_name;
		 }
		 
		 
		 void set_transmition_mood(String transmition_mood)
		 {
			 this.transmition_mood = transmition_mood;
		 }
		 String get_transmition_mood()
		 {
			 return this.transmition_mood;
		 }

       //Use Constructor:
	   //Parameterazied Constructor:
	   
	   vehicle(int top_speed,int number_of_seats,String vehicle_colour,String brand_name,String transmition_mood)
	   
	   {
		   System.out.println("Vehicle-01");
		    
			this.top_speed = top_speed;
			this.number_of_seats = number_of_seats;
			this.vehicle_colour = vehicle_colour;
			this.brand_name = brand_name;
			this.transmition_mood = transmition_mood;
	   }
	   
	   
	   //Default Constuctor:
	   
	   vehicle()
	   {
		  System.out.println("Vehicle-02");
		    
			this.get_top_speed();
			this.get_number_of_seats();
			this.get_vehicle_colour();
			this.get_brand_name();
			this.get_transmition_mood(); 
	   }
	   
	   // Show Function:
	   
	   
		void show()
		{
           System.out.println("Top_Speed : " + get_top_speed());
		   System.out.println("Number_Of_Seats : " + get_number_of_seats());
		   System.out.println("Vehicle_Colour : " + get_vehicle_colour());
           System.out.println("Brand_Name : " + get_brand_name());
		   System.out.println("Transmition_Mood : " + get_transmition_mood());
		   def();
		   System.out.println();
		   
		}
		
		void def()
		{
          if(top_speed>=140)
			  System.out.println("Car is fast");
		  else
			  System.out.println("Car is slow");
		}
}

