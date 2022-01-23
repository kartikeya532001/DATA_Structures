package Array;

import java.util.Scanner;

public class CyclicallyRotate1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int d;
		System.out.println("Enter the index of rotation: ");
		d = scan.nextInt();	
		for (int j = 0; j < d; j++) {
			int x;
			x = arr[n - 1];
			for (int i = n - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = x;
		}
		System.out.println("Rotated array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		scan.close();
	}
}