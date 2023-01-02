package first_java_project;

import java.util.Arrays;
import java.util.Scanner;

public class java6 {

	public static void main(String[] args) {
//		arrays
//		old way
//		int[] numbers = new int[5];
//		numbers[0] = 55;
//		numbers[1] = 55;
//		numbers[2] = 55;
//		numbers[3] = 55;
//		System.out.println(Arrays.toString(numbers));
////		new way
//		int[] numbers2 = {5, 6, 7};
//		System.out.println(Arrays.toString(numbers2));

//		int temp, min, minIndex = 0;
//		int[] arrNum = new int[5];
		
//		Scanner in = new Scanner(System.in);
//
//		for (int i = 0; i < 5; i++) {
//			arrNum[i] = in.nextInt();
//		}

//		for (int i = 0; i< 4*4; i++) {
//		if (arrNum[i%4] > arrNum[i%4+1]) {
//			temp = arrNum[i%4];
//			arrNum[i%4] = arrNum[i%4+1];
//			arrNum[i%4+1] = temp;
//		}
//		}
//		min = arrNum[0];
//		for (int i = 0; i < 5; i++) {
//			if ( arrNum[i] < min) {
//				min = arrNum[i];
//				minIndex = i;
//			}
//			
//			System.out.println(min);
//			for (int j = i+1; j < 5 ; j++) {
//				if ( arrNum[j] < min) {
//				temp = arrNum[j];
//				arrNum[j] = min;
//				arrNum[minIndex] = temp;
//				}
//				System.out.println(Arrays.toString(arrNum));
//			}
//		}
		
//		int len = 5, temp = 0;
//		int arrNum[] = new int[len];
//		Scanner in = new Scanner(System.in);
//				for (int i = 0; i < len; i++) {
//			arrNum[i] = in.nextInt();
//		}
//				System.out.println(Arrays.toString(arrNum));
//			
//				forword
//				for (int i = 0; i<len-1; i++) {
//					temp = arrNum[i+1 %len];
//					arrNum[i+1 % len] = arrNum[i];
//					arrNum[i] = temp;
//				}
				
//				back
//				temp = arrNum[len-1];
//				for (int i = len-1; i>0; i--) {
//					arrNum[i] = arrNum[i-1];
//				}
//				arrNum[0] = temp;
				
//				System.out.println(Arrays.toString(arrNum));
//		int id = 30488067, sum =0, digit,last = 0;
//		int arrId[] = new int[9];
//		for (int i= 0; i< 9;i++) {
//			arrId[i] = id % 10;
//			digit = arrId[i];
//			id/= 10;
//			if(i%2 ==0)digit *=2; 
//				while(digit > 0) {
//					sum += digit % 10;
//					digit /= 10;
//				}
//		last = 10 - sum%10;
//		}
//		System.out.println(last);
		
	}

}
