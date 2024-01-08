package ex04;

public class Phone 
{
	//1.멤버변수
	//2.생성자
	//3.메소드
	
	private String name;
	private String tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
//	public void set(String name, String tel) {
//		this.name = name;
//		this.tel = tel;
//	}
	
//	public void setName(String name)
//	{
//		this.name = name;
//	}
//	public void setTel(String tel)
//	{
//		this.tel = tel;
//	}
	
	//1.출력을 할것인가? 아니면 2.값을 반환해 줄것인가?
	//1.출력 예
	public void show()
	{
		System.out.println("출력..." + name + "," + tel);
	}
	
	//2.반환의 예 (getter메소드)
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
}
