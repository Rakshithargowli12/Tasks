package soon;

public class Hospital {
      public Doctor doctor=new Doctor();
      public Nurse nurse=new Nurse();
      public Patient patient=new Patient();
      
      public void treatment() {
      System.out.println("invoking treatment in hospital");
      
      if(this.doctor!=null) {
    	  this.doctor.checkup();
      }
      else {
    		System.err.println("doctor is null,cannot invoke method");
      }

      if(this.nurse!=null) {
    	  this.nurse.caring();
      }
      else {
    		System.err.println("nurse is null,cannot invoke method");
      }

      if(this.patient !=null) {
    	  this.patient.diease();
      }
      else {
    		System.err.println("patient is null,cannot invoke method");
      }
	}
      
      public void admit() {
          System.out.println("invoking admit in hospital");
          
          if(this.doctor!=null) {
        	  this.doctor.operation();
          }
          else {
        		System.err.println("doctor is null,cannot invoke method");
          }

          if(this.nurse!=null) {
        	  this.nurse.bedmaking();
          }
          else {
        		System.err.println("nurse is null,cannot invoke method");
          }

          if(this.patient!=null) {
        	  this.patient.safety();
          }
          else {
        		System.err.println("patient is null,cannot invoke method");
          }
    	}
}

      
      
