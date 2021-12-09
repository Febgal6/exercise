package app;

public class Math {
	
	static int addition(int a, int b) {
		System.out.println(a+"+"+b+"="+(a+b));
		return 0;
	}
	
	static int soustraction(int a, int b) {
		System.out.println(a+"-"+b+"="+(a-b));
		return 0;
	}
	static double division(int a, int b) {
		System.out.println(a+"/"+b+"="+(a/b));
		return 0;
	}
	static int multiplication(int a, int b) {
		System.out.println(a+"*"+b+"="+(a*b));
		return 0;
	}
	static void sinus(double a) {
		System.out.println("sin de"+ a+"=" + java.lang.Math.sin(a));
	}
	static void cosinus(double a) {
		System.out.println("cosin de"+ a+"=" + java.lang.Math.cos(a));
	}
	static void tangente(double a) {
		System.out.println("tangente de"+ a+"=" + java.lang.Math.tan(a));
	}



	
	
	
}



