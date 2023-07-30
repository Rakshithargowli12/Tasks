package soon.moon;

public class Shop {

	Salesman salesman =new Salesman();
	
	public void payment() {
		System.out.println("invoking payment in shop");
		if(this.salesman!=null) {
			this.salesman.sale();
		}
		else {
			System.err.println("salesman is null,cannot invoke method");
		}
	}
	
	public void workers() {
		System.out.println("invoking workers in shop");
		if(this.salesman!=null) {
			this.salesman.marketing();
		}
		else {
			System.err.println("salesman is null,cannot invoke method");
		}
	}
}
