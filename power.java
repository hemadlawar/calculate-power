import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		// Q- write a Java Program to Calculate the Power of a Number;
	Scanner sc = new Scanner(System.in);
	System.out.println("write the base number");
	int base=sc.nextInt();
	System.out.println("write the power number");
	int power=sc.nextInt();
	
	power(power,base);

	}
	public static void power(int p,int b) {
		 int result=1;
		for (int i = 1; i <=p; i++) {
			result=result*b;
			
		}
		System.out.println(result);
	}

}
