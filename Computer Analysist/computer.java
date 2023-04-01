

class computer{
           
		    int ram_speed;
			int harddrive_capacity;
			double cpu_clock_speed;
			double gpu_memory_size;
			
			//Use set-get Method:
		 
		 void set_ram_speed(int ram_speed)
		 {
			 this.ram_speed= ram_speed;
		 }
		 int get_ram_speed()
		 {
			 return this.ram_speed;
		 }
		 
		 
		 void set_harddrive_capacity(int harddrive_capacity)
		 {
			 this.harddrive_capacity = harddrive_capacity;
		 }
		 int get_harddrive_capacity()
		 {
			 return this.harddrive_capacity;
		 }
		 
		 
		 void set_cpu_clock_speed(double cpu_clock_speed)
		 {
			 this.cpu_clock_speed = cpu_clock_speed;
		 }
		 double get_cpu_clock_speed()
		 {
			 return this.cpu_clock_speed;
		 }


		 void set_gpu_memory_size(double gpu_memory_size)
		 {
			 this.gpu_memory_size = gpu_memory_size;
		 }
		 double get_gpu_memory_size()
		 {
			 return this.gpu_memory_size;
		 }
		 

       //Use Constructor:
	   //Parameterazied Constructor:
	   
	   computer(int ram_speed, int harddrive_capacity, double cpu_clock_speed, double gpu_memory_size)
	   
	   {
		   System.out.println("Computer-01");
		    
			this.ram_speed = ram_speed;
			this.harddrive_capacity = harddrive_capacity;
			this.cpu_clock_speed = cpu_clock_speed;
			this.gpu_memory_size = gpu_memory_size;
			
	   }
	   
	   	   //Default Constuctor:
	   
	   computer()
	   {
		  System.out.println("computer-02");
		    
			this.get_ram_speed();
			this.get_harddrive_capacity();
			this.get_cpu_clock_speed();
			this.get_gpu_memory_size();
		
	   }
	   
	   // Show Function:
	   
	   
		void show()
		{
           System.out.println("Ram_Speed : " + get_ram_speed());
		   System.out.println("Harddrive_Capacity : " + get_harddrive_capacity());
		   System.out.println("Cpu_Clock_Speed : " + get_cpu_clock_speed());
           System.out.println("Gpu_Memory_Size: " + get_gpu_memory_size());
		   def();
		   System.out.println();
		   
		}
		
		void def()
		{
          if(cpu_clock_speed<2.94)
			  System.out.println("Computer is slow");
		  else
			  System.out.println("Computer is fast");
		}

}
