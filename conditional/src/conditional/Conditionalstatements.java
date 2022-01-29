package conditional;

import java.util.Scanner;

public class Conditionalstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard=new Scanner(System.in);
		System.out.println(" Enter your age");
		int age=keyboard.nextInt();
		
		if(age>18) {
		
		System.out.println("You can vote ");
		} else {
		
		System.out.println("You can't vote");
		}
		
		
	}

}
