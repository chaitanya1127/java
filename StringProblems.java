public class StringProblems {

	public static void main(String[] args) {
		int[] arr = { 10,20,4,6,45,8};
		int resultValue = secondSmallest(arr);
		System.out.println(resultValue); 
		
		String fruit = "pineapple";
		String upperCaseValue = fruit.toUpperCase();
		System.out.println(upperCaseValue);
		
		String bike = "KTM";
		String lowerCaseValue = bike.toLowerCase();
		System.out.println(lowerCaseValue);
		
		String movie = "      devara     ";
		String trimValue = movie.trim();
		System.out.println(trimValue);
		
		String name = "sravani reddy";
		boolean result = name.startsWith("sravani");
		System.out.println(result);
		
		String subject = "Java Program";
	    boolean endsWithValue = subject.endsWith("Program");
		System.out.println(endsWithValue);
		
		String concat = "Java";
		String concatValue = concat.concat("Program");
		System.out.println(concatValue);
		
		String mobile = "vivo";
		char charAtValue = mobile.charAt(1);
		System.out.println(charAtValue);
		
		String book = "";
		boolean isEmptyValue = book.isEmpty();
		System.out.println(isEmptyValue);
		String palindrome = "mom";

	    
        char[] charArray = palindrome.toCharArray();

    
        String value = "";

      
        for (int i = charArray.length - 1; i >= 0; i--) {
            value = value + charArray[i];
        }
          System.out.println("Reversed string: " + value);
             if (value.equals(palindrome)) {
		System.out.println(" palindrome");
	}
		else
		{
		System.out.println(" not a palindrome");		
	}
	}
	public static int secondSmallest(int[] arr) {
		int n = arr.length;
		int smallest = arr[0];
		int secondSmallest =arr[0];
		for( int i =0;i<n;i++) {
			if(arr[i] < smallest) {
			  secondSmallest = smallest;
				smallest =  arr[i];
			} else if (arr[i] < secondSmallest && arr[i] != smallest) {
			       secondSmallest = arr[i]; 
			}
			
		}
		return     secondSmallest;
		
	}
}
