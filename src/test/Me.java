package test;

public class Me extends Father {

	int myMoney = 20000;

	Me() {
		super(); // ��� ���� Ŭ������ ������.
	}

// vs Overloading  �ϳ��� �żҵ带 ������ ����ڷμ� �Ű������� �ٸ��� ���
	@Override // super Ŭ������ �ִ°� ���� ���� ������ �ؼ� ���ڴ�
	public void getMoney() {
		// TODO Auto-generated method stub
		super.getMoney();
	}

	public void myMoney() {
		System.out.println(" �� ����: " + this.myMoney);
		super.prt();
	}

}
