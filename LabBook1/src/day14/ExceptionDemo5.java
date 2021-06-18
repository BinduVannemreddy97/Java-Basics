package day14;

import java.util.Scanner;
public class ExceptionDemo5 {
	public static void main(String[] args) {
		Dog tiger=new Dog();
		Child baby=new Child();
		Item item=new Biscuite();	
		baby.playWithDog(tiger, item);
	}
}
class DogExceptions extends Exception{
	
}
class DogBiteException extends DogExceptions{
	String msg;
	public DogBiteException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is...:"+msg;
	}
}
class DogHappyException extends DogExceptions{
	String msg;
	public DogHappyException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is...:"+msg;
	}
}

abstract class Item {
	abstract public void execute() throws DogBiteException,DogHappyException;
}
class Stick extends Item{
	@Override
	public void execute() throws DogBiteException {
		throw new DogBiteException("If yoy beatI will bite");
	}
}
class Biscuite extends Item{
	@Override
	public void execute() throws DogHappyException {
		throw new DogHappyException("I like Biscuites");
	}
}
class Dog{
	public void play(Item item)throws DogBiteException,DogHappyException {
		item.execute();
	}
}
class Child{
	public void playWithDog(Dog tiger,Item item) {
		try{
			tiger.play(item);
		}catch(DogBiteException dbe) {
			System.out.println(dbe);
		}catch(DogHappyException dhe) {
			System.out.println(dhe);
		}
	}
}
