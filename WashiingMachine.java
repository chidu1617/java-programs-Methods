class WashingMachine{

	static String brandName;
	static String Color;
	static int price;
	static boolean isConnected;
	
	public static boolean onOrOff(){
		
		System.out.println("Brand Name - " + brandName);
		System.out.println("Color - " + Color);
		System.out.println("Price - " + price);
		
		System.out.println("inside onOrOff()");
		//false == false
		if(isConnected == false){  //declaration(Using relational operator)
		   isConnected = true;     //initialization 
		System.out.println("WashingMachine is turned on");
		}
		else if(isConnected == true){
			    isConnected = false;
		System.out.println("WashingMachine is turned off");
		}
		System.out.println("end of onOrOff()");
			return isConnected;
	}
}