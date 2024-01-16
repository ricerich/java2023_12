package ex05;

import java.util.Scanner;

public class GraphicEditor 
{
	//처음과 끝을 가리키는 레퍼런스 변수를 멤버변수로 만들어 놓는다.
	Shape first;
	Shape last;
	
	public GraphicEditor()
	{
		first = null;
		last = null;
	}
	
	void run()
	{
		System.out.println("그래픽 에디어 GV1.0을 실행합니다.");
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.print("선(1), 사각형(2), 원(3)>>");
					int option = sc.nextInt();
					input(option);
					break;
				case 2:
					System.out.print("삭제할 도형의 위치>>");
					int position = sc.nextInt();
					if(delete(position) == false)
					{
						System.out.println("삭제할 수 없습니다");
					}
					else
					{
						System.out.println(position+"위치의 노드를 삭제하였습니다");
						
					};
					break;
				case 3:
					view();
					break;
				case 4:
					return;
					
				default:
					System.out.println("1~4를 입력해 주세요");
				
			}
		}
		
	}
	
	private void input(int option) //1.선, 2.사각형, 3.원
	{
		Shape obj=null;
		switch(option)
		{
			case 1://선 객체를 만들어서, 연결 시킨다.
				obj = new Line();
				break;
			case 2:
				obj = new Rect();
				break;
			case 3:
				obj = new Circle();
				break;
		}
		
		//연결리스트로 만들어 준다. 만든 노드를 꽂아준다.
		//유의할 사항은 경우의 수를 따져봐야한다.
		//경우1:아무것도 없을때,(first가 null일때, 이때는 first에 꽂아준다)
		//경우2:노드가 있을때,(first가 null아니고, 이때는 last의 next에 꽂아준다)
		
		if(first == null)
		{
			first = obj;
			last = obj;
		}
		else// if(first != null)
		{
//			last.next = obj;
			last.setNext(obj);//last 뒤(next)에 꽂아준다
			last = obj;//새로 꽂은거을 last로 바꿔줌
		}
		
	}
	
	private boolean delete(int position) 
	{
		Shape current = first;
		Shape previous = first;
		
		//1.삭제 대상이 없는지 체크(first == null)
		//2.현재 위치를 찾는다(삭제하고 잘 할...)(3번을 지우고자 하는데 2개만 있는경우)
		//3.삭제 대상이 1개 일 경우 체크(first == last)
		//4.삭제 대상이 마지막 노드일 겨우(current == last)
		//5.마지막 아니고, 중간 노들 삭제할 경우(previous.next = current.next) 할당
		
		//1.삭제 대상이 없는지 체크(3번을 지우고자 하는데 2개만 있는경우)
		if(first == null)
			return false;
		
		//2.현재 위치를 찾는다(삭제하고 잘 할 대상의 현재위치, 예: 3)
		for(int i=1; i<=position; i++)
		{
			previous = current;
			current = current.getNext();//내가 뒤(next)로 넘어간다
			
			//중요: 삭제 작업은 후처리로 레퍼런스만 변경할 예정임
			
			//예외처리
			if(current == null)//삭제를 하려고 햇으나 없어요!!!
				return false;
		}
		
		//3.삭제 대상이 1개 일 경우 체크(first == last)
		if(first == last)
		{
			first = null;
			last = null;
			return true;
		}
		
		//후처리
		//4.삭제 대상이 마지막 노드일 겨우(current == last)
		if(current == first)//첫 번째 일 경우(두 개중에 앞에꺼 삭제할 경우)
		{
			first = first.getNext();
		}
		else if(current == last)//마지막 일 경우
		{
			last = previous;
			last.setNext(null);
		}
		else//중간일 경우
		{
			//previous.next = current.next;
			previous.setNext(current.getNext());
		}
		
		return true;
	}

	private void view() 
	{
		Shape current=first;//현재 위치를 가리키는 레퍼런스변수, 시작은 first로
		while( current != null)
		{
			current.draw();
			current = current.getNext();
		}
		
	}




}
