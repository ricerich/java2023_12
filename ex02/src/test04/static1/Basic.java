package test04.static1;

public class Basic {

	public static void main(String[] args) 
	{
		Account a1 = new Account(17, "홍길동", 10, 0.02);//홍길동
		Account a2 = new Account(10, "강감찬", 20, 0.02);//강감찬
		Account a3 = new Account(81, "이순신", 35, 0.02);//이순신
		
		
		System.out.println("이율"+a1.getRate());//이율 get, 한 다음 출력
//		a1.setRate(0.03);//이율 set
//		a1.rate = 0.03;
//		a2.rate = 0.03;
		Account.rate = 0.03;
		
		System.out.println("이율"+a1.getRate());//이율 get, 한 다음 출력
		System.out.println("이율"+a2.getRate());//이율 get, 한 다음 출력
		System.out.println("이율"+a3.getRate());//이율 get, 한 다음 출력
		
		System.out.println("이율"+Account.getRate());//이율 get, 한 다음 출력
		System.out.println("이율"+Account.getRate());//이율 get, 한 다음 출력
		System.out.println("이율"+Account.getRate());//이율 get, 한 다음 출력
		
		

	}

}
