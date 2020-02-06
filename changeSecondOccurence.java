package ExperimentsOnUI.ExperimentScripts;

import java.util.Scanner;

public class changeSecondOccurence {

	public static void main(String[] args) {
		
		System.out.println("Enter the string : ");
		Scanner sc =new Scanner(System.in);
		String str= sc.nextLine();
		System.out.println("Before Change");
		System.out.println(str);
		char replace ='t';
		int secondOccurence = str.indexOf('o', str.indexOf('o')+1);
		str=str.substring(0, secondOccurence) + replace + str.substring(secondOccurence+1, str.length());
		System.out.println("After Change");
		System.out.println(str);
				}
	
}
