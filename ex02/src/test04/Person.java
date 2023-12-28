package test04;

//1.클래스 만들기
public class Person//클래스 정의(define) 
{
	//클래스를 만들때는 3가지 요소로 구성된다.
	//1-1.생성자(메소드)
	//1-2.멤버변수
	//1-3.(멤버)메소드
	
	//1-1.생성자(메소드) 만들기(define:정의)
	Person(){ //목적: 멤버변수를 초기화 시킬때
		name = "홍길동";
		age = 1;
	}
	
	//1-2.멤버변수 만들기(declare:선언)
	String name;
	int age;
	float height;
	
	//1-3.(멤버)메소드 만들기(define:정의)
	void printName(){
		System.out.println("이름은" + name);
	}
	
	void printAge() {
		System.out.println("나이는" + age);
	}
	
	void addAge(){
		age++;
	}

}












