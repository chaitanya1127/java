public class StaticRunner {
	public static void main(String[] args) {
	       
		Laptop laptop1 = new Laptop("XPS 13", 16, 512, 13.3f);
	        Laptop laptop2 = new Laptop("Inspiron 15", 8, 256, 15.6f);
		Laptop laptop3 = new Laptop("Alienware X17", 32, 1024, 17.3f); 
	        Laptop laptop4 = new Laptop("Latitude 7420", 16, 512, 14.0f);
	        Laptop laptop5 = new Laptop("G3 15", 16, 256, 15.6f); 

		 
		MobilePhone phone1 = new MobilePhone("Galaxy S21", 12, 256, 6.2); 
	        MobilePhone phone2 = new MobilePhone("Galaxy Note 20", 8, 128, 6.7);
	        MobilePhone phone3 = new MobilePhone ("Galaxy A52", 6, 128, 6.5);
	        MobilePhone phone4 = new MobilePhone("Galaxy Z Flip 3", 8, 256, 6.7f);
	        MobilePhone phone5 = new MobilePhone("Galaxy M32", 6, 128, 6.4f); 
	        
	        Bike bike1 = new Bike("YZF R1", 998, 299, "Blue");
	        Bike bike2 = new Bike("FZ 25", 249, 140, "Black");
	        Bike bike3 = new Bike("MT-15", 155, 130, "Grey");
	        Bike bike4 = new Bike("Yamaha R15", 155, 136, "Red"); 
	        Bike bike5 = new Bike("Yamaha Fazer", 153, 130, "White"); 
	        
	        
	        Bottle bottle1 = new Bottle("Standard ", 621, "yes", 25.4f);
	        Bottle bottle2 = new Bottle("Wide Mouth ", 946,"yes" , 30.5f);
	        Bottle bottle3 = new Bottle("Flex Cap ", 532, "yes", 22.9f);
	        Bottle bottle4 = new Bottle("Insulated ", 710, "no", 26.7f); 
	        Bottle bottle5 = new Bottle("Travel", 355, "no", 18.4f); 
	        
	        IronBox iron1 = new IronBox("GC1905", 1200, "yes", 1.2f);
	        IronBox iron2 = new IronBox("GC4510", 2400, "yes", 1.5f);
	        IronBox iron3 = new IronBox("GC2040", 1800, "yes", 1.3f);
	        IronBox iron4 = new IronBox("GC1010", 1200, "no", 1.0f); 
	        IronBox iron5 = new IronBox("GC5010", 2000, "no", 1.4f); 

	        laptop1.printDetails();
	        laptop2.printDetails();
	        laptop3.printDetails();
	        laptop4.printDetails();
	        laptop5.printDetails();
	        
	        phone1.printDetails();
	        phone2.printDetails();
	        phone3.printDetails();
	        phone4.printDetails();
	        phone5.printDetails();
	        
	        bike1.printDetails();
	        bike2.printDetails();
	        bike3.printDetails();
	        bike4.printDetails();
	        bike5.printDetails();
	        
	        bottle1.printDetails();
	        bottle2.printDetails();
	        bottle3.printDetails();
	        bottle4.printDetails();
	        bottle5.printDetails();
	        
	        iron1.printDetails();
	        iron2.printDetails();
	        iron3.printDetails();
	        iron4.printDetails();
	        iron5.printDetails();
	 }	    
}



