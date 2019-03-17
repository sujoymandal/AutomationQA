package SampleJava;

public class OverloadingFinalMethod {

	public final void print(){
		System.out.println("final method!!");
	}
	
	public final void print(String s){
		System.out.println("overloaded final method.."+s);
	}
	
	
	public static void main(String[] args) {
		
		OverloadingFinalMethod obj=new OverloadingFinalMethod();
		obj.print();
		obj.print("final");
		
	}

}
