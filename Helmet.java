public class Helmet{
	double price;
	char  helmetSize;
	static String helmetBrand;
	static String manufacturingState;
	
	//method uses instance variables
	public void helmetInstanceVariables(){
		System.out.printf("Price: %f \nhelmateSize: %c", price,helmetSize);
	}
	
	//method uses static variables
	static void staticVariableMethod(){
		System.out.printf("Brand: %s \nmanufacturingState: %s",helmetBrand,manufacturingState);
	}
	
	Helmet(double price,char helmetSize){
		this.price = price;
		this.helmetSize = helmetSize;
	}
	
	//static block
	static{
		helmetBrand = "aa";
		manufacturingState = "Karnataka";
	}
}