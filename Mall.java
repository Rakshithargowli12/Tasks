class Mall{
     String name;
	 int noOfFloors;
	 int maindoor;
	 String location;
	 boolean pvr;
	 int noofstore;
	 float rating;
	 
	 Mall(){
		 System.out.println("invoking no arg from mall");
	 }
	 
	 Mall(String name){
		 System.out.println("invoking string in mall");
		 this.name=name;
	 }
	 
	 Mall(String name,int noOfFloors){
		 this(name);
		 System.out.println("invoking string,int from mall");
		 this.noOfFloors=noOfFloors;
	 }
	 
	 Mall(String name,int noOfFloors,int maindoor){
		 this(name,noOfFloors);
		 System.out.println("invoking string,int from mall");
		 this.maindoor=maindoor;
	 }
	 
	 Mall(String name,int noOfFloors,int maindoor,String location){
		 this(name,noOfFloors,maindoor);
		 System.out.println("invoking string,int,string from mall");
		 this.location=location;
	 }
	 
	  Mall(String name,int noOfFloors,int maindoor,String location,boolean pvr){
		 this(name,noOfFloors,maindoor,location);
		 System.out.println("invoking string,int,string,boolean from mall");
		 this.pvr=pvr;
	 }
	 
	 Mall(String name,int noOfFloors,int maindoor,String location,boolean pvr,int noofstore){
		 this(name,noOfFloors,maindoor,location,pvr);
		 System.out.println("invoking string,int,string,boolean from mall");
		 this.noofstore=noofstore;
	 }
	 
	 Mall(String name,int noOfFloors,int maindoor,String location,boolean pvr,int noofstore,float rating){
		 this(name,noOfFloors,maindoor,location,pvr,noofstore);
		 System.out.println("invoking string,int,string,boolean,int,float from mall");
		 this.rating=rating;
	 }
	 
}

	 