package test04;


public class Ex01 
{
	public static void main(String[] args) 
	{
		Goods camera = new Goods();
		
		camera.name = "니콘";
		camera.price = 400000;
		camera.numberOfStock = 30;
		camera.sold = 50;
		
		System.out.println("상품 이름: " + camera.name);
		System.out.println("상품 가격: " + camera.price);
		System.out.println("재고 수량: " + camera.numberOfStock);
		System.out.println("팔린 수량: " + camera.sold);
	}
}
