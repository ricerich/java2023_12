package ex04;

public class Song 
{
	private String title;
	private String artist;
	private int year;
	private String country;
	
	public Song()
	{
		title = "겨울비";
		artist = "홍길동";
		year= 2023;
		country = "대한민국";
	}

	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	public void show()
	{
		System.out.println(year+"년 "+country+" 국적의 "+artist+"가 부른 " + title);
	}

}





