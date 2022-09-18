package dataCons.ArrayListSt;

public class ArrayList {
	
	//배열의 사이즈
	private int size = 0;	
	//Object타입의 배열을 100개 만든다.
	private Object[] elementData = new Object[100] ;
	
	// elementData 마지막 length에 순차적으로 값 추가
	public void addLast(Object element) { 
		elementData[size] = element;
		size++;
	}
	
	// 특정 인덱스에 값 추가
	public void add(int num, Object element) { 
		
		for(int i=size; i>num; i--) {
			elementData[i] = elementData[i-1];
		}
		size++;
		elementData[num] = element;
	}
	
	// 인덱스 첫번째에 값 추가
	public void addFirst(Object element) {
		//add메소드 선언
		add(0, element);
	}
	
	//리스트 값 출력
	@Override
	public String toString() {
		String showValue = "[";
		
		for(int i=0; i<=size-1; i++) {
			showValue += elementData[i] + "" ;
			if(i != size -1) {
				showValue += ",";
			}
		}
		return showValue + "]";
	}

	//특정 인덱스 값 출력
	public Object get(int index) {
		Object element = elementData[index];
		return element;
	}
	
	//배열 크기
	public int size() {
		int sizeNum = size;
		
		return sizeNum;
	}

}
