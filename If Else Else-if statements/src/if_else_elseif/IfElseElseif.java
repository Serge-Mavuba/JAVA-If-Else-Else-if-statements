package if_else_elseif;
import java.util.Scanner;

public class IfElseElseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		if (s.equals("serge")) {
			System.out.println("You typed serge");
		}
		else if (s.equals("hello")) {
		System.out.println("hi!");
		}
		else {
			System.out.println("hello");
			
		}
	}

}
