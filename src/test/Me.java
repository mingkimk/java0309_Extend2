package test;

public class Me extends Father {

	int myMoney = 20000;

	Me() {
		super(); // 상속 받은 클래스의 생성자.
	}

// vs Overloading  하나의 매소드를 가지고 사용자로서 매개변수만 다르게 사용
	@Override // super 클래스에 있는거 말고 내가 제정의 해서 쓰겠다
	public void getMoney() {
		// TODO Auto-generated method stub
		super.getMoney();
	}

	public void myMoney() {
		System.out.println(" 내 돈은: " + this.myMoney);
		super.prt();
	}

}
