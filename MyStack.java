import java.util.*;

class MyStack implements Cloneable {
	//建立一個arraylist的物件
	public ArrayList<Object> list = new ArrayList<Object>();

	//確認陣列是否為空
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	//印出陣列大小
	public int getSize() {
		return list.size();
	}

	
	public Object peek() {
		return list.get(getSize() - 1);
	}
	
	//倒過來印出
	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	//給值的方法
	public void push(Object o) {
		list.add(o);
	}
	public String toString() {	
		return "stack: " + list.toString();
	}
	//拷貝物件
	@SuppressWarnings("unchecked")
	public Object clone(){
		try{
			//Perfore a shallow copy
			MyStack a = (MyStack) super.clone();
			//deep copy on list
			a.list = (ArrayList<Object>)(list.clone());

			return a;

		}catch(CloneNotSupportedException ex){

			return null;
		}
	}
}
