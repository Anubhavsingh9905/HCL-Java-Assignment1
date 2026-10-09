package Practice;
import java.util.*;

public class asignment11 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("Enter the operation you want to perform :");
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Remainder");
			System.out.println("6. Square");
			System.out.println("7. Cube");
			System.out.println("8. Absolute");
			
			int op = sc.nextInt();
			
			switch(op) {
				case 1: 
					System.out.println("Enter two numbers for addition");
					int x = sc.nextInt(); int y = sc.nextInt();
					System.out.println(x + " + " + y + " = " + (x+y));
					break;
				case 2: 
					System.out.println("Enter two numbers for Substraction");
					x = sc.nextInt(); y = sc.nextInt();
					System.out.println(x + " - " + y + " = " + (x-y));
					break;
					
				case 3: 
					System.out.println("Enter two number for Multiplication");
					x = sc.nextInt(); y = sc.nextInt();
					System.out.println(x + " * " + y + " = " + (x*y));
					break;
					
				case 4: 
					System.out.println("Enter two numbers for Division");
					x = sc.nextInt(); y = sc.nextInt();
					System.out.println(x + " / " + y + " = " + (x/y));
					break;
					
				case 5: 
					System.out.println("Enter two numbers for Remainder");
					x = sc.nextInt(); y = sc.nextInt();
					System.out.println(x + " % " + y + " = " + (x%y));
					break;
					
				case 6: 
					System.out.println("Enter a number for square");
					x = sc.nextInt();
					System.out.println(x + "^2 = " + (x*x));
					break;
				
				case 7: 
					System.out.println("Enter a number for Cube");
					x = sc.nextInt();
					System.out.println(x + " ^3 = " + (x*x*x));
					break;
					
				case 8: 
					System.out.println("Enter a number for Absolute value");
					x = sc.nextInt();
					System.out.println("|" + x + "| = " + (Math.abs(x)));
					break;
					
				default: 
					System.out.println("Wrong Choice");
					break;
			}
			
			System.out.println("Do you want to continue: y/n");
			
			char ch = sc.next().charAt(0);
			
			if(ch == 'n' || ch == 'N') flag = false;
		}
		
		System.out.println("Thankyou");
		
		sc.close();
	}
}