package soon.moon.done.dot;

public class Garage {
	
	public Mechanic mechanic=new Mechanic();
        public void service() {
        	System.out.println("invoking service in garage");
        	if(this.mechanic!=null) {
        		this.mechanic.repair();
        	}
        	else {
        		System.err.println("mechanic is null,cannot invoke method");
        	}
        }
        
        public void wash() {
        	System.out.println("invoking wash in garage");
        	if(this.mechanic!=null) {
        		this.mechanic.payment();
        	}
        	else {
        		System.err.println("mechanic is null,cannot invoke method");
        	}
        }
}
