package collections;

public class LinkedListOwn<T> implements LinkedListInterfaceOwn<T> {

	private LinkedListOwn<T> next;
	
	private T value;

	public LinkedListOwn(){
		
	}
	
	public LinkedListOwn(T value) {
		this.value = value;
		
	}
	
	@Override
	public T getObject() {
		return value;
	}

	@Override
	public void setObject(T value) {
		this.value = value;
		
	}

	
	public LinkedListOwn<T> getNext() {
		return next;
	}

	
	public void setNext(LinkedListOwn<T> next2) {
			
			if(next!=null) {
				next.setNext(next2);
			}else {
			this.next = next2;
			}	
		}
	
	}
