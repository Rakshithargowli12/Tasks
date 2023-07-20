class MallRunner{

      public static void main(String[] args){
		 System.out.println("invoking main in MallRunner");  
		  
	   Mall mall= new Mall("SS Mall",7,3);
	     System.out.println("\n");
	   Mall mall1= new Mall();
	      System.out.println("\n");
	   Mall mall2= new Mall("SS Mall",7,3,"Davangere",true);
	    System.out.println("\n");
       Mall mall3= new Mall("SS Mall",7,3,"Davangere",true,250,4.5f); 
	  }
 }