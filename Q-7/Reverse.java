import java.util.Scanner;
public class Reverse {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		String number = Integer.toString(sc.nextInt()), reverse = "";
		for (int i=number.length()-1;i>=0;i--) {
			reverse = reverse+(number.toCharArray())[i];		
		}
		System.out.println("Reverse : "+Integer.parseInt(reverse));	
	}
}
