package Zadanie1;

public class Main {
	public static void main(String[] args) {
		MyList mylist = new MyList();
		
		
		mylist.add("a");   
		mylist.add("b");
		mylist.add("c");
		mylist.add("d");
		mylist.add("e");
		mylist.add("f");
		
		mylist.set();
		System.out.println(mylist.get(3));
		System.out.println(mylist.isEmpty());	
		System.out.println(mylist.firstIndexOf());
		mylist.removeLastElement();
		mylist.removeAllElement();

	}

}
