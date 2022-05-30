package question3;

public class OLA extends Car {

	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		
		if(numberOfPassenger<=3) {
			HatchBack hatchBack = new HatchBack();
			
			hatchBack.numberOfKms= numberOfKMs;
			return hatchBack;
		}
		else {
			
			Sedan sedan = new Sedan();
			sedan.numberOfKms=numberOfKMs;
			return new Sedan();
		}
	}
	
	public int calculateBill(Car car) {
		 
		if(car instanceof Sedan) {
			int total=	car.numberOfKms*((Sedan)car).farePerKm;
		return total;
		}
		else {
			int total = car.numberOfKms*((HatchBack)car).farePerKm;
			return total;
		}
		
	}
}
