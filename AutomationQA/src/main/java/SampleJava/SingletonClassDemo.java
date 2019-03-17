package SampleJava;

class SingleTonClass{
	
	public static SingleTonClass single=null;
	
	private SingleTonClass(){
		
	}
	
	public static SingleTonClass getInstance(){
		if(single==null){
			single=new SingleTonClass();
			System.out.println("Object created!!");
			return single;
		}
		else
			return single;
	}
}

public class SingletonClassDemo {

	public static void main(String[] args) {
		
		SingleTonClass s1=SingleTonClass.getInstance();
		SingleTonClass s2=SingleTonClass.getInstance();
		SingleTonClass s3=SingleTonClass.getInstance();
	}

}
