package java_chobo.ch08.exception_quiz;

public class BankAccount {
	int money;
	int minMoney;
	
	public BankAccount(int minMoney) {
		this.minMoney = minMoney;
	}

	void deposit(int money) {
		this.money += money; 
		System.out.printf("정상 입금처리: 입금금액=%d, 잔금=%d%n", money, this.money);
	}
	
	void withdraw(int money) throws InvalidWithdraw {

		if (money < 0 || this.money-money <= this.minMoney) {
			throw new InvalidWithdraw("초과출금 요구예외");
		} else {
			this.money -= money;
		}
		System.out.printf("정상 출금처리: 인출금액=%d, 잔금=%d%n", money, this.money);
		
		
	}

	
	
}
