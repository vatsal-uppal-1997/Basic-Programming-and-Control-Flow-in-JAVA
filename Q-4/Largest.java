import java.util.Scanner;
public class Largest {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String []args) {
		int arr[] = new int[3], max=Integer.MIN_VALUE;
		for (int i=0;i<3;i++) {
			arr[i] = sc.nextInt();
			if (arr[i] >= max)
				max = arr[i];
		}
		System.out.println("Max : "+max);	
	}		
}
