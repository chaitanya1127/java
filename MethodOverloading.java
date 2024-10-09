public class MethodOverloading {

	public static void main(String[] args) {
	display(123);
	display(1127,"abc");
	display("xyz",2711);
	student_details(98763);
	student_details(45467,"bengaluru");
	student_details("mysore",247657);
	int returnedvalue=multiply(27);
	System.out.println("returnedvalue: " +returnedvalue);
	multiply(11,2.7f);
	multiply(1.1f,12);
	}
	public static void display( int number) {
                System.out.println("number"+number);
	    }
	public static void display(int number, String name) {
	        System.out.println("number: " + number);
	        System.out.println("name: " + name);
	    }

	public static void display( String name,int number) {
		System.out.println("name: " + name);
                System.out.println("number: " + number);
        
            }
	public static void student_details(int regNo) {
		System.out.println(" regNo: " +  regNo);
	    }
	public static void student_details(int regNo, String address) {
		System.out.println(" regNo: " +  regNo);
		System.out.println(" address: " +  address);
	    }
	public static void student_details(String address,int regNo) {
		System.out.println(" address: " +  address);
		System.out.println(" regNo: " +  regNo);
	    }
	public static int multiply(int value) {
		return value;
	    }
	public static void multiply(int value1,float value2) {
		float multipliedvalue;
		multipliedvalue = value1*value2;
		System.out.println("multipliedvalue" +multipliedvalue);
	    }
	public static void multiply(float value1,int value2) {
		float multipliedvalue;
		multipliedvalue = value1*value2;
		System.out.println("multipliedvalue" +multipliedvalue);
	    }
        public static void variableArg(String... name) {
		for(int i=0;i<name.length;i++) {
	        System.out.println(name[i]);
	    }
	}


	

