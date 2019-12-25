package SampleJava;

import org.testng.annotations.Test;

public class ParallelExecutionInTestNGDemo {

	@Test
	public void test1(){
		System.out.println("test1!!"+" thread number.."+Thread.currentThread().getId());
		
	}
	
	@Test
	public void test2(){
		System.out.println("test2!!"+" thread number.."+Thread.currentThread().getId());
	}
	
	@Test
	public void test3(){
		System.out.println("test3!!"+" thread number.."+Thread.currentThread().getId());
	}
	
	@Test
	public void test4(){
		System.out.println("test4!!"+" thread number.."+Thread.currentThread().getId());
	}
	
}
