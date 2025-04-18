package banking3;

import bank.schema.ICustomDefine;
import banking2.Account2;
import banking2.ICustomDefine2;

public class HighCreditAccount3 extends Account3 {

	int intInformation;// 이율정보
	String creDitRat;// 신용등급 (A, B, C)
	int interest;
	@Override
	public String toString() {
		return "HighCreditAccount3" + super.toString() + ", 이자=" + intInformation + ", 신용등급=" + creDitRat + "]";
	}

	public HighCreditAccount3(String accountNum, String name, int balance, int intInformation, String creDitRat) {
		super(accountNum, name, balance);
		this.intInformation = intInformation;
		this.creDitRat = creDitRat;
		// this.creDitRat = creDitRat;
	}

	// 메서드는 클래스 안에서 중첩선언되면 안된다. showInfo는 생성자 바깥에 작성
	@Override
	public void showInfo() {
		System.out.println("계좌번호: " + getAccountNum());
		System.out.println("고객이름: " + getName());
		System.out.println("잔액: " + getBalance());
		System.out.println("기본 이자율: " + intInformation + "%");
		System.out.println("신용등급: " + creDitRat.toUpperCase());
	}
	
	@Override
	public void plusMoney(int money) {
		//변수를 double형으로 선언해줌, 추가이자를 저장하기 위한 변수이다.
		double plusInter=0;//추가이자
		//신용등급에 따라 이자율을 다르게 적용시켜주기 위해서 if문을 사용
		if(creDitRat.toUpperCase().equals("A")) {
			plusInter = ICustomDefine3.A;
		}
		//equals는 문자열을 비교 (같으면 true 다르면 false)
		//"B" 더블 쿼테이션은 문자열 - 한글자짜리 문자열이된다.
		else if(creDitRat.toUpperCase().equals("B")) {
			plusInter = ICustomDefine3.B;
		}
		else if(creDitRat.toUpperCase().equals("C")) {
			plusInter = ICustomDefine3.C;
		}
		//int balance = getBalance();
		double totalBalance = getBalance() + (getBalance() * plusInter) + (getBalance() * intInformation) + money;
		System.out.println("신용계좌 :" + totalBalance + "원");
		int newB = (int) totalBalance;
		setBalance(newB);
		//return getBalance();

	}

}
