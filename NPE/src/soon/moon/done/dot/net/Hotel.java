package soon.moon.done.dot.net;

import soon.moon.done.dot.*;
public class Hotel {
        
	public Cook cook=new Cook();
	
	public void cashier() {
		System.out.println("invoking eat in hotel");
		if(this.cook!=null) {
			this.cook.prepare();
		   }
		else {
			System.err.println("cook is null,cannot invoke method");
		}
	}
	
	public void chef() {
		System.out.println("invoking chef in hotel");
		if(this.cook!=null) {
			this.cook.taste();
		   }
		else {
			System.err.println("cook is null,cannot invoke method");
		}
	}
}
