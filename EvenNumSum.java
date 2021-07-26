import java.util.Scanner;
public class EvenNumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int input;
		    int sum = 0;
			
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter an Interger number: ");
			input = scan.nextInt();
			
			while(input < 2) {
				System.out.print ("Error, " + " Re-enter the number:");//Print an error message if the input value is less than 2
		        input = scan.nextInt();
			}
			
			for (int i = 2; i <= input; i += 2) {
				sum += i;
			}
			
			System.out.print (" prints the sum of all even \r\n"
					+ "numbers between 2 and the input value, inclusive: " + sum);
			scan.close();
		}
	}