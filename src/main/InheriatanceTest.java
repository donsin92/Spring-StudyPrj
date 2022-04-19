package main;

class Car<T> {
	private T t = null;
	
	public Car(T t) {
		this.t = t;
	}
	
	public void move() {
		System.out.println("차 이름은 : " + t);
	}
}

class subCar<T> extends Car {

	public subCar(T t) {
		super(t);
		// TODO Auto-generated constructor stub
	}
	
	public void colorCar() {
		System.out.println("RED");
	}
}

public class InheriatanceTest {

	public static void main(String[] args) {
		 
		subCar<String> car = new subCar<String>("기아");
		
		car.move();
		car.colorCar();
	}

}
