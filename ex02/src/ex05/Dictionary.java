package ex05;

public class Dictionary extends PairMap {

	//멤버변수
	int total_count;//저장된 원소의 갯수
	
	public Dictionary(int capacity) {
		keyArray = new String[capacity];
		valueArray = new String[capacity];		
	}

	@Override
	String get(String key) 
	{
		for(int i=0; i<total_count; i++)
		{
			if(key.equals(keyArray[i]))
				return valueArray[i];
		}
		
		return null;
	}

	@Override
	void put(String key, String value) 
	{
		int index=0; //저장할 위치
		
		//입력받은 값이, pairMap의 key 배열에 있는 체크
		for(int i=0; i<total_count; i++ )//
		{
			index = i;//현재 위치를 저장			
			//만약에 그 키가 있으면, 그 위치에 value배열의 값을 수정
			if(key.equals(keyArray[i]))
			{				
				break;//key 값을 찾았으니까 나감
			}
			
			index++;//같은게 없으면(0~9, 9니까), 전체갯수 10
			
		}
		
		if(index == total_count)//한 바퀴 다 돌았는데, key값이 없다!!!
		{
			if(index< keyArray.length)//남은 자리가 있다면, 신규 입력(put)
			{
				keyArray[index] = key;
				valueArray[index] = value;
				total_count++; //저장된 갯수를 늘여준다.
			}
			
		}
		else//(한바퀴 다돌지 않고)중간에 값을 찾았으니까, 수정을 해야함
		{
			keyArray[index] = key;
			valueArray[index] = value;
		}

	}

	@Override
	String delete(String key) 
	{
		int index=0;
		for(int i=0; i<total_count; i++)
		{
			index = i;
			if(key.equals(keyArray[i]))
				break;
		}
		
		if(index == total_count)//저장된 갯수만큼 돌아서 key를 비교햇지만 못찾았다
			return null;
		
		String value = valueArray[index];
		
		int size = total_count-1;
		for(int i=index; i<size; i++ )
		{
			keyArray[i] = keyArray[i+1];//뒤에 있는거를 앞으로 땡긴다
			valueArray[i] = valueArray[i+1];//뒤에 있는거를 앞으로 땡긴다
		}
		total_count--;
		
		return value;
	}

	@Override
	int length() {
		// TODO Auto-generated method stub
		return total_count;
	}

}
