package first_java_project;

public class Exersize4 {
//	1
//public static boolean chackArr(int[] arr, int[] arr2) {
//	int len = arr.length-1;
//	for (int i=0; i<len; i++) {
//		if(arr[i] != arr2[len-i]) {
//			return false;
//		}
//	}
//	return true;
//}

//	2
//	public static void fibo(int num , int num2) {
//		int[] arr = new int[10];
//		arr[0] = num;
//		arr[1] = num2;
//		for (int i=2; i<10; i++) {
//			arr[i] = arr[i-1] + arr[i-2];
//		}
//		for(int i=0;i<arr.length-1; i++) {
//		System.out.println(arr[i]);
//		}
//	}

//	3
//	public static void checkSort(int[] arr) {
//		for (int i = 0; i < arr.length - 2; i++) {
//			if (arr[i] > arr[i + 1]) {
//				System.out.println("nop");
//				return;
//			} 
//		}
//		System.out.println("yes");
//	}
//	4
//	public static void checkFilandrom(int[] arr) {
//		int len = arr.length-1;
//		for (int i = 0; i < len/2; i++) {
//			if (arr[i] != arr[len -i]) {
//				S
//	ystem.out.println("no");
//				return;
//			} 
//		}
//		System.out.println("yes");
//	}

//1
//	public static int checkCaplise(String str) {
//		int count =0;
//		int len = str.length()-1;
//		String newStr = "";
//		for(int i=0; i<len; i++) {
//			if(str.charAt(i) <'a') {
//				newStr += (char) (str.charAt(i) + 'a'-'A');
//				count++;
//			}else{
//				newStr += str.charAt(i);
//			};
//		}
//		System.out.println(newStr);
//		return count;
//	}
//	3
//	public static int countStr(String str1, String str2) {
//		int count = 0;
//		for (int i = 0; i < str2.length() -str1.length(); i++) {
//			if(str1.charAt(0) == str2.charAt(i)) {
//			if(str2.indexOf(str1) != -1) {
//				count++;
//				System.out.println(str1);
//			}
//			}
//			str2 = str2.substring(i+1);
//		}
//		return count;
//	}
//	1
//	public static boolean newcountDigit(int num, int digit) {
//		if (num == 0) return true;
//		else if (num%10==digit) return !countDigit(num / 10, digit);
//		else return	countDigit(num / 10, digit);
//	}

//	public static boolean countDigit(int num, int digit) {
//		boolean odd = true;
//		if (num < 10) {
//			if (num == digit) {
//				return !odd;
//			}
//		} else {
//			odd = countDigit(num / 10, digit);
//			if (num % 10 == digit) {
//				odd = !odd;
//			}
//		}
//		return odd;
//	}
//2
//	public static void binary(int num) {
//		if(num ==0) {
//			return;
//		}else {
//			binary(num/2);
//			System.out.print(num%2);
//		}
//	}
	public static boolean multi(int[] arr, int num, int index) {
		boolean res = false;
		if (arr.length == index) {
			return false; 
		} else if (num == arr[index]) {
			return true;
		} else if (num % arr[index] == 0) {
			res = multi(arr, num / arr[index], index + 1);
		} else {
			res = multi(arr, num, index + 1);
		}
		if (!res) {
			res = multi(arr, num, index + 1);
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 2, 3, 3, 5 };
		int[] arr3 = { 5, 4, 3, 2, 1 };
		int[] arr4 = { 2, 5,15 ,3 };

//		System.out.println(chackArr(arr1, arr3));
//		System.out.println(chackArr(arr1, arr2));
//		fibo(1,1);
//		checkSort(arr2);
//		checkSort(arr3);
//		checkFilandrom(arr4);
//		System.out.println(checkCaplise("sdfdghhJHhggfjuhj"));
//		System.out.println(countStr("aba", "asajhghggababa"));
//		System.out.println(countDigit(0, 0));
//		System.out.println(countDigit(423474, 4));
//		System.out.println(countDigit(23474, 4));
//		System.out.println(countDigit(23, 4));
//		binary(128);
		System.out.println(multi(arr4, 45, 0));

	}
}
