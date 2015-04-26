/**
 * Name: Jou Dan-Haur
 * ID: U10316046
 * Ex: 4.23
 */
import java.util.ArrayList;

public class MyStack implements Cloneable{
	public ArrayList<Object> list = new ArrayList<Object>();

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int getSize() {
		return list.size();
	}

	public Object peek() {
		return list.get(getSize() - 1);
	}

	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	public void push(Object o) {
		list.add(o);
	}

	@Override /** Override the toString in the Object class */
	public String toString() {
		return "stack: " + list.toString();
	}
	public Object clone(){
		try{
			MyStack MyStackClone = (MyStack)super.clone();
			
			MyStackClone.list = (ArrayList)(list.clone());
			return MyStackClone;
		}
		catch(CloneNotSupportedException ex){
			return null;
		}
	}
}
