<<<<<<< HEAD
package first_java_project;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import unit4.bucketLib.Bucket;
import unit4.turtleLib.Turtle;





public class lessone_2_java {
public static void main(String[] args) {
//	String[] fruits = {"apple", "orange", "lemon"};
//	
//	for(String fruit : fruits) {
//	System.out.println(fruit);
//	}
//	4.1
//float step = 0.42f, rightPow, StraightPow, total, right = 21 * step, straight = 30 * step;
// 
//rightPow = (float) Math.pow(right, 2);
//StraightPow = (float) Math.pow(straight, 2);
//total = (float) Math.sqrt(rightPow + StraightPow);
//System.out.print(total*2);

//	int num = 79, digit1, digit2, total;
//	digit1 = num % 10;
//	digit2 = num / 10;
//	total = digit1 + digit2;
//	System.out.println(digit1);
//	System.out.println(digit2);
//	System.out.println(total);
	
//	System.out.println((char)((char)'A' + 'a'-'A'));
//	System.out.println((char)('b'-'a'));//?
//	System.out.println('a'-'a');//0
//	System.out.println((char)'b'-'a'); //1
//	System.out.println('b'-'a');//1

//	Random rnd = new Random();
//	System.out.println(rnd.nextInt(10));
	
//int lowerLimit = -11, upperLimit = 6;
//Random rnd = new Random();
//System.out.println(rnd.nextInt(upperLimit - lowerLimit + 1) + lowerLimit);

//	4.1
//	int moneyLeft, basketball = 50, gam = 1, childMoney = 20, allMoney = childMoney * 3, numOfGum;
//	moneyLeft = allMoney - basketball;
//	numOfGum = moneyLeft / gam;
//	System.out.println(numOfGum);
	
//	4.2
//	float hight1 = 1.68F, hight2 = 1.50F;
//	float sum = (float) Math.abs(hight1 - hight2);
//	System.out.println(sum);
//	4.3
//	float hight1 = 1.68F, hight2 = 1.50F;
//	float min = (float) Math.min(hight1, hight2);
//	System.out.println(min);
//	4.4
//	float side1 = 5, side2 = 7, slant, surface = side1 * side2;
//	slant = (float) Math.sqrt(Math.pow(side2 , 2)+ Math.pow(side1, 2));
//	System.out.println(slant);
//	System.out.println(surface);
//	System.out.println('a'-30);
	
//	4.2.1
//	int   = 156, bag = 20, sumOfBags = maerbles / bag, sperte = maerbles % bag;
//	System.out.println("maerbles :" + maerbles +  "\n sumOfBags :" + sumOfBags + " sperte:" + sperte);
	
//	4.13
//	int pages  = 55, timeForPage = 10, hour= 60, 
//			minutes = pages * timeForPage % hour , 
//			hours = pages * timeForPage / hour;
//	float salaryPerPage = 6.3F, totalSalary = salaryPerPage * pages;
//	System.out.println(pages + " pages take "+ hours +"  hours" + " and "+ minutes  + " minutes" + "\n");
//	System.out.println("Tha total Salary is:"+ totalSalary);
//	4.14
//	char input= 'a', bigA ='a'-('a'-'A'), smallA ='A'+ ('a'-'A') ;
////	System.out.println((char)bigA);
//	System.out.println("enter a char");
//	Scanner in = new Scanner(System.in);
//	input = in.next().charAt(0);
//	input -= ('a'-'A');
//	char nextChar = (char) (input + 1);
//	System.out.println(input);
//	System.out.println(nextChar);
	
//	4.23
//	System.out.println("enter a char");
//	Scanner in = new Scanner(System.in);
//	char input = in.next().charAt(0);
//	char multyplyByTen = (char) (input * 10), multyplyByFiveTeen = (char) (input * 15);
//	System.out.print("input: "+ input +" multyplyByTen: "+multyplyByTen + " multyplyByFiveTeen:"+multyplyByFiveTeen);
////	
//	4.24
//	System.out.println("enter 2 chars");
//	Scanner in = new Scanner(System.in);
//	char num1 = (char) (in.next().charAt(0) - '0');
//	char num2 = (char) (in.next().charAt(0) -'0');
//	System.out.println(num1 + num2);
	
//	Random rnd = new Random();
//	System.out.println(rnd.nextInt(6)+1);
//	System.out.println(rnd.nextInt(6)+1);
	
//Turtle t = new Turtle();
//t.moveForward(100);
//t.tailDown();
//t.moveForward(100);
//t.turnRight(75);
//t.moveForward(100);
//t.turnRight(75);
//t.moveForward(100);
//t.turnRight(75);
//t.moveForward(100);
//t.tailUp();
//t.moveForward(100);
	
//Bucket b = new Bucket(100, "buck");
//b.fill(50);
//Bucket bb = new Bucket(100, "buck");
//bb.fill(50);
//b.pourInto(bb);
//Bucket bbb = new Bucket(100, "buck");
//bbb.fill(50);
//bb.pourInto(bbb);
//	4.1
//	float a = 5, b = 7, c = 5, x1, x2;
//	float aX2 = 2 * a;
//	float powB = (float) Math.pow(b, 2)	;
//	float acX4 = -4 * a * c;
//	x1 = (float) ((- b + Math.sqrt(powB - acX4)) / aX2);
//	x2 = (float) ((- b - Math.sqrt(powB - acX4)) / aX2);
//	System.out.print(x1 + " "+ x2);
	
//	int num1 =6, num2 =3, a, b, c, d, e;
//	a= num1 / 2;
//	b= num1 % 2;
//	c= num2 /10;
//	d= num2 %10;
//	e= num1 /num2;
//	d= num1% num2;
//	System.out.print(a + " "+ b);
//	                                   
//	int num = 7;
//	for (int i = num; i >= -num; i-=2) {
//		for (int j = num - Math.abs(i) ; j >= 0; j--) {
//			System.out.print(" ");
//		}
//		for (int j =  Math.abs(i); j > 0; j--) {
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
//	1
//	int n = 4, sum = 0;
//	for (int i = 0; i < n; i++) {
//		sum += Math.pow(i, 2);
//	}
//	System.out.println(sum);
	
//	2
//	int k= 8, num = 888, counter = 0, lastDigit;
//	do {
//	lastDigit = num % 10;
//		if (num % k == 0) {
//			counter++;
//		}	
//		num /= 10;
//	} while (num != 0);
//	System.out.println(counter);
	
//	3
//	int num = 0, max = 0, min = 999999999, counter = 0, sum = 0, avg = 0, even = 0, odd = 0;
//	System.out.println("הכנס סידרה של מספרים, לסיום הכנס -1");
//	Scanner in = new Scanner(System.in);
//	num = in.nextInt();
//	while(num != -1) {
//		if (max < num ) max = num;
//		if (min > num ) min = num;
//		if (num % 2 == 0) odd++;
//		if (num % 2 != 0) even++;
//		sum += num;
//		counter++;
//		avg = sum / counter;
//		num = in.nextInt();
//		};
//	
//	System.out.println(
//			"max: " + max +"\n" +
//			"min: " + min +"\n" +
//			"counter: " + counter +"\n" +
//			"avg: " + avg +"\n" +
//			"sum: " + sum +"\n" +
//			"even: " + even +"\n" +
//			"odd: " + odd +"\n" 
//			);
	
	int a = 0 , b = 0;
	float result = 0;
	int action;
	System.out.println("  הכנס משוואה לדוגמא 5 + 5");
	Scanner in = new Scanner(System.in);
	a = in.nextInt();
	action = in.next().charAt(0);
	b = in.nextInt();
	if (action == 42) result = a  * b;
	if (action == 43) result = a  + b;
	if (action == 45) result = a  - b;
	if (action == 47) result = (float)a  / b;
	if (result % 1 == 0) result = (int)result;
	System.out.println(result);


}
}
=======
package first_java_project;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import unit4.bucketLib.Bucket;
import unit4.turtleLib.Turtle;





public class lessone_2_java {
public static void main(String[] args) {
//	String[] fruits = {"apple", "orange", "lemon"};
//	
//	for(String fruit : fruits) {
//	System.out.println(fruit);
//	}
//	4.1
//float step = 0.42f, rightPow, StraightPow, total, right = 21 * step, straight = 30 * step;
// 
//rightPow = (float) Math.pow(right, 2);
//StraightPow = (float) Math.pow(straight, 2);
//total = (float) Math.sqrt(rightPow + StraightPow);
//System.out.print(total*2);

//	int num = 79, digit1, digit2, total;
//	digit1 = num % 10;
//	digit2 = num / 10;
//	total = digit1 + digit2;
//	System.out.println(digit1);
//	System.out.println(digit2);
//	System.out.println(total);
	
//	System.out.println((char)((char)'A' + 'a'-'A'));
//	System.out.println((char)('b'-'a'));//?
//	System.out.println('a'-'a');//0
//	System.out.println((char)'b'-'a'); //1
//	System.out.println('b'-'a');//1

//	Random rnd = new Random();
//	System.out.println(rnd.nextInt(10));
	
//int lowerLimit = -11, upperLimit = 6;
//Random rnd = new Random();
//System.out.println(rnd.nextInt(upperLimit - lowerLimit + 1) + lowerLimit);

//	4.1
//	int moneyLeft, basketball = 50, gam = 1, childMoney = 20, allMoney = childMoney * 3, numOfGum;
//	moneyLeft = allMoney - basketball;
//	numOfGum = moneyLeft / gam;
//	System.out.println(numOfGum);
	
//	4.2
//	float hight1 = 1.68F, hight2 = 1.50F;
//	float sum = (float) Math.abs(hight1 - hight2);
//	System.out.println(sum);
//	4.3
//	float hight1 = 1.68F, hight2 = 1.50F;
//	float min = (float) Math.min(hight1, hight2);
//	System.out.println(min);
//	4.4
//	float side1 = 5, side2 = 7, slant, surface = side1 * side2;
//	slant = (float) Math.sqrt(Math.pow(side2 , 2)+ Math.pow(side1, 2));
//	System.out.println(slant);
//	System.out.println(surface);
//	System.out.println('a'-30);
	
//	4.2.1
//	int   = 156, bag = 20, sumOfBags = maerbles / bag, sperte = maerbles % bag;
//	System.out.println("maerbles :" + maerbles +  "\n sumOfBags :" + sumOfBags + " sperte:" + sperte);
	
//	4.13
//	int pages  = 55, timeForPage = 10, hour= 60, 
//			minutes = pages * timeForPage % hour , 
//			hours = pages * timeForPage / hour;
//	float salaryPerPage = 6.3F, totalSalary = salaryPerPage * pages;
//	System.out.println(pages + " pages take "+ hours +"  hours" + " and "+ minutes  + " minutes" + "\n");
//	System.out.println("Tha total Salary is:"+ totalSalary);
//	4.14
//	char input= 'a', bigA ='a'-('a'-'A'), smallA ='A'+ ('a'-'A') ;
////	System.out.println((char)bigA);
//	System.out.println("enter a char");
//	Scanner in = new Scanner(System.in);
//	input = in.next().charAt(0);
//	input -= ('a'-'A');
//	char nextChar = (char) (input + 1);
//	System.out.println(input);
//	System.out.println(nextChar);
	
//	4.23
//	System.out.println("enter a char");
//	Scanner in = new Scanner(System.in);
//	char input = in.next().charAt(0);
//	char multyplyByTen = (char) (input * 10), multyplyByFiveTeen = (char) (input * 15);
//	System.out.print("input: "+ input +" multyplyByTen: "+multyplyByTen + " multyplyByFiveTeen:"+multyplyByFiveTeen);
////	
//	4.24
//	System.out.println("enter 2 chars");
//	Scanner in = new Scanner(System.in);
//	char num1 = (char) (in.next().charAt(0) - '0');
//	char num2 = (char) (in.next().charAt(0) -'0');
//	System.out.println(num1 + num2);
	
//	Random rnd = new Random();
//	System.out.println(rnd.nextInt(6)+1);
//	System.out.println(rnd.nextInt(6)+1);
	
//Turtle t = new Turtle();
//t.moveForward(100);
//t.tailDown();
//t.moveForward(100);
//t.turnRight(75);
//t.moveForward(100);
//t.turnRight(75);
//t.moveForward(100);
//t.turnRight(75);
//t.moveForward(100);
//t.tailUp();
//t.moveForward(100);
	
//Bucket b = new Bucket(100, "buck");
//b.fill(50);
//Bucket bb = new Bucket(100, "buck");
//bb.fill(50);
//b.pourInto(bb);
//Bucket bbb = new Bucket(100, "buck");
//bbb.fill(50);
//bb.pourInto(bbb);
//	4.1
//	float a = 5, b = 7, c = 5, x1, x2;
//	float aX2 = 2 * a;
//	float powB = (float) Math.pow(b, 2)	;
//	float acX4 = -4 * a * c;
//	x1 = (float) ((- b + Math.sqrt(powB - acX4)) / aX2);
//	x2 = (float) ((- b - Math.sqrt(powB - acX4)) / aX2);
//	System.out.print(x1 + " "+ x2);
	
//	int num1 =6, num2 =3, a, b, c, d, e;
//	a= num1 / 2;
//	b= num1 % 2;
//	c= num2 /10;
//	d= num2 %10;
//	e= num1 /num2;
//	d= num1% num2;
//	System.out.print(a + " "+ b);
//	                                   
//	int num = 7;
//	for (int i = num; i >= -num; i-=2) {
//		for (int j = num - Math.abs(i) ; j >= 0; j--) {
//			System.out.print(" ");
//		}
//		for (int j =  Math.abs(i); j > 0; j--) {
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
//	1
//	int n = 4, sum = 0;
//	for (int i = 0; i < n; i++) {
//		sum += Math.pow(i, 2);
//	}
//	System.out.println(sum);
	
//	2
//	int k= 8, num = 888, counter = 0, lastDigit;
//	do {
//	lastDigit = num % 10;
//		if (num % k == 0) {
//			counter++;
//		}	
//		num /= 10;
//	} while (num != 0);
//	System.out.println(counter);
	
//	3
//	int num = 0, max = 0, min = 999999999, counter = 0, sum = 0, avg = 0, even = 0, odd = 0;
//	System.out.println("הכנס סידרה של מספרים, לסיום הכנס -1");
//	Scanner in = new Scanner(System.in);
//	num = in.nextInt();
//	while(num != -1) {
//		if (max < num ) max = num;
//		if (min > num ) min = num;
//		if (num % 2 == 0) odd++;
//		if (num % 2 != 0) even++;
//		sum += num;
//		counter++;
//		avg = sum / counter;
//		num = in.nextInt();
//		};
//	
//	System.out.println(
//			"max: " + max +"\n" +
//			"min: " + min +"\n" +
//			"counter: " + counter +"\n" +
//			"avg: " + avg +"\n" +
//			"sum: " + sum +"\n" +
//			"even: " + even +"\n" +
//			"odd: " + odd +"\n" 
//			);
	
	int a = 0 , b = 0;
	float result = 0;
	int action;
	System.out.println("  הכנס משוואה לדוגמא 5 + 5");
	Scanner in = new Scanner(System.in);
	a = in.nextInt();
	action = in.next().charAt(0);
	b = in.nextInt();
	if (action == 42) result = a  * b;
	if (action == 43) result = a  + b;
	if (action == 45) result = a  - b;
	if (action == 47) result = (float)a  / b;
	if (result % 1 == 0) result = (int)result;
	System.out.println(result);


}
}
>>>>>>> aeb6439d509bd2c1b94bed8e71eba2da7604cfee
