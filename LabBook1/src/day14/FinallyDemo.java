package day14;

import java.io.FileNotFoundException;

public class FinallyDemo {
	static void funcA() throws FileNotFoundException {
		try {
		System.out.println("Inside funcA()");
		throw new FileNotFoundException();
		}
		
		finally {
			System.out.println("inside finally of funA( )");
			
		}
		}
	static void funcB() {
		try {
		System.out.println("Inside funcB()");
		//throw new FileNotFoundException();
		}
		
		finally {
			System.out.println("inside finally of funB( )");
			}
	}
	static void funcC() {
		try {
		System.out.println("Inside funcC()");
		//throw new FileNotFoundException();
		}
		
		finally {
			System.out.println("inside finally of funC( )");
			}
	}
	public static void main(String[] args) {
		try {
		funcA();
		}
		catch (FileNotFoundException e) {
			System.out.println("Exception caught");
		}
	funcC();
	funcB();
	
		
	}

}
