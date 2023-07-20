class Jacket12{
	 
	 String color;
	 float cost;
	 int size;
	 
	
	 
	 public static void main(String[] values){
	  System.out.println("Running main in jacket");
	  Jacket12 jacket1=new Jacket12();
	  System.out.println(jacket1.color);
	  System.out.println(jacket1.cost);
	  System.out.println(jacket1.size);
	  		  System.out.println("jacket before change");

          jacket1.size=28;
		  jacket1.cost=899.99f;
		   jacket1.color="black";

	 
	  System.out.println(jacket1.color);
	  System.out.println(jacket1.cost);
	  System.out.println(jacket1.size);
	  	  System.out.println("jacket after change");
	  
	  }
}