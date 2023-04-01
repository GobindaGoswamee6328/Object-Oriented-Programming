

class prac{
       
	   public static void main(String[] args)
	   
	   {
            computer m2 = new computer(1200,1800,2.25,4.5);
			m2.show();
			
			computer m1 = new computer();
			
			 m1.set_ram_speed(1500);
	         m1.set_harddrive_capacity(2400);
             m1.set_cpu_clock_speed(2.94);
             m1.set_gpu_memory_size(3.5);
             m1.show();
	   }
	   
}