/**
 * Name: Jou Dan-Haur
 * ID: U10316046
 * Ex: 15.10
 */
import java.util.ArrayList;

public class MyStack implements Cloneable{
	//Create an ArrayList store objects
	public ArrayList<Object> list = new ArrayList<Object>();
	
	//Bollean method if stack is empty that return true
	public boolean isEmpty() {
		return list.isEmpty();
	}

	//Method return amount of element in the stack
	public int getSize() {
		return list.size();
	}

	//Method return top object of the stack but not delete
	public Object peek() {
		return list.get(getSize() - 1);
	}

	//Method delete top object in the stack and return it
	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	//Method store object on the top 
	public void push(Object o) {
		list.add(o);
	}

	@Override /** Override the toString in the Object class */
	public String toString() {
		return "stack: " + list.toString();
	}
	
	//Deep copy  ArrayList Object
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
