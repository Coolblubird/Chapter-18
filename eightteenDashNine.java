//Jordan Ashe

import java.util.*;

public class eightteenDashNine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Character Reverser");
		
		System.out.println("Please input a set of characters.");
		String temp = input.nextLine();
		
		System.out.println("the reversed version is: " + reverseDisplay(temp, 0, temp.length()-1));
	}
	
	
	public static String reverseDisplay(String value, int low, int high){
		char[] hold = value.toCharArray();
		
		if (low>high){
			return String.valueOf(hold);
		}
		else{
			char temp = hold[low];
			
			hold[low] = hold[high];
			
			hold[high] = temp;
			
			return reverseDisplay(String.valueOf(hold), low + 1, high - 1);
		}
	}
}