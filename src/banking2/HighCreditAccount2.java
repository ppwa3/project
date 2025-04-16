package banking2;

import bank.schema.ICustomDefine;

public class HighCreditAccount2 extends Account2 {

	int intInformation;// 이율정보
	String creDitRat;// 신용등급 (A, B, C)

	@Override
	public String toString() {
		return "HighCreditAccount2" + super.toString() + ", 이자=" + intInformation + ", 신용등급=" + creDitRat + "]";
	}

	public HighCreditAccount2(String accountNum, String name, int balance, int intInformation, String creDitRat) {
		super(accountNum, name, balance);
		this.intInformation = intInformation;
		this.creDitRat = creDitRat;
		// this.creDitRat = creDitRat;
	}

	// 메서드는 클래스 안에서 중첩선언되면 안된다. showInfo는 생성자 바깥에 작성
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("기본 이자율: " + intInformation + "%");
		System.out.println("신용등급: " + creDitRat);
	}

	@Override
	public  countMoney(int money) {
		
		if(creDitRat.equals("A")) {
			return ICustomDefine.A;
		}
		double totalBalance = getBalance() + (getBalance() * intInformation / 100.0) + money;
		System.out.println("일반계좌:" + totalBalance + "원");
		int newB = (int) totalBalance;
		setBalance(newB);

	}

}
