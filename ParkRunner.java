class ParkRunner{

   public static void main(String[] args){
		 System.out.println("invoking main in ParkRunner");  
		  
	   Park park= new Park();
	     System.out.println("\n");
	   Park park1= new Park("water tank park", 4,"PJ Extension,Davangere");
	      System.out.println("\n");
	   Park park2= new Park("water tank park", 4,"PJ Extension,Davangere",4,"children park");
	    System.out.println("\n");
       Park park3= new Park("water tank park", 4,"PJ Extension,Davangere",4,"children park",25,200f); 
	    System.out.println("\n");
	   Park park4= new Park("water tank park", 4,"PJ Extension,Davangere",4,"children park",25,200f,false,true);
	  }
 }