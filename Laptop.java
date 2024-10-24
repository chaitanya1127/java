class Laptop {
    static String brand;
    static String operatingSystem;
    static String processorType;

    
    String model;
    int ramSize; 
    int storageSize; 
    float screenSize; 

   
    static {
        brand = "Dell";
        operatingSystem = "Windows";
        processorType = "Intel i7";
    }

 
    public Laptop(String model, int ramSize, int storageSize, float screenSize) {
        this.model = model;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
        this.screenSize = screenSize;
    }

   
    public void printDetails() {
     
        System.out.println("Brand: " + brand);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Processor Type: " + processorType);
        System.out.println("Model: " + model);
        System.out.println("RAM Size: " + ramSize + " GB");
        System.out.println("Storage Size: " + storageSize + " GB");
        System.out.println("Screen Size: " + screenSize + " inches");
        
    }
}
 class MobilePhone {
   
    static String brand;
    static String operatingSystem;
    static String networkType;

   
    String model;
    int ramSize; 
    int storageSize; 
    double screenSize; 

   
    static {
        brand = "Samsung";
        operatingSystem = "Android";
        networkType = "5G";
    }

   
       MobilePhone(String model, int ramSize, int storageSize, double screenSize) {
        this.model = model;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
        this.screenSize = screenSize;
    }

 public void printDetails() {
      
        System.out.println("Brand: " + brand);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Network Type: " + networkType);
        System.out.println("Model: " + model);
        System.out.println("RAM Size: " + ramSize + " GB");
        System.out.println("Storage Size: " + storageSize + " GB");
        System.out.println("Screen Size: " + screenSize );
    
    }
}
 class Bike {
	 
	    static String brand;
	    static String engineType;
	    static String fuelType;

	    
	    String model;
	    int cc; 
	    int maxSpeed; 
	    String color;

	   
	    static {
	        brand = "Yamaha";
	        engineType = "Single Cylinder";
	        fuelType = "Petrol";
	    }

	   
	    public Bike(String model, int cc, int maxSpeed, String color) {
	        this.model = model;
	        this.cc = cc;
	        this.maxSpeed = maxSpeed;
	        this.color = color;
	    }

	   
	    public void printDetails() {
	    
	        System.out.println("Brand: " + brand);
	        System.out.println("Engine Type: " + engineType);
	        System.out.println("Fuel Type: " + fuelType);
	        System.out.println("Model: " + model);
	        System.out.println("Engine Displacement: " + cc + " cc");
	        System.out.println("Max Speed: " + maxSpeed + " km/h");
	        System.out.println("Color: " + color);
	    
	    }
	}
 class Bottle {
	    
	    static String brand;
	    static String material;
	    static String color;

	   
	    String model;
	    int capacity;
	    String isReusable; 
	    float height; 

	 
	    static {
	        brand = "Hydro Flask";
	        material = "Stainless Steel";
	        color = "Various"; 
	    }

	   
	    public Bottle(String model, int capacity, String isReusable, float height) {
	        this.model = model;
	        this.capacity = capacity;
	        this.isReusable = isReusable;
	        this.height = height;
	    }

	 
	    public void printDetails() {
	     
	        System.out.println("Brand: " + brand);
	        System.out.println("Material: " + material);
	        System.out.println("Color: " + color);
	        System.out.println("Model: " + model);
	        System.out.println("Capacity: " + capacity + " ml");
	        System.out.println("Reusable: " + isReusable);
	        System.out.println("Height: " + height + " cm");
	        
	    }
	}

 class IronBox {
	  
	    static String brand;
	    static String type;
	    static String color;

	    
	    String model;
	    int wattage; 
	    String isSteam; 
	    float weight; 
	    static {
	        brand = "Philips";
	        type = "Electric";
	        color = "Blue";
	    }

	 
	    public IronBox(String model, int wattage, String isSteam, float weight) {
	        this.model = model;
	        this.wattage = wattage;
	        this.isSteam = isSteam;
	        this.weight = weight;
	    }

	   
	    public void printDetails() {
	   
	        System.out.println("Brand: " + brand);
	        System.out.println("Type: " + type);
	        System.out.println("Color: " + color);
	        System.out.println("Model: " + model);
	        System.out.println("Wattage: " + wattage + " watts");
	        System.out.println("Steam Functionality: " + isSteam );
	        System.out.println("Weight: " + weight + " kg");
	     
	    }
	}
