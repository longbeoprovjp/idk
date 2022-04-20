import java.util.Scanner;
import java.util.Random;
public class methods {
	static int classVar = 10;
	static int classVar2 = 100;
	Scanner socan = new Scanner(System.in);

	public static void printHi() {
		System.out.println("Hi, day la Long");

	}
	public static void printHi2(String n) { //n is a formal
		System.out.println("Hi " + n);
	}
	
	//overload
	public static int add2(int n, int m) {
		return (n+m);
	}
	public static int add3(int n, int m, int k) {
		return (n+m+k);
	}
	public static double addD2(double n, double m) {
		return (n+m);
	}
	public static double addDI(double n, int m) {
		return (n+m);
	}
	public static String addS(String s1, String s2) {
		return (s1+s2);
	}
//	public static int add2(int n, int m) {
//		return (n+m);
//	} these lines are wrong because we can't redefine the method and arguments
	
	//
	public static void fillArray(int [] n) {
		Random rand = new Random();
		for (int i=0; i<n.length; i++) {
			n[i] = rand.nextInt(100)+1;
		}
	}
	public static void printArray(int [] n) {
		System.out.println("--------");
		for (int i=0; i<n.length; i++) {
			System.out.println(n[i]);
		}
	}
	public static int find_sum(int [] n) {
		int sum = 0;
		for (int i=0; i<n.length; i++) {
			sum += n[i];
		}
		return(sum);
	}
	public static int find_min(int [] n) {
		int min = n[0];
		for (int i=0; i<n.length; i++) {
			if (n[i] < min) {
				min = n[i];
			}
		}
		return(min);
	}
	public static int find_minLocation(int [] n) {
		int min = n[0];
		int index = 0;
		for (int i=0; i<n.length; i++) {
			if (n[i] < min) {
				min = n[i];
				index = i;
			}
		}
		return(index);
	}

	//function can return an array
	public static int [] getArray() {
		int [] n= new int[10];
		Random rand = new Random();
		for (int i=0; i<n.length;i++) {
			n[i] = rand.nextInt(100)+1;
		}
		return (n);
	}
	public static void swap (int [] n, int i, int j){
		int temp = n[i];
		n[i] = n[j];
		n[j] = temp;
	}
	public static int find_minLocation2(int [] n, int start) {
		int min = n[start];
		int index = start;
		for (int i = start; i < n.length; i++) {
			if (n[i] < min) {
				min = n[i];
				index = i;
			}
		}
		return(index);
	}
	public static void sort (int [] n) {
		for (int start = 0; start < n.length; start++) {
			swap(n, start, find_minLocation2(n,start));
		}
	}
	
	public static void main(String[] args) {
		printHi();
		printHi2("L");
		int total;
		int [] num = new int[10];
		int min;
		int index;
		total = 0;
		fillArray(num);
		printArray(num);
		num = getArray();
		printArray(num);
		total = find_sum(num);
		min = find_min(num);
		index = find_minLocation(num);
		System.out.println("--------");
		System.out.println(total);
		System.out.println("--------");
		System.out.println(min);
		System.out.println("--------");
		System.out.println(index);
		System.out.println("--------");
		swap(num,1,8);
		printArray(num);
		sort(num);
		printArray(num);
	}
}
