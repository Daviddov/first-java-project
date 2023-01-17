package first_java_project;

public class Recursion {
	public static void printBack(int num) {
		if (num < 10) {
			System.out.print(num);
		} else {
			System.out.print(num % 10);
			printBack(num / 10);
		}
	}

	public static int sumOfDigit(int num) {
		int sum;
		if (num < 10) {
			return num;
		} else {
			sum = sumOfDigit(num / 10);
			sum += num % 10;
		}
		return sum;
	}

	public static int sumOfEven(int num) {
		int sum = 1;
		if (num < 10) {
			if (num % 2 == 0) {
				return num;
			} else {
				return 1;
			}
		} else {
			sum = sumOfEven(num / 10);
			if ((num % 10) % 2 == 0) {
				 sum *= num % 10;
			} 
				return sum;
			
		}
	}

	public static void run(int num) {
		if(num == 1) {
			System.out.println('*'+ " ");
		} else {
			run( num-1);
			for(int i= 0; i< num ;i++) {
				System.out.print('*'+ " ");
				}
				System.out.println();
		}
	}
	
	public static void run2(int startNum, int endNum) {
		if(startNum == endNum) {
			for(int i= 0; i< startNum ;i++) {
				System.out.print('*'+ " ");
			}
			System.out.println();
		} else {
			for(int i= 0; i< startNum ;i++) {
				System.out.print('*'+ " ");
			}
			System.out.println();
			run2(startNum+1, endNum);
		}
	}
	
//	public static Boolean chackEven(int num) {
//		Boolean odd = true;
//		if(num < 10) {
//			if (num % 2 == 1) {
//				return true;
//			} else {
//				return false;
//			}
//		} else {
//			count = chackEven(num-1);
//		}
//	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		printBack(123456789);
//		System.out.print(sumOfDigit(95432));
//		System.out.print(multiOfDigit(95432));
//		System.out.print(sumOfEven(342));
//		run2(2, 6);
	}

}
