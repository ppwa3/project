package banking;

public class AccountManager {

	private Account[] account;	
	private int numOfAccount;

	public AccountManager(int num) {
		account = new Account[num];
		 numOfAccount = 0;
	}
 
	//연락처 정보 추가 
	public void showAccInfo(int choice) {
		System.out.println("전체계좌정보출력");
		//Scanner scan = new Scanner(System.in);
		//입력값을 저장할 변수 생성 
		String iAccountnumber,iName,iBalance;
		//공통 정보 3가지를 입력받음 
		System.out.print("계좌번호:");iAccountnumber = showAccInfo.scan.nextLine();
		System.out.print("이름:");iName = makeAccount.scan.nextLine();
		System.out.print("잔고:");iBalance = makeAccount.scan.nextLine();
		
		if(choice==1) {
			System.out.print("보통예금계좌:"); iAccountnumber = AccountManager.scan.nextLine(); 
			//고딩 인스턴스 생성 후 참조값을 변수에 저장
			HighFriend high = new HighFriend(iName, iPhone, iAddr, iNickname);
			/*
			인스턴스 참조값을 배열에 추가. 카운트용 변수를 후위 증가 시켜 0번
			인덱스에 먼저 입력한 후 1증가한다. */
			highFriends[numOfhighFriend++] = high;
		}
		else if(choice==2) {  
			//대딩인 경우 전공을 추가로 입력 
			System.out.print("높은이율계좌:"); iMajor = MyFriendInfoBook.scan.nextLine();
			//대딩 인스턴스 생성과 동시에 배열에 추가 
			univFriends[numOfunivFriend++] = 
				new UnivFriend(iName, iPhone, iAddr, iMajor);
		} 
		System.out.println("##친구정보 입력이 완료되었습니다##");
	}
}
