package test04;

public class Basic 
{
	public static void main(String[] args) 
	{
		//2.클래스 사용하기
		//3.객체 만들기
		Person p1;//Person클래스를 사용하여, p1 객체"변수"2를 만든다
		p1 = new Person();//생성자를 사용해서, new를 붙여서, 찐객체를 만든다
		
		Person p2 = new Person();
		
		//4.객체 사용하기(2가지: 멤버변수 사용, 메소드 사용)
		//객체뒤에 쩜(.)을 찍어서 사용
		p1.age = 12;//p1객체의 age멤버변수를 사용
		p1.printAge();//객체의 메소드를 사용
		p1.printName();
		
		p2.printAge();
		p2.addAge();
		p2.printAge();
		
	}

}
