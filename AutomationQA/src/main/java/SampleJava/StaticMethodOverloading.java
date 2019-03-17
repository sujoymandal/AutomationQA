package SampleJava;

public class StaticMethodOverloading {

	public static void main(String[] args) {
		print();
		print("static!!");
		
	}

	public static void print(){
		System.out.println("static method!!");
	}
	
	public static void print(String s){
		System.out.println("static method overloaded!!"+s);
	}
	
}
