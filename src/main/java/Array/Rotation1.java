package Array;

import java.util.Scanner;

public class Rotation1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = scan.nextInt();
		System.out.println("Enter the rotation index: ");
		int d = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int temp;
		for (int j = 0; j < d; j++) {
			temp = arr[0];
			for (int i = 0; i < n - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[n - 1] = temp;
		}
		System.out.println("Rotated array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		scan.close();
	}
}