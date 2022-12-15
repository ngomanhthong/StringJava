package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao chuoi s");
		String s = sc.nextLine();
		daoNguocChuoi(s);
		print(s);
	}

	public static void print(String s) {
		System.out.println();
		// dem so tu bang ham length();
		System.out.format("co %d tu trong chuoi", s.length());
	}

	public static void daoNguocChuoi(String s) {
		// bien chuoi thanh mang bang ham split
		String[] arr = s.split("");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}
}
