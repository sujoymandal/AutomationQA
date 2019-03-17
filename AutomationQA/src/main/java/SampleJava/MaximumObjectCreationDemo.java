package SampleJava;

class CreateLimitedObject{
	
	private static int maxCount=2;
	private static int objCount=0;
	private CreateLimitedObject(){
		
	}
	
	public static CreateLimitedObject getInstance(){
		
		if(objCount<maxCount){
			objCount++;
			System.out.println("object created for .."+objCount+" times..");
			return new CreateLimitedObject();
		}
		else
			return null;
	}
}

public class MaximumObjectCreationDemo {

	public static void main(String[] args) {
		
		CreateLimitedObject o1=CreateLimitedObject.getInstance();
		CreateLimitedObject o2=CreateLimitedObject.getInstance();
		CreateLimitedObject o3=CreateLimitedObject.getInstance();
		CreateLimitedObject o4=CreateLimitedObject.getInstance();
		
	}

}
