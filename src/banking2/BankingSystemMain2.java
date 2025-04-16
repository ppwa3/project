package banking2;

import java.util.Scanner;

import banking2.Account2;
import bank.schema.ICustomDefine;

public class BankingSystemMain2 {

	//키보드 입력을 위한 인스턴스
		static Scanner scan = new Scanner(System.in);
		//계좌정보 저장을 위한 인스턴스배열
		static Account2[] Account2s = new Account2[50];
		//개설된 계좌정보 카운트용 변수
		static int accCnt = 0;
		
		public static void ShowMenu() {
			System.out.println("1.계좌계설");
			System.out.println("2.입금");
			System.out.println("3.출금");
			System.out.println("4.전체계좌정보출력");
			System.out.println("5.프로그램종료");
		}
		
		// 계좌개설을 위한 함수
		public static void makeAccount2() {
			System.out.print("계좌번호:");
			String a = scan.nextLine();
			System.out.print("이름:");
			String n = scan.nextLine();
			System.out.print("잔고:");
			int b = scan.nextInt();
			
			System.out.println("1. 보통예금계좌 2. 신용신뢰계좌");
			int choice = scan.nextInt();
			
			if(choice==1) {
				System.out.print("기본이자%(정수형태로입력):");
				int i = scan.nextInt();
				
				NormalAccount2 norm = new NormalAccount2(a, n, b, i);
				Account2s[accCnt++] = norm;
				System.out.println("계좌계설이 완료되었습니다.");
			}
			else if(choice==2) {  
				System.out.print("신용신뢰계좌:"); 
				System.out.print("기본이자%(정수형태로입력):");
				int inter = scan.nextInt();
				scan.nextLine();
				System.out.print("신용등급(A,B,C등급):");
				String c = scan.nextLine();
				HighCreditAccount2 high = new HighCreditAccount2(n, n, b, inter, c);
				Account2s[accCnt++] = high;
				System.out.println("계좌계설이 완료되었습니다.");
			} 
		} 
		//입금
		public static void depositMoney() {
		} 
		//출금
		public static void withdrawMoney() {
		} 
		//전체계좌정보출력
		public static void showAccInfo() {
			for(int i=0 ; i<accCnt ; i++) {
				//toString을 오버라이딩 했으므로 인스턴스 그대로 출력
				System.out.println(Account2s[i]);
			}
			System.out.println("**전체계좌정보가 출력됨**");
		}
		
		

	public static void main(String[] args) {
		
		AccountManager2 manager = new AccountManager2();
		while(true) {
			//메뉴출력
			ShowMenu();
			System.out.println("메뉴입력:");
			int key = scan.nextInt();
			scan.nextLine();//버퍼에 남은 엔터키 제거
			
			switch (key) {
			case ICustomDefine.MAKE:
				//계좌개설
				System.out.println("계좌개설");
				makeAccount2();
				break;
			case ICustomDefine.DEPOSIT:
				//입금
				System.out.println("입금");
				depositMoney();
				break;
			case ICustomDefine.WITHDRAW:
				//출금
				System.out.println("출금");
				withdrawMoney();
				break;
			case ICustomDefine.INQUIRE:
				//계좌정보출력
				System.out.println("계좌정보출력");
				showAccInfo();
				break;
			case ICustomDefine.EXIT:
				//프로그램 종료
				System.exit(0);
				break;
			default :
				
				break;
			}//switch 끝
		}//while 끝
	}//main 끝
}//class끝