class Tv {
	// TV의 속성(멤버변수)
	String color;	// 색깔
	boolean power;	// 전원상태
	int channel;	// 채널
		
	// TV의 기능(메서드)	
	void power() { power = !power; }	// TV를 켜거나 끄는 기능을 하는 메서드
	void channelUp() { ++channel; }		// TV의 채널을 높이는 기능을 하는 메서드
	void channelDown() { --channel; }	// TV의 채널을 낮추는 기능을 하는 메서드
}
class TvTest {
	public static void main(String[] args) {
		Tv t = new Tv();		// 클래스의 객체를 참조하기 위한 참조변수 선언
						// 클래스의 객체를 생성한 후, 객체의 주소를 참조변수에 저장
		t.channel = 5;
		t.channelDown();
		System.out.println("현재 채널은" + t.channel + " 입니다.");
	}
}
