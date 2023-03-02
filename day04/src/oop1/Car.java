package oop1;

public class Car {
	public String name;
	public String color;
	public int size;
	private Car car;

	// 생성자.(constructor)
	public Car() {
		this.name = "k1";
		this.color = "red";
		this.size = 1000;
	}

	public Car(String name, String color, int size) {
		this.name = name;
		this.color = color;
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", size=" + size + "]";
	}

	public void setCar(Car car) {
		this.car = car;
	}
	public void go() {
		System.out.printf("%s, %s Go Car...", this.name, this.color);
	}

	public void stop() {
		System.out.printf("%s, %s Go Car...", this.name, this.color);

	}
	public void drive() {
		car.go();
	}
	public void stopCar() {
		car.stop();
	}
}
