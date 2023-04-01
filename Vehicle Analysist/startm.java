

class startm{
       public static void main(String[] args)
	   
     {
		 vehicle m2 = new vehicle(120,4,"white","Toyota","Auto");
         m2.show();
	  
	  
      vehicle m1 = new vehicle();
	  
	  m1.set_top_speed(140);
	  m1.set_number_of_seats(6);
	  m1.set_vehicle_colour("Red");
	  m1.set_brand_name("Toyota");
	  m1.set_transmition_mood("Manual");
	  m1.show();
	 
	  }
}