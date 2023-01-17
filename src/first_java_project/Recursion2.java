package first_java_project;

public class Recursion2 {

//	public static int point(int score) {
//		if (score < 4) {
//			if (score == 1) {
//				return 1;
//			} else if (score == 2) {
//				return 2;
//			} else {
//				return 4;
//			}
//		} else {
//			int res = point(score-1) + point(score-2) + point(score-3);
//			return res ;
//			}
//	}
	public static void sortMax(char[] str) {
		int indexMax = 0;
		char max, temp;
		for (int i = 0; i < str.length - 1; i++) {
			max = str[i];
			for (int j = i; j < str.length; j++) {
				if (max < str[j]) {
					max = str[j];
					indexMax = j;

					temp = str[i];
					str[i] = max;
					str[indexMax] = temp;
				}
			}

		}
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
		}
	}

	public static void minSortBubble(char[] str) {
		boolean sorted = false;
		int  n = str.length;;
		char temp;
		while (sorted != true) {
			sorted = true;
			for (int j = 1; j < n ; j++) {
				if (str[j-1] > str[j ]) {
					sorted = false;
					temp = str[j-1];
					str[j-1] = str[j];
					str[j] = temp;

				}

			}
			n--;
		}
		for (int j = 0; j < str.length; j++) {
			System.out.print(str[j]);
		}
	}

	public static void main(String[] args) {
//		System.out.print(point(5));
		char[] str = { 'Z', 'a', 'v', 'A', 'z' };
//		sortMax(str);
		minSortBubble(str);
	}

}
