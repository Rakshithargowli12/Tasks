package soon.moon.done.dot.net;

public class PowerBank {
	public Battery battery=new Battery();

	public void charging() {
		System.out.println("invoking charging in powerBank");
		if(this.battery!=null)
		{
             this.battery.capacity();
		}
		else {
			System.err.println("Powerbank is null,cannot invoke method");
		}
}
	
	 public void display() {
		 System.out.println("invoking display in powerBank");
		 if(this.battery!=null)
		 {
		      this.battery.voltage();
		      }
		 else {
					System.err.println("Powerbank is null,cannot invoke method");

               }
	 }
}

