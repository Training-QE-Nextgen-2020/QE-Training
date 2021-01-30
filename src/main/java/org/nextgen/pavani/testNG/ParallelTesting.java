package org.nextgen.pavani.testNG;

import org.testng.annotations.Test;

public class ParallelTesting {
	@Test(threadPoolSize =3,invocationCount =3,timeOut =1000)
	public void test1() {
		
		System.out.println("this is test1 method |"+Thread.currentThread().getId());
	}
	@Test
	public void test2() {
		
		System.out.println("this is test2 method|"+Thread.currentThread().getId());
	}
	
	
}
