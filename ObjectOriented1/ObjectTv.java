class Tv {
		// TV�� �Ӽ�(�������)
		String color;	// ����
		boolean power;	// ��������
		int channel;	// ä��
		
		// TV�� ���(�޼���)	
		void power() { power = !power; }	// TV�� �Ѱų� ���� ����� �ϴ� �޼���
		void channelUp() { ++channel; }		// TV�� ä���� ���̴� ����� �ϴ� �޼���
		void channelDown() { --channel; }	// TV�� ä���� ���ߴ� ����� �ϴ� �޼���
}
class TvTest {
	public static void main(String[] args) {
		Tv t = new Tv();			// Ŭ������ ��ü�� �����ϱ� ���� �������� ����
								// Ŭ������ ��ü�� ������ ��, ��ü�� �ּҸ� ���������� ����
		t.channel = 5;
		t.channelDown();
		System.out.println("���� ä����" + t.channel + " �Դϴ�.");
	}
}