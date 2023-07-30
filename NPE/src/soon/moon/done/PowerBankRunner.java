package soon.moon.done;

import soon.moon.done.dot.net.*;
public class PowerBankRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in Powerbank Runner");
		
		PowerBank powerBank=new PowerBank();
		powerBank.charging();
		powerBank.display();
			}

}
