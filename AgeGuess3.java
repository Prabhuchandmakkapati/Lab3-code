import java.util.Scanner;

public class AgeGuess3 {

	public static void main(String[] args) {
        int ageGuess;
		int age;
		int min=0, max=100;
		String name;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name= scan.nextLine();
		
		System.out.print("Enter the random integer of type int between "+min+" to "+max+": ");
		int a =(int)(Math.random()*(max-min+1)+min); 
		ageGuess = scan.nextInt();
		
		System.out.println("Enter Your guess age: " + ageGuess);
		System.out.println("The correct age was: " + a);
		
		while(ageGuess != a) {		
			System.out.println("You Guessed Worng!");			
			if (ageGuess > a) { 
				System.out.println("Older");  			
			}
			else {
				System.out.println("Younger"); 
			}
			System.out.print("Enter the random integer of type int between "+min+" to "+max+": ");
			ageGuess = scan.nextInt();
	        }
		System.out.println("The correct age was: " + a);
        }
}
