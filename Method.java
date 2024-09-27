public class Method {

	public static void main(String[] args) {
	add();	
        division();
        si();
        display();
        show();
        areaOfTriangle();
        square();
        calculateAreaOfCircle();
        averageOfThreeNumbers();
        multiply();
	}
	public static void add() {
		int numberone = 20;
		int numbertwo = 40;
		int addition = numberone + numbertwo;
		System.out.println("addition ="+addition);
        }
	public static void division() {
		int numberone = 20;
		int numbertwo = 2;
		int division = numberone/numbertwo;
		System.out.println("division ="+division);
        }
	public static void si() {
		int principalAmount = 15000;
		int rate = 24;
		int time = 6;
		float simpleInterest = principalAmount*rate*time/100f;
		System.out.println("simpleInterest="+simpleInterest);
	}
	public static void display() {
		System.out.println("hello world");
	}
	public static void show() {
		int number = 20;
		double pi = 3.142d;
		System.out.println("number value ="+number);
		System.out.println("value of pi ="+pi);
        } 
	public static void areaOfTriangle() {
		float base= 5f;
		float height = 13f;
		float area = (base*height)/2f;
		System.out.println("area Of Triangle ="+area);
	}
	public static void square() {
		int value1 = 6;
		int square = value1*value1;
		System.out.println("square of value ="+square);	
	}
	public static void calculateAreaOfCircle() {
		double radius = 5d;
		float pi = 3.142f;
		double area = pi*radius*radius;
		System.out.println("Area Of Circle ="+area);
	}
	public static void averageOfThreeNumbers() {
		int numberOne = 27;
		int numberTwo = 11;
		int numberThree = 12;
		double average = (numberOne+numberTwo+numberThree)/3;
		System.out.println("average Of Three Numbers  ="+average);
	}
	public static void multiply() {
		int numberOne = 6;
		int numberTwo = 5;
		int numberThree = 8;
		int multiplication = numberOne*numberTwo*numberThree;
		System.out.println("multiplication ="+ multiplication);
	}
}