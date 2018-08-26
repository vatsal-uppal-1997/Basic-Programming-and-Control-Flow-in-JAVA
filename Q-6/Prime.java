import java.util.Scanner;
public class Prime {
	private static Scanner sc = new Scanner(System.in);
	private static int arr[];
	private static void sieve(int n) {
		for (int i=2;i<=n;i++) {
			if (arr[i] == 0) 
				for (int j=i+i;j<=n;j+=i)
					arr[j] = 1;
		}
	}
	public static void main(String args[]) {
		int num = sc.nextInt();
		arr = new int[num+1];
		sieve(num);
		if (arr[num] == 1)
			System.out.println("Not Prime");
		else
			System.out.println("Prime");
	}
}
