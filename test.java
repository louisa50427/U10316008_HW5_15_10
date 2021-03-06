import java.util.*;

public class test{
	//main method
	public static void main(String[] args) throws CloneNotSupportedException{
		
		//建立及拷貝一個物件
		MyStack stack = new MyStack();
			//給值
			stack.push('A');
			stack.push('B');
			stack.push('C');
		MyStack stack1 = (MyStack) (stack.clone());
			stack1.push('D');
			stack1.push('E');
		
		//印出2個物件的size
		System.out.println(stack.getSize());
		System.out.println(stack1.getSize());
		//跑一個迴圈印出陣列裡的值
		do{
			System.out.print(stack.pop());//pop會把第0個值印出再刪掉
		}while(stack.getSize() != 0);
		System.out.print("\n");
		//跑一個迴圈印出拷貝陣列裡的值
		do{
			System.out.print(stack1.pop());
		}while(stack1.getSize() != 0);
	}
}
