package first_java_project;

import java.awt.Point;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class first_java {
public static void main(String[] args) {
//	1
//	int num1, num2, num3, num4, sum;
//	float avg;
//	System.out.println("enter 4 numbers");
//	Scanner in = new Scanner(System.in);
//	num1 = in.nextInt();
//	num2 = in.nextInt();
//	num3 = in.nextInt();
//	num4 = in.nextInt();
//	sum = num1 + num2 + num3 + num4;
//	avg = sum / (float)4;
//	System.out.print("The average is: " + avg);
	
//	2
//	float num1, num2, dvid1,dvid2 , sum;
//	System.out.println("enter tow numbers:");
//	Scanner in = new Scanner(System.in);
//	num1 = in.nextFloat();
//	num2 = in.nextFloat();
//	dvid1 = num1 / 4;
//	dvid2 = num2 / 4;
//	sum = dvid1 + dvid2;
//	System.out.println(dvid1 + " " + dvid2);
//	System.out.println(sum);
	
//	3
//	System.out.println('*');
//	System.out.println('*');
//	System.out.println("* * *");
	
//	4
//	int num1, num2, num3;
//	System.out.println("enter 3 numbers:");
//	Scanner in = new Scanner(System.in);
//	num1 = in.nextInt();
//	num2 = in.nextInt();
//	num3 = in.nextInt();
//	System.out.println(num3);
//	System.out.println(num3 + " " + num2 );
//	System.out.println(num3 + " " + num2 +" ");
	
//	3.2.1
//	int a=1, b=2, c=3, d=4, e=5, f=6, dx2 = 7;
//	
//	a = b + c;
//	dx2 = d * 2;
//	c = dx2 - b;
//	e = a + (f * 5);
//	
//	3.2.2
//	int adult = 20 ,child = 12;
//	System.out.println("The price for adult is: " + adult);
//	System.out.println("The price for child is: " + child);
//	
//	3.3.1
//	int a=0, b=2, c=1, d=4, e=5;
//	a += b;
//	a += c;
//	a += d;
//	a += e;
//	System.out.println(a);
	
//	3.3.2
//	a -= 5;
//	b *= 3;
//	a -= b;
//	System.out.println(a);
//	3.3.3
//	int n=0,m=0,w=0,v=0,x=0,t=0,a=0;
//	n = m + 5 - 2;
//	a += ((a + 2) * 3) * 4 - 9;
//	v += (v + w) * 5;
//	x = t - 3;
//	3.3.4
//	e=d;
//	d=c;
//	c=b;
//	b=a;
	
//	3.5.1
//	float priceForPage = (float)6.3, numberOfPages = 0, sum;
//	System.out.println("please insert the number of pages:");
//	Scanner in = new Scanner(System.in);
//	numberOfPages = in.nextInt();
//	sum = priceForPage * numberOfPages;
//	System.out.println(sum);
//	3.5.2
//	float length, radius, surface;
//	final float PI = 3.14159265F;
//	System.out.println("Insert Square length:");
//	Scanner in = new Scanner(System.in);
//	length = in.nextFloat();
//	radius = length / 2;
//	surface = radius * radius * PI;
//	System.out.print(surface);
	
//	3.5.3
//	float num, price, discount, newPrice, total;
//	System.out.println("How many umbrellas? ");
//	Scanner in = new Scanner(System.in);
//	num = in.nextInt();
//	System.out.println("Enter the price of one umbrella: ");
//	price = in.nextFloat() ;
//	System.out.println("Enter discount percentage per umbrella: ");
//	discount = in.nextFloat();
//	newPrice = (price * discount) / 100;
//	total = num * newPrice;
//	System.out.print(total);
	
//	1
//	float c, f;
//	System.out.println("Please provide Fahrenheit");
//	Scanner in = new Scanner(System.in);
//	f = in.nextFloat();
//	c = ((float)5/9) * (f - 32);
//	System.out.println("Celsius:" + c);
	
//	2
//	float n1, n2, yeter, p, s;
//	System.out.println("Please provide 3 numbers");
//	Scanner in = new Scanner(System.in);
//	n1 = in.nextFloat();
//	n2 = in.nextFloat();
//	yeter = in.nextFloat();
//	p = n1 + n2 + yeter;
//	s = (n1 * n2) / 2;
//	System.out.println("p:" + p + "s:" +s);
	
//	3
//	int x, y, z, temp;
//	System.out.print("Enter first element: ");
//	x = in.nextInt();
//	System.out.print("Enter second element: ");
//	y = in.nextInt();
//	System.out.print("Enter third element: ");
//	z = in.nextInt();
//	temp = x
//	x = y;
//	y = z;
//	z = temp;
//	System.out.println(x + " " + y + " " + z);
	
//	Date now = new Date();
//	System.out.print(now);
	
//	Point p1 = new Point(1,5);
//
//	Point p2 = p1;
//	p1.x = 5;
//	System.out.println(p1);
//	System.out.print(p2);
	
//	string
//	String msg = "hello";
//	System.out.println(msg);
	
//	arrays
//	old way
//	int[] numbers = new int[5];
//	numbers[0] = 55;
//	numbers[1] = 55;
//	numbers[2] = 55;
//	numbers[3] = 55;
//	System.out.println(Arrays.toString(numbers));
//	new way
//	int[] numbers = {5, 6, 7};
//	System.out.println(Arrays.toString(numbers));
	
//	Multi-Dimensional Arrays 
//	old way
//	int[][] table = new int [3][3];
//	table[0][1] = 7;
//	System.out.println(Arrays.deepToString(table));
//	new way
//	int[][] table = {{2,55,22},{22,456,9}};
//	System.out.println(Arrays.deepToString(table));
	
//	from string to int
//	String num = "1";
//	Integer.parseInt(num);
	
//	number format
//	NumberFormat currency = NumberFormat.getCurrencyInstance();
//	String result = currency.format(65656);
//	System.out.println(result);
//	
//	NumberFormat percent = NumberFormat.getPercentInstance();
//	String result2 = percent.format(0.6);
//	System.out.println(result2);
	
	
	final byte MOUNTS_IN_YEAR = 12, PERCENT = 100;
	int principal, period;
	float annual;
	double mortgage;
	
	Scanner in = new Scanner(System.in);
	while(true) {
		System.out.println("Principal:");
		principal = in.nextInt();
		if (principal >= 1000 && principal <= 1000000)
			break;
		System.out.println("Insert number between 1,000 to 1,000,000");
	}
	System.out.print("Annual Interest Rate:");
	annual = in.nextFloat();
	float mounthlyInterest = annual / PERCENT / MOUNTS_IN_YEAR;
	System.out.print("Period (Years):");
	float years = in.nextInt();
	float numberOfPayment = years * MOUNTS_IN_YEAR;
	mortgage = (principal * mounthlyInterest * 
			Math.pow(1 + mounthlyInterest, numberOfPayment)/
			Math.pow(1 + mounthlyInterest, numberOfPayment));
	
	NumberFormat currency = NumberFormat.getCurrencyInstance();
	String result = currency.format(mortgage);
	
		System.out.print("Mortgage: " + result);
}
	
	
}
