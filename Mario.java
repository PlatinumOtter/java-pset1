/*Author: Daniel Jackson
pset1
*/
import java.io.PrintWriter;
import java.util.Scanner;

public class Mario{
	
	public static void main(String[] args){
		
		Scanner user_input = new Scanner(System.in);
		PrintWriter mariofile = new PrintWriter("Mario.txt");
		
		int n;
		System.out.print("Enter a number between 0 and 23: ");
		n = Integer.parseInt(user_input.next());
		
		while(n > 23 || n < 0){
			System.out.print("Number out of range, please input a number between 0 and 23: ");
			n = Integer.parseInt(user_input.next());
		}
		//We should now have an int between 0 and 23 stored as n.

		int outputtype;
		System.out.print("Enter 1 for console output or 2 for .txt file output: ");
		outputtype = Integer.parseInt(user_input.next());

		while(outputtype != 1 || outputtype != 2){
			System.out.print("Please enter 1 for console output or 2 for .txt file output: ");
			outputtype = Integer.parseInt(user_input.next());
		}
		if(outputtype == 1){

			for(int i = 0; i < n; i++){

				StringBuilder levelBuilder = new StringBuilder();

				int spaces;
				spaces = (n - 1) - i;

				int hashes;
				hashes = i + 2;

				while(spaces > 0){
					levelBuilder.append(" ");
					spaces = spaces - 1;
				}

				while(hashes > 0){
					levelBuilder.append("#");
					hashes = hashes - 1;
				}

				System.out.println(levelBuilder.toString());
			}
		}else if(outputtype == 2){

			for(int i = 0; i < n; i++){

				StringBuilder levelBuilder = new StringBuilder();

				int spaces;
				spaces = (n - 1) - i;

				int hashes;
				hashes = i + 2;

				while(spaces > 0){
					levelBuilder.append(" ");
					spaces = spaces - 1;
				}

				while(hashes > 0){
					levelBuilder.append("#");
					hashes = hashes - 1;
				}

				mariofile.println(levelBuilder.toString());
			}
		}
	}
}