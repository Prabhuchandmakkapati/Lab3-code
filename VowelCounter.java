import java.util.Scanner;
public class VowelCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String name;
	     int a = 0, e = 0, i = 0, o = 0, u = 0;
		 int non_vowel = 0;
		  
		Scanner scan = new Scanner(System.in);
				
		System.out.print("Enter a string: ");
				name = scan.nextLine();
				
				for (int v = 0; v < name.length(); v++) {
					char c = name.charAt(v);
					
					if (c == 'a') {
						a++;
					}
					else if (c == 'e') {
						e++;
					} 
					else if (c == 'i') {
						i++;
					} 
					else if (c == 'o') {
						o++;
					} 
					else if (c == 'u') {
						u++;
					} 
					else {
						non_vowel++;
					}
				}
			System.out.println("a: " + a);
			System.out.println("e: " + e);
			System.out.println("i: " + i);
			System.out.println("o: " + o); 
			System.out.println("u: " + u);  
			System.out.println("Number of non vowels: " + non_vowel);
			
	scan.close();
	}

}
	