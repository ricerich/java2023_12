package ex04;

public class TV 
{
	private String brand;
	private int year;
	private int inch;
	
	//생성자는 멤버변수 초기화를 위해서 사용
	public TV(String brand, int year, int inch) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}

	public void show() {
		System.out.println(brand+"에서 만든 "+year+"년형 "+inch+"인치 TV");
	}

}
