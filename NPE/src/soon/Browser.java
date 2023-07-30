package soon;

public class Browser {
	
	public Internet internet =new Internet();
	
	public void browse() {
		System.out.println("invoking browse in browser");
		if(this.internet !=null) {
			this.internet.download();
		}
		else {
			System.err.println("Powerbank is null,cannot invoke method");
		}
	}
	
	public void retrieve() {
		System.out.println("invoking retrieve in browser");
		if(this.internet !=null) {
			this.internet.access();
		}
		else {
			System.err.println("Powerbank is null,cannot invoke method");
		}
	}

}
