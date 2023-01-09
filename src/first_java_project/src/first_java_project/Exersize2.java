<<<<<<< HEAD
package first_java_project;

import java.util.Scanner;

public class Exersize2 {

//1
//	public static void countDig(int n, int dig) {
//	int count = 0;
//		while (n > 0) {
//			if (n % 10 == dig) {
//				count++;
//			}
//			n /= 10;
//	}
//		System.out.println(count);
//	}
//	
//	public static void enterNum() {
//		int n, dig;
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter a num");
//		n = in.nextInt();
//		System.out.println("Enter a dig");
//		dig = in.nextInt();
//		countDig(n, dig);
//	}

//	1
//public static int oddNum(int num) {
//	int count =0;
//	if (num < 10) {
//		if(num%2 == 0) {
//			count++;
//		}
//		return count;
//	} else {
//		if(num % 2 == 0) {
//			count++;
//		}
//		num /= 10;
//		count += oddNum(num);
//		return count;
//	}
//}
//2
//public static boolean isOdd(int num) {
//	boolean res = true;
//	if(num<10) {
//	if(num%2 == 1) {
//		return false;
//		}
//	} else {
//		if(num%2 == 1) {
//			return false;
//			}
//		res =isOdd(num/10);	
//	}
//	return res;
//}

//3
//public static void creatShape(int a, int b) {
//	if(a == b) {
//		for(int i=0;i<a;i++) {
//			System.out.print('*');
//		}
//	}else {
//		for(int i=0;i<a;i++) {
//			System.out.print('*');
//		}
//		System.out.println();
//		creatShape(a+1,b);
//	}
//}

//4
//	public static int oddNumInArr(int[] arr, int len ) {
//		int count = 0 ;
//		if(len-1 == 0) {
//			if(arr[len-1]%2 == 0) {
//			return 1;
//		}else {
//			return 0;
//		}
//		}else {
//			if(arr[len-1]%2 == 0) {
//				count++;
//			}
//		}
//				count+= oddNumInArr(arr, len-1 );
//				return count;
//		}
//	5
//public static boolean isDef(int[] arr, int len) {
//	boolean res = true;
//	if(len == 2) {
//		if ((arr[len-1] + arr[len-2])% 2 == 0) return false;  	
//		} else {
//			if((arr[len-1] + arr[len-2]) % 2 == 0) {
//				return false;  	
//				}else {
//					res = isDef(arr,len-1);
//				}
//	}
//	return res;
//}
	public static void main(String[] args) {
//		enterNum();
//		System.out.println(oddNum(123456));
//		System.out.println(isOdd(246));
//		creatShape(3,6);
		
//		int[] arr = new int[5];
//		arr[0] = 21;
//		arr[1] = 432;
//		arr[2] = 32;
//		arr[3] = 12;
//		arr[4] = 6;
		int[] arr2 =  {0,5,4,5,0};
//		System.out.println(oddNumInArr(arr2, 5));
//		System.out.println(isDef(arr2, 5));
		
	}

}
=======
package first_java_project;

import java.util.Scanner;

public class Exersize2 {

//1
//	public static void countDig(int n, int dig) {
//	int count = 0;
//		while (n > 0) {
//			if (n % 10 == dig) {
//				count++;
//			}
//			n /= 10;
//	}
//		System.out.println(count);
//	}
//	
//	public static void enterNum() {
//		int n, dig;
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter a num");
//		n = in.nextInt();
//		System.out.println("Enter a dig");
//		dig = in.nextInt();
//		countDig(n, dig);
//	}

//	1
//public static int oddNum(int num) {
//	int count =0;
//	if (num < 10) {
//		if(num%2 == 0) {
//			count++;
//		}
//		return count;
//	} else {
//		if(num % 2 == 0) {
//			count++;
//		}
//		num /= 10;
//		count += oddNum(num);
//		return count;
//	}
//}
//2
//public static boolean isOdd(int num) {
//	boolean res = true;
//	if(num<10) {
//	if(num%2 == 1) {
//		return false;
//		}
//	} else {
//		if(num%2 == 1) {
//			return false;
//			}
//		res =isOdd(num/10);	
//	}
//	return res;
//}

//3
//public static void creatShape(int a, int b) {
//	if(a == b) {
//		for(int i=0;i<a;i++) {
//			System.out.print('*');
//		}
//	}else {
//		for(int i=0;i<a;i++) {
//			System.out.print('*');
//		}
//		System.out.println();
//		creatShape(a+1,b);
//	}
//}

//4
//	public static int oddNumInArr(int[] arr, int len ) {
//		int count = 0 ;
//		if(len-1 == 0) {
//			if(arr[len-1]%2 == 0) {
//			return 1;
//		}else {
//			return 0;
//		}
//		}else {
//			if(arr[len-1]%2 == 0) {
//				count++;
//			}
//		}
//				count+= oddNumInArr(arr, len-1 );
//				return count;
//		}
//	5
//public static boolean isDef(int[] arr, int len) {
//	boolean res = true;
//	if(len == 2) {
//		if ((arr[len-1] + arr[len-2])% 2 == 0) return false;  	
//		} else {
//			if((arr[len-1] + arr[len-2]) % 2 == 0) {
//				return false;  	
//				}else {
//					res = isDef(arr,len-1);
//				}
//	}
//	return res;
//}
	public static void main(String[] args) {
//		enterNum();
//		System.out.println(oddNum(123456));
//		System.out.println(isOdd(246));
//		creatShape(3,6);
		
//		int[] arr = new int[5];
//		arr[0] = 21;
//		arr[1] = 432;
//		arr[2] = 32;
//		arr[3] = 12;
//		arr[4] = 6;
		int[] arr2 =  {0,5,4,5,0};
//		System.out.println(oddNumInArr(arr2, 5));
//		System.out.println(isDef(arr2, 5));
		
	}

}
>>>>>>> aeb6439d509bd2c1b94bed8e71eba2da7604cfee
