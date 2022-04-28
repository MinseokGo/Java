class Data { int x; }

class ReferenceParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);	// 값이 저장된 주소를 change 메서드에 전달
		System.out.println("main() : x = " + d.x);	// d.x의 값이 변경
	}
	
	static void change(Data d) {		// 참조형 매개변수
		d.x = 1000;		// 인스턴스를 참조하여 값을 변경
		System.out.println("change() : x = " + d.x);
	}
}
