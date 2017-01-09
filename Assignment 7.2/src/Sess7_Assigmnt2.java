import java.util.Scanner;

public class Sess7_Assigmnt2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = new String();
		String s2 = new String();
		System.out.println("Enter the main string: ");
		s1 = sc.nextLine();
		System.out.println("Enter the substring to be searched: ");
		s2 = sc.nextLine();

		if (s1.contains(s2)) {
			System.out.println("Substring " + s2 + " is present in " + s1);
		} else {
			System.out.println("Substring " + s2 + " is not present in " + s1);
		}

	}
}
/*
******************************************************************************
Output:
Enter the main string: 
abcd
Enter the substring to be searched: 
bc
Substring bc is present in abcd

******************************************************************************
*/
