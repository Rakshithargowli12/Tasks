class Wood{
      String woodname;
	  int price;
	  float length;
	  float thickness;
	  boolean odor;
	  
	  Wood(){
		  this("teak",140,15.5f,2.00f,true);
		  System.out.println("invoking no arg from wood");
	  }
	  
	  Wood(String woodname){
		  System.out.println("invoking string in wood");
		  this.woodname=woodname;
	  }
		
	   Wood(String woodname,int price){
		   this(woodname);
		  System.out.println("invoking string,int in wood");
		  this.price=price;
	  }
		
	  Wood(String woodname,int price,float length){
		   this(woodname,price);
		  System.out.println("invoking string,int & float in wood");
		  this.length=length;
	  }
	  
	  Wood(String woodname,int price,float length,float thickness){
		   this(woodname,price,length);
		  System.out.println("invoking string,int & float in wood");
		  this.thickness=thickness;
	  }
		
	   Wood(String woodname,int price,float length,float thickness,boolean odor){
		   this(woodname,price,length,thickness);
		  System.out.println("invoking string,int,float,boolean in wood");
		  this.odor=odor;
	  }
}

		
		