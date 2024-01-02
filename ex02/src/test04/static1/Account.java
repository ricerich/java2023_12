package test04.static1;

public class Account 
{
	private int account_no;//계좌번호
	private String user_name;//예금주
	private int money;//예금액
//	private static double rate;//이자
	public static double rate;//이자
	
	public Account(int account_no, String user_name, int money, double rate) {
		this.account_no = account_no;
		this.user_name = user_name;
		this.money = money;
		this.rate = rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
		
	}

	public static double getRate() {
		return rate;
	}
	
	
}
