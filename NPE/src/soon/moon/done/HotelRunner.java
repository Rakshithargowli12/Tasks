package soon.moon.done;

import soon.moon.done.dot.net.Hotel;

public class HotelRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in Hotel Runner");
		
		Hotel hotel=new Hotel();
		hotel.cashier();
		hotel.chef();

	}

}
