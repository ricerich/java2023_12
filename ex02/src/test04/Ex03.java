package test04;

public class Ex03 {

	public static void main(String[] args) 
	{
		Goods1 arr[] = new Goods1[3];
		
		arr[0] = new Goods1("니콘",200000,30,50);
		arr[1] = new Goods1("캐논",100000,10,15);
		arr[2] = new Goods1("삼성",320000,30,50);
		
		int price = arr[0].getPrice();
		System.out.println(arr[0].getName() + "가격은" + price);
		

	}

}
