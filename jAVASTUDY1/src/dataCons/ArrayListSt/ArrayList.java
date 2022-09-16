package dataCons.ArrayListSt;

public class ArrayList {

	private int size = 0;	//배열의 사이즈
	private Object[] elementData = new Object[100] ;	//Object타입의 배열을 100개 만든다.
	
	
	public void addLast(Object element) { // elementData 마지막 length에 순차적으로 값 추가
		elementData[size] = element;
		size++;
	}
	
	public void add(int num, Object element) { // 특정 인덱스에 값 추가
		
		for(int i=size; i>num; i--) {
			elementData[size] = elementData[size-1];
		}
		elementData[num] = element;
	}
	
	
	public String showList() {	//리스트 값 출력
		String showValue = "";
		
		for(int i=0; i<=size-1; i++) {
			showValue += elementData[i] + " ";
		}
		return showValue; 
	}
}
