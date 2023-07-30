package soon.moon.done;

import soon.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {
	System.out.println("invoking main in hospital runner");
	
	Hospital hospital =new Hospital();
	hospital.treatment();
	hospital.admit();
	}

}
