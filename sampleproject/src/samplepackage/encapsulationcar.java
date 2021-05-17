package samplepackage;

public class encapsulationcar {

	int speed=0;
	String color="black";
	public static void main(String[] args) {
		encapsulationcar car=new encapsulationcar();
		car.color="green";
		System.out.println("car current speed:"+car.speed);
		car.acceleratespeed();
		car.acceleratespeed();
		car.breakcar();
		car.stopcar();
	}
	void acceleratespeed() {
		speed=speed+1;
		System.out.println("accelerated speed:"+speed);
	}
	void breakcar() {
		speed--;
		System.out.println("break speed:"+speed);
	}
	void stopcar() {
		speed=0;
		System.out.println("car speed & speed is"+speed);
	}

}
