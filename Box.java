public class Box {
int size = 0;

public Box() {} // method with no parameters and void return type

public static void main(String[] args) {
		Box objBox = new Box();  //Box object created
	        objBox.size = 5;
		objBox.printBox();			
		}
		public void printBox() {
			final int MAX_ROWS = 5;
			 for (int row = 1; row <= MAX_ROWS; row++)
			 {
			 for (int star = 1; star <= row; star++)
			 System.out.print("*");
			 System.out.println();
	                 }
		
	        }
         }
