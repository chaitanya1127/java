public class ReturnTypeExample {

	public static void main(String[] args) {
	       multiply(111,277);	
	       byte returnedValue = getByteValue();
	       System.out.println(returnedValue);
	       long returnValue = getlongValue();
	       System.out.println(returnValue);
	       short returnedvalue=getshortValue();
	       System.out.println(returnedvalue);
	       String returnedMessage = printMessage();
	       System.out.println(returnedMessage);
	       float returnNumber = getfloatValue();
	       System.out.println(returnNumber);
	       double returnDoubleValue = getdoubleValue();
	       System.out.println(returnDoubleValue);
	       char returnCharacter = printCharacter();
	       System.out.println(returnCharacter);
	       boolean returnACharacter = getBooleanValue();
	       System.out.println(returnACharacter);
	}
	public static int multiply(int value1, int value2) {
	       int multipliedValue = value1*value2;
	       System.out.println(multipliedValue);
	       return 0;
	}
	public static byte getByteValue() {
	       byte number = 27;
	       System.out.println("Return a byte value");
	       return number;
	}
	public static long getlongValue() {
	       long mobileNumber = 9876543210l;
	       System.out.println("print mobile number");
	       return mobileNumber;
	}
	public static short getshortValue() {
	       short number = 10;
	       System.out.println("Return a short value");
	       return number;
		}
	public static String printMessage() {
	       String message = " HELLO";
	       System.out.println("print a message");
	       return message;
	}
	public static float getfloatValue() {
               float num1 = 12.5f;
               float num2 = 11.2f;
               float add = num1+num2;
               System.out.println("Return a float value");
               return add;
	}
	public static double getdoubleValue() {
               double principal = 12000.5d;
               double rate = 2d;
               double timePeriod = 1d;
               double si =(principal*rate*timePeriod)/100 ;
               return si;
	}
	public static char printCharacter() {
	       char Character = 'R';
	       System.out.println("print a Character");
	       return Character;
	}
	public static boolean getBooleanValue() {
	       char message = 'C';
	       if(message=='R') {
		return true ;
		}
		else
		{
		return false;
		}
		}
}
