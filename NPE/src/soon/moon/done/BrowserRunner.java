package soon.moon.done;

import soon.*;
public class BrowserRunner {

	public static void main(String[] args) {
		System.out.println("invoking main BrowserRunner");
         
		Browser browser=new Browser();
		browser.browse();
		browser.retrieve();
	}

}
