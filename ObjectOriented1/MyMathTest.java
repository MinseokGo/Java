class MyMathTest {
	public static void main(String[] args) {
		MyMath my = new MyMath();
		long resultAdd = my.add(5L, 3L);
		long resultSub = my.sub(5L, 3L);
		long resultMul = my.mul(5L, 3L);
		double resultDiv = my.div(5L, 3L);
		
		System.out.printf("5 + 3 = %d\n", resultAdd);
		System.out.printf("5 - 3 = %d\n", resultSub);
		System.out.printf("5 x 3 = %d\n", resultMul);
		System.out.printf("5 / 3 = %f\n", resultDiv);
	}
}

class MyMath {
	long add(long a, long b) { return a + b; }
	long sub(long a, long b) { return a - b; }
	long mul(long a, long b) { return a * b; }
	double div(double a, double b) { return a / b; }
}
