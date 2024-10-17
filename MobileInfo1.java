public class MobileInfo1 {

	static Mobile[] mobileData = new Mobile[10];

	public static void main(String[] args) {
		Mobile mobile = new Mobile("vivo","black",21000,98);
		Mobile mobile1 = new Mobile("redmi","grey",11000,78);
		Mobile mobile2 = new Mobile("realme","white",15000,84);
		Mobile mobile3 = new Mobile("oneplus","black",25000,56);
		Mobile mobile4 = new Mobile("samsung","blue",55000,27);
		Mobile mobile5 = new Mobile("oppo","red",28000,45);
		Mobile mobile6 = new Mobile("sony","black",27000,66);
		Mobile mobile7= new Mobile("nokia","grey",45000,78);
		saveMobile(mobile);
		saveMobile(mobile1);
		saveMobile(mobile2);
		saveMobile(mobile3);
		saveMobile(mobile4);
		saveMobile(mobile5);
		saveMobile(mobile6);
		saveMobile(mobile7);
	
		Mobile foundmobile= findByName("nokia");
		if(foundmobile !=null) {
			foundmobile.MobileDetails();
			System.out.println("--------------------");
		}
		Mobile foundmobile1= findByName("vivo");
		if(foundmobile !=null) {
			foundmobile1.MobileDetails();
		}

	System.out.println(" update mobile by price");
	 UpdatePriceBybrand("vivo",22247);
	 UpdatePriceBybrand("sony",20647);
	 for(int i=0;i<mobileData.length;i++) {
		if(mobileData[i]!=null) {
			 mobileData[i].MobileDetails();

			
		 }
	 }
	}
	 

	public static boolean saveMobile(Mobile mobile1) {
		for(int i = 0;i<mobileData.length;i++) {
			if(mobileData[i]==null) {
				mobileData[i] = mobile1;
				System.out.println(" mobile is saved");
				return true;	
			}
		}
		System.out.println("no space in the array");
		return false;
	}
	public static Mobile findByName(String brand) {
		for(int i=0;i<mobileData.length;i++) {
			if(mobileData[i].brand.equals(brand)) {
				System.out.println(" mobile found");	
				return mobileData[i];
			}
			
		}
		System.out.println(" brand name not found");
		return null;
	}
	
	public static boolean UpdatePriceBybrand(String brand,int price) {
		for(int i=0;i<mobileData.length;i++) {
			if(mobileData[i]!=null) {
			if(mobileData[i].brand.equals(brand)) {
				 mobileData[i].price = price;
			
				System.out.println(" price updated");	
	            return true;
			}
		}
		}
		
		System.out.println(" brand name not found,upadate failed");
		return false;
	}
}
		
