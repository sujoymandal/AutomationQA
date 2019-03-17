package SampleJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	
	String name;
	public Employee(String name){
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}
}

public class SerializationDemo {

	public static void main(String[] args) throws Exception {

		Employee e1=new Employee("abc");
		FileOutputStream os=new FileOutputStream("D:/Automation_QA_SerializationDemo.txt");
		ObjectOutputStream oos=new ObjectOutputStream(os);
		oos.writeObject(e1);
		System.out.println("done!!");
		FileInputStream is=new FileInputStream("D:/Automation_QA_SerializationDemo.txt");
		ObjectInputStream ois=new ObjectInputStream(is);
		Employee reade1=(Employee) ois.readObject();
		System.out.println(reade1.getName());
		
	}

}
