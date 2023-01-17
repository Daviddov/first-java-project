package first_java_project;

import java.util.Scanner;

public class Exersize5 {
//2
	public static int findMax(int num1, int num2, int num3) {
		int max = num1;
		if (num2 > max) {
			max = num2;
		} else if (num3 > max) {
			max = num3;
		}
		return max;
	}

	public static int findMin(int num1, int num2, int num3) {
		return -findMax(-num1, -num2, -num3);
	}
//3
	public static int reverse(int num) {
		int newNum = 0;
		while (num != 0) {
			newNum *= 10;
			newNum += num % 10;
			num /= 10;
		}
		return newNum;
	}
public static boolean chackFilandrum(int num) {
	int reverse =reverse(num);
	while(num != 0) {
		if (reverse%10 == num%10) {
			reverse /= 10;
			num/=10;
		} else {
			return false;
		}
	}
	return true;
}


//5
public static int bulidNum(int indices, int num) {
	int newNum=0, i=0, len, pow=1, digit;
	num= reverse(num);
	int[] arr = new int[9];
	while (num != 0) {
		if (i>=9) {
			System.out.println("num out of rang");
		}
		arr[i] = num % 10;
		num /= 10;
		i++;
	}
	len = i;

	while (indices != 0) {
		digit =indices%10;
		if (digit <= len) {

			newNum += arr[digit]*pow;
			pow*=10;
		}else {
			System.out.println(digit + " is out of rang index");
		}
		indices/=10;
	}
	
	return newNum;
}


	public static void main(String[] args) {
//		System.out.println(reverse(123456789));
//		System.out.println(chackFilandrum(1234443421));
//		System.out.println(bulidNum(2330,1234));
	}

}
