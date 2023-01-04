package first_java_project;

import java.util.Scanner;

public class Exersize {
	
//	public static char getLastChar(String st) {
//		char ch = st.charAt(st.length()-1);
//		return ch;
//	}
	public static void main(String[] args) {
//		1
//		char ch = getLastChar("balbla");
//System.out.println(ch);
//2
//int n = 999, num =0, multypel, dvided;
//char ch2;
//Scanner in = new Scanner(System.in);
//System.out.println("Enter tree number between 0-9");
//for (int i = 0; i < 3; i++) {
//	 ch2 = (char) in.nextInt();
//	num += (int) ch2 ;
//	num *= 10;
//}
//num /= 10;
//multypel = num*3;
//dvided = num/3;
//
//System.out.println(multypel);
//System.out.println(dvided);
		
//3
//	int age=0, width=0;
//	float height=0;
//	char res = 0;
//	Scanner in = new Scanner(System.in);
//	System.out.println("Enter age");
//	age = in.nextInt();
//	System.out.println("Enter height");
//	height = in.nextInt();
//	System.out.println("Enter width");
//	width = in.nextInt();
//	if (height/width <2 && height/width >0.5) {
//		res = 'A';
//	} else if (height/width < 3.5 && height/width > 2 ) {
//		if(age > 10 && age < 40) {
//			res = 'B';
//		}else {
//			res = 'C';
//		}
//	} else if (height/width > 3.5 && height/width < 5 ) {
//		if(age > 10 && age < 20 || age > 40 && age < 120 ) {
//			res = 'C';
//		} else {
//			res = 'A';
//		}
//	}
//	System.out.println(res);

//		3
//		double num = 0;
//		int input = 0;
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter a number");
//		num = in.nextDouble();
//		System.out.println("Enter your round method");
//		System.out.println("1.Floor round");
//		System.out.println("2. Ceiling");
//		System.out.println("3.Round to the nearest whole number");
//		input = in.nextInt();
//		if (input == 1) {
//			num = num % 1;
//		}else if (input == 2) {
//			num = (num+0.99 % 1);
//		}else {
//			num = (int)((num +0.5);
//		}
//		System.out.println(Math.round(num));
		
//		6
//		int len = 5;
//		for (int i = 0; i < len; i++) {
//			for(int j=0; j<= i;j++) {
//				System.out.print('*');
//			}
//			
//			for(int k=0; k< (len-i-1)*2;k++) {
//				System.out.print(' ');
//			}
//			
//			for(int l=0; l<= i;l++) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}
//		7
//		char a ='x';
//		for (int i=0; i<a-'a';i++) {
//			for(int j=0; j<a-'a'-i-1;j++) {
//				System.out.print(' ');
//			}
//			int k;
//			for( k=0; k<= i ;k++) {
//				System.out.print((char)(k+'a'));
//			}	
//			for(int l=i; l> 0;l--) {
//				System.out.print((char)(l+'a'-1));
//			}	
//			System.out.println();
//		}
//		8
//		int rows = 5, dvided=3;
//		for(int i =0;i<rows;i++) {
//			for(int j= 0; j < rows;j++) {
//				for(int k = 0; k< rows;k++) {
//				System.out.print((k +i) % rows);
//				}
//				System.out.print("@");	
//			}
//			System.out.println();
//		}
		
//		9
//		int arr[]  = new int[10];
//		int input = 3056560, bad =3444, digit, count = 0;
//		while (input > 0 ) {
//			digit = input % 10;
//			arr[digit]++;
//			input /=10;
//		}
//		for(int i= 0; i< arr.length;i++) {
//			if(arr[i]%2 != 0)count++;
//		}
//		if(count>2) {
//			System.out.println("not palindrome");	
//} else {
//	for (int i = 0; i < arr.length; i++) {
//		if(arr[i] != 0) {
//			if(arr[i] > 1);
//		}
//	}
//	
//}

//			char ch;
//			int num;
//			System.out.println("Please enter a number between 0-9");
//			Scanner in = new Scanner(System.in);
//			ch = (char)(in.nextInt()) ;
//			num = ch -0;
//
//			for (int i=0; i<num; i++){
//			      System.out.print(i + " ");
//			}
//			System.out.println();
//
//			for (int i=0; i < num; i++){
//			     System.out.print(i + " ");
//			     for (int j=0; j<num; j++){
//			            System.out.print(i * j + " ");
//			     }
//			      System.out.println();
//			  } 
		
	 
//			String toPrint, filter;
//
//			System.out.println("Please enter a string ");
//			Scanner in = new Scanner(System.in);
//			toPrint = in.next();
//			System.out.println("Please enter a filter");
//			filter = in.next();
//
//			for (int i=0; i<filter.length(); i++){
//			     for (int j=0; j<toPrint.length(); j++){
//			           char ch = toPrint.charAt(j);
//			           if (filter.charAt(i) == ch) {
//			                System.out.print(ch);
//			      
//			     }
//			}
//			  }
		
	
//			int num= 0 , digit = 0, nextDigit = 1;
//			String result = "True";
//			System.out.println("Please enter a number");
//			Scanner in = new Scanner(System.in);
//			num = in.nextInt();
//			while(num != 0){
//			       digit = num%10;
//			       num/=10;
//			       if (num > 10){
//			           nextDigit = num%10;
//			            num/=10;
//			           }
//			       if ((digit * nextDigit) % 2 !=0){
//			          result = "False";
//			          break; 
//			        }
//			}
//			System.out.println(result);
			} 
	
			}
			

	
