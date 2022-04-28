class FactorialTest {
	public static void main(String[] args) {
		long result = 0;
		int n = 21;
		for(int i=1; i<=n; i++) {
			result = factorial(i);
			if(result == -1) {
				System.out.println("유효하지 않은 값입니다.");
				break;
			}
			System.out.printf("%2d!=%20d%n", i, result);
		}
	}
	
	static int factorial(int n) {
		int result = 0;
		
		if(n <= 0 || n > 20) return -1;	// 매개변수 n의 유효성 검사
		if(n == 1)
			result = 1;
		else 
			result = n * factorial(n-1);
		
		return result;
	}
}
