package ex05;

public interface Stack 
{
	int length(); // 현재 스택에 저장된 개수 리턴
	int capacity(); // 스택의 전체 저장 가능한 개수 리턴
	String pop(); // 스택의 톱(top)에 실수 저장(넣기)
	boolean push(String val); // 스택의 톱(top)에 저장된 문자열 1개 리턴(빼기)
}
