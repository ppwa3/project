package banking2;

public class NormalAccount2 extends Account2 {

	int interest;

	public NormalAccount2(String accountNum, String name, int balance, int interest) {
		super(accountNum, name, balance);// 부모클래스 초기화
		this.interest = interest;// 자식클래스 필드 초기화
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("이자율: " + interest + "%");

	}

	@Override
	public String toString() {
		return "NormalAccount2" + super.toString() + ", 이자=" + interest + "]";
	}

	@Override
	public void countMoney(int money) {
		double totalBalance = getBalance() + (getBalance() * interest / 100.0) + money;
		System.out.println("일반계좌:" + totalBalance + "원");
		int newB = (int) totalBalance;
		setBalance(newB);

	}

}
