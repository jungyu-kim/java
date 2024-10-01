package 김준규;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account[] accounts = new Account[100];
		boolean run =true;
		Account ac = null;
		
		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.계좌생성 - 2. 계좌목록 - 3. 예금 - 4. 출금 - 5.종료" );
			System.out.println("---------------------------------------------");
			System.out.print("선택>");
			int menuNo = Integer.parseInt(sc.nextLine());
			
			switch (menuNo) {
			case 1:
				System.out.println("--------");
				System.out.println("계좌생성");
				System.out.println("--------");
				
				System.out.print("계좌번호:");
				String ano = sc.nextLine();
				
				System.out.print("계좌주:");
				String owner = sc.nextLine();
				
				System.out.print("초기입금액:");
				System.out.println();
				int balance = sc.nextInt();
				sc.nextLine();
				
				ac = new Account(ano, owner, balance);
				
				for(int i=0; i<accounts.length; i++) {
					if(accounts[i] == null) {
						accounts[i] = ac; 
						System.out.println("결과:계좌가 생성되었습니다.");
						break;
					}					
				}
				
				break;
			case 2:
				System.out.println("------");
				System.out.println("계좌목록");
				System.out.println("------");
				
				for(int i=0; i<accounts.length; i++) {
					System.out.printf();
				}
			}
			
		}

	}

}
