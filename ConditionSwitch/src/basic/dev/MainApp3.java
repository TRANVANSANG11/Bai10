package basic.dev;

import java.util.Scanner;

public class MainApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap so thang: ");
		int month = sc.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Thang " + month + " co 31 ngay");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Thang " + month + " co 30 ngay");
			break;
		case 2:
			System.out.println("Thang " + month + " co 28 ngay");
			break;
		default:
			System.out.println("Thang khong hop le");
			break;
		}
	}
}
