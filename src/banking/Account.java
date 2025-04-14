package banking;

import java.util.Scanner;




//계좌정보를 표현할 수 있는 Account라는 클래스 정의
public class Account {
	String name;
	String accountnumber;
	int balance;
	//생성자 
	//public void Accountinfo(int num) {
		 //accountList = new Account[num];
		//입력된 정보의 갯수(or 인덱스) 카운트를 위한 변수 
		//accountList = Accountinfo(int);
	public Account(String name, String accountnumber, int balance) {
		this.name = name;
		this.accountnumber = accountnumber;
		this.balance = balance;
	}
	interface Menu {
		int MAKE = 1;
		int DEPOSIT = 2;
		int WITHDRAW = 3;
		int INQUIRE = 4;
		int EXIT = 5;
	}
	//메서드 생성
	public void showMenu() {
		System.out.println("-----Menu-----");
		System.out.println("1.계좌개설:");
		System.out.println("2.입금:");
		System.out.println("3.출금:");
		System.out.println("4.계좌정보출력:");
		System.out.println("5.프로그램종료:");
		
		
	}
	public void makeAccount() {
		System.out.println("예금주: " + name);
		System.out.println("계좌번호: " +accountnumber);
		System.out.println("잔고: " + balance + "원");
		
}
	if(choice==1) {
		System.out.print("보통예금계좌:"); 
		account = NormalAccount.scan.nextLine(); 
		Account = new Account(iName, iAccountnumber, iBalace);
		myFriends[numOfFriends++] = high;
	}
	else if(choice==2) {  
		System.out.print("높은이율계좌:"); 
		iMajor = MyFriendInfoBook.scan.nextLine();
		myFriends[numOfFriends++] = 
			new UnivFriend(iName, iPhone, iAddr, iMajor);
	} 
	}