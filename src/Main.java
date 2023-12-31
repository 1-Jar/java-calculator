import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Calculator V1.0 by 1Jar");
		System.out.println("Example for calculator: 10 (sign) 5");
		System.out.println("Example for checker: 10 (sign) 5 = (your result) \n");
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> n = new ArrayList<Integer>();
		ArrayList<String> o = new ArrayList<String>();
		String v;
		o.add("+");o.add("-");o.add(":");o.add("/");o.add("*");o.add("x");o.add("X");
		System.out.println("Options available: \n Checker \n Calculator \n Type the option that you have selected.");
		v = s.nextLine();
		if(v.equalsIgnoreCase("Calculator")) {
			String x;
			System.out.println("What you want to calculate?");
			n.add(s.nextInt());
			x = s.next();
			n.add(s.nextInt());
        if (o.contains(x)) {if (x.equals("+")) {add(n.get(0), n.get(1));} else if (x.equals("-")) {sub(n.get(0), n.get(1));} else if (x.equalsIgnoreCase("X") || x.equals("*")) {multi(n.get(0), n.get(1));} else if (x.equals(":") || x.equals("/")) {div(n.get(0), n.get(1));}} else {errore();}
	} else if (v.equalsIgnoreCase("Checker")) {
		ArrayList<Integer> g = new ArrayList<Integer>();
		System.out.println("What operation you want to check?");
		g.add(s.nextInt());
		String l = s.next();
		g.add(s.nextInt());
		String e = s.next();
		g.add(s.nextInt());
		if(l.equals("X") || l.equals("x") || l.equals("*")) {
			checkerM(g.get(0), g.get(1), g.get(2));
		} else if (l.equals("+")) {
			checkerA(g.get(0), g.get(1), g.get(2));
		} else if (l.equals("-")) {
			checkerS(g.get(0), g.get(1), g.get(2));
		} else if (l.equals("/") || l.equals(":")) {
			checkerD(g.get(0), g.get(1), g.get(2));
		} else if (!v.equalsIgnoreCase("Calculator") || !v.equalsIgnoreCase("Checker")){
		erroreT();
		}
	} else {
		err();
	}
}

	static void erroreT() {
		System.out.println("There was an error on the option that you typed. Retry, please.");
	}

	static void checkerM(int a, int b, int c) {
		if(a*b == c) {
			System.out.println("Yeah, the result is correct.");
		} else {
			System.out.println("The result isn't correct. Here the correct result: " + a*b);
		}
	}
	
	static void checkerA(int a, int b, int c) {
		if(a+b == c) {
			System.out.println("Yeah, the result is correct.");
		} else {
			int result = a + b;
			System.out.println("The result isn't correct. Here the correct result: " + result);
		}
	}
	
	static void checkerS(int a, int b, int c) {
		if(a-b == c) {
			System.out.println("Yeah, the result is correct.");
		} else {
			int h = a-b;
			System.out.println("The result isn't correct. Here the correct result: " + h);
		}
	}
	
	static void checkerD(int a, int b, int c) {
		if(a/b == c) {
			System.out.println("Yeah, the result is correct.");
		} else {
			System.out.println("The result isn't correct. Here the correct result: " + a/b);
		}
	}

	static void add(int a, int b) {
		int r = a + b;
		System.out.println("The result of your addition is: " + r);
	}

	static void sub(int a, int b) {
		int r = a - b;
		System.out.println("The result of your subtraction is: " + r);
	}

	static void div(int a, int b) {
		int r = a / b;
		if(a % b == 0) {
		System.out.println("The result of your division is: " + r);
		} else {
		System.out.println("The result of your division is: " + r + " with rest " + a % b);
		}
	}

	static void mult(int a, int b) {
		int r = a * b;
		System.out.println("The result of your multiplication is: " + r);
	}

	static void err() {
		System.out.println("There was an error. Retry, please.");
	}
	
}
