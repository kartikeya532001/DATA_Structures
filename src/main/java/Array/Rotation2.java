package Array;

import java.util.Scanner;

public class Rotation2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the index of rotation: ");
		int d = scan.nextInt();
		int temp[] = new int[d];
		int j = 0;
		System.out.println("Enter the elements of array: ");
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		for (int i = 0; i < d; i++) {
			temp[i] = a[i];
		}
		for (int i = 0; i < n - d; i++) {
			a[i] = a[i + 2];
		}
		for (int i = n - d; i < n; i++) {
			a[i] = temp[j++];
		}
		System.out.println("Rotated array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		scan.close();
	}
}