public class StringExample {

	public static void main(String[] args) {
		String seasons = "summer";
		String seasons1 = " winter";
		 String seasons4 = new String("summer");
		 seasons = " monsoon";
		 String seasons3 = " winter";
		 String month = "january";
		 String month1 = " july";
		 String month2 = new String("december");
		 String month3 = "october";
		 String month4 = " july"; 
		 String month5 = new String("april");
		System.out.println(seasons);
		System.out.println(seasons1.equals(seasons3));
		System.out.println(month1.equals(month4));
		char[] charArray = month.toCharArray();
		String value = "";
		for( int i=charArray.length-1;i>=0;i--) {
			value = value + charArray[i];
		     System.out.println(value);
		}
		char[] charArray1 = month4.toCharArray();
		String value1 = "";
		for( int i=charArray1.length-1;i>=0;i--) {
			value1 = value1 + charArray1[i];
		     System.out.println(value1);
		}
	}

}
