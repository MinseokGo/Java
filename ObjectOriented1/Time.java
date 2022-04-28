public class Time {
	private int hour;		// �����ڸ� ���� ������ ���� ���� �������� ����
	private int minute;		//get, set �޼��带 ���ؼ��� ��ü�� ������ ���� ����
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
		//t.hour = 1; �� �Ұ���
		
		t.setMinute(59);
		//t.minute = 59; �� �Ұ���
		
		t.setSecond(59.99f);
		//t.second = 59.99f; �� �Ұ���
		
		System.out.printf("������ �ð��� %d�� %d�� %f���Դϴ�.", t.getHour(), t.getMinute(), t.getSecond());
	}
}
