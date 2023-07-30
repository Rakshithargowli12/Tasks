package soon.moon.done.dot;

public class GarageRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in GarageRunner");
		
		Garage garage=new Garage();
		garage.service();
		garage.wash();

	}

}
