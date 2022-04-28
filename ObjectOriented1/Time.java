public class Time {
	private int hour;		// 제어자를 통해 변수의 값을 직접 변경하지 못함
	private int minute;		// get, set 메서드를 통해서만 객체의 변수에 접근 가능
	private float second;
	
	public int getHour() { return hour; }
	public int getMinute() { return minute; }
	public float getSecond() { return second; }
	
	public void setHour(int h) {
		if(h < 0 || h > 23) return;
			hour = h;
	}
	
	public void setMinute(int m) {
		if(m < 0 || m > 59) return;
			minute = m;
	}
	
	public void setSecond(float s) {
		if(s < 0.0f || s > 59.99f) return;
			second = s;
	}
}

class TimeTest {
	public static void main(String[] args) {
		Time t = new Time();
		
		t.setHour(23);
		// t.hour = 1; 는 불가능
		
		t.setMinute(59);
		// t.minute = 59; 는 불가능
		
		t.setSecond(59.99f);
		// t.second = 59.99f; 는 불가능
		
		System.out.printf("지정된 시각은 %d시 %d분 %f초입니다.", t.getHour(), t.getMinute(), t.getSecond());
	}
}
