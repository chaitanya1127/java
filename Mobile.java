public class Mobile {
	String brand;
	String colour;
	int price;
	int batteryPercentage;
	
	public Mobile() {
        System.out.println("no parmtzed constructor");
    }
	public Mobile(String brand,String colour,int price,int batteryPercentage) {
        this.brand =brand;
        this.colour = colour;
        this.price = price;
        this.batteryPercentage =batteryPercentage;
	}
	public void MobileDetails() {
        System.out.println("brand: " + brand);
        System.out.println("colour: " + colour);
        System.out.println("price: " + price);
        System.out.println("batteryPercentage :"+batteryPercentage );
	}

}
