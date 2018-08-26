import java.util.Scanner;
public class Palindrome {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String number = Integer.toString(sc.nextInt()), reverse = "";
		for (int i=number.length()-1;i>=0;i--)
			reverse = reverse+(number.toCharArray())[i];
		if (number.equals(reverse))
			System.out.println("Palindrome !");
		else
			System.out.println("Not Palindrome !");	
	}
}
