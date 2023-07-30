package soon.moon.done;

import soon.moon.Shop;

public class ShopRunner {

	public static void main(String[] args) {
	System.out.println("invoking main in shop runner");
		
	Shop shop=new Shop();
	shop.payment();
	shop.workers();

	}

}
