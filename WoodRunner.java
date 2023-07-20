class WoodRunner{
    
	public static void main(String[] args){
	System.out.println("invoking main in WoodRunner");
	
	Wood wood=new Wood();
	System.out.println("wood name: "+wood.woodname);
	System.out.println("price: "+wood.price);
	System.out.println("length: "+wood.length);
	System.out.println("thickness: "+wood.thickness);
	System.out.println("odor: "+wood.odor);
	Wood wood1=new Wood("malpe");
	Wood wood2=new Wood("malpe",250,25f,4f,true);
	System.out.println("wood name: "+wood2.woodname);
	System.out.println("price: "+wood2.price);
	System.out.println("length: "+wood2.length);
	System.out.println("thickness: "+wood2.thickness);
	System.out.println("odor: "+wood2.odor);
	
}
}	