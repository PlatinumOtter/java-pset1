/*Author: Daniel Jackson
pset1
*/
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Mario{
	
	public static void main(String[] args) throws IOException {
		
		Scanner user_input = new Scanner(System.in);
		
		int n;
		System.out.print("Enter a number between 0 and 23: ");
		n = Integer.parseInt(user_input.next());
		
		while(n > 23 || n < 0){
			System.out.print("Number out of range, please input a number between 0 and 23: ");
			n = Integer.parseInt(user_input.next());
		}
		//We should now have an int between 0 and 23 stored as n.
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
	}
}