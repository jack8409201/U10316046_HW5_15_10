/**
 * Name: Jou Dan-Haur
 * ID: U10316046
 * Ex: 15.10
 */
public class Test {
	//main
	public static void main(String[] args) {
		
		//Create two objects that stack2 is cloned from stack1
		MyStack stack1 = new MyStack();
		MyStack stack2 = (MyStack)(stack1.clone());
		
		//Compare stack1 and stack2
		System.out.println(stack1 == stack2);
		System.out.println(stack1.list == stack2.list);
	}
}
