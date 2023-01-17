package first_java_project;

public class JAVA7 {
	public static void sortStr(char[] str, int dir) {
		char min, max, temp;
		int indexMin = 0, indexMax = 0;
		if (dir == 1) {
			for (int i = 0; i < str.length; i++) {
				max = str[i];
				for (int j = i; j < str.length; j++) {
					if (max < str[j]) {
						max = str[j];
						indexMin = j;

						temp = str[i];
						str[i] = max;
						str[indexMin] = temp;
					}
				}
			}
		}else {
			for (int i = 0; i < str.length; i++) {
				min = str[i];
				for (int j = i; j < str.length; j++) {
					if (min > str[j]) {
						min = str[j];
						indexMax = j;

						temp = str[i];
						str[i] = min;
						str[indexMax] = temp;
					}
				}
			}
		}
		System.out.print(str);
	}

	public static void sortStrToMax(char[] str) {
		char max, temp;
		int indexMin = 0;
		for (int i = 0; i < str.length; i++) {
			max = str[i];
			for (int j = i; j < str.length; j++) {
				if (max < str[j]) {
					max = str[j];
					indexMin = j;

					temp = str[i];
					str[i] = max;
					str[indexMin] = temp;
				}

			}

		}

		System.out.print(str);

	}

	public static void sortStrToMin(char[] str) {
		char min, temp;
		int indexMax = 0;
		for (int i = 0; i < str.length; i++) {
			min = str[i];
			for (int j = i; j < str.length; j++) {
				if (min > str[j]) {
					min = str[j];
					indexMax = j;

					temp = str[i];
					str[i] = min;
					str[indexMax] = temp;
				}

			}

		}

		System.out.print(str);

	}

	public static void main(String[] args) {
		char[] arrStr = new char[7];
		arrStr[0] = 'H';
		arrStr[1] = 'a';
		arrStr[2] = 'b';
		arrStr[3] = 'f';
		arrStr[4] = 'd';
		arrStr[5] = 'c';
		arrStr[6] = 'e';

		sortStr(arrStr,0);
	}

}
