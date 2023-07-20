class Park{
      
	  String parkname;
	  float rating;
	  String location;
	  int noofopening;
	  String type;
	  int noofseats;
	  float area;
	  boolean cafeteria;
	  boolean entryfee;
	  
	  Park(){
	   System.out.println("invoking no arg from park");
	   }
	   
	   Park(String parkname){
	   System.out.println("invoking String in  park");
	   this.parkname=parkname;
	   }
	   
	   Park(String parkname,float rating){
	   this(parkname);
	   System.out.println("invoking String,float in  park");
	   this.rating=rating;
	   }
	   
	   Park(String parkname,float rating,String location){
	   this(parkname,rating);
	   System.out.println("invoking String,float,string in  park");
	   this.location=location;
	   }
	   
	   Park(String parkname,float rating,String location,int noofopening){
	   this(parkname,rating,location);
	   System.out.println("invoking String,float,String,int in  park");
	   this.noofopening=noofopening;
	   }
	   
	   Park(String parkname,float rating,String location,int noofopening,String type){
	   this(parkname,rating,location,noofopening);
	   System.out.println("invoking String,float,String,int,String in  park");
	   this.type=type;
	   }
	  
	   Park(String parkname,float rating,String location,int noofopening,String type,int noofseats){
	   this(parkname,rating,location,noofopening,type);
	   System.out.println("invoking String,float,String & int in  park");
	   this.noofseats=noofseats;
	   }
	  
	   Park(String parkname,float rating,String location,int noofopening,String type,int noofseats,float area){
	   this(parkname,rating,location,noofopening,type,noofseats);
	   System.out.println("invoking String,float,String,int,float, in  park");
	   this.area=area;
	   }
	   
	   Park(String parkname,float rating,String location,int noofopening,String type,int noofseats,float area,boolean cafeteria){
	   this(parkname,rating,location,noofopening,type,noofseats,area);
	   System.out.println("invoking String,float,String,int,String,int,float,boolean in  park");
	   this.cafeteria=cafeteria;
	   }
	   
	   Park(String parkname,float rating,String location,int noofopening,String type,int noofseats,float area,boolean cafeteria,boolean entryfee){
	   this(parkname,rating,location,noofopening,type,noofseats,area,cafeteria);
	   System.out.println("invoking String,float,String,int,String,int,float & boolean in  park");
	   this.entryfee=entryfee;
	   }
}	   
	 