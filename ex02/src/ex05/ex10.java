package ex05;

public class ex10 {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("손흥민", "축구");
		dic.put("아이유", "가수");
		dic.put("아이유", "배우"); 
		System.out.println("아이유의 값은 " + dic.get("아이유"));
		System.out.println("손흥민의 값은 " + dic.get("손흥민"));
		dic.delete("손흥민");		
		System.out.println("손흥민의 값은 " + dic.get("손흥민"));		
	}

}
