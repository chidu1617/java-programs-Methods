class MixerGrinder{

	static String brandName;
	static String Color;
	static String material;
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
		System.out.println("MixerGrinder is turned on");
		}
		else if(isConnected == true){
			    isConnected = false;
		System.out.println("MixerGrinder is turned off");
		}
		System.out.println("end of onOrOff()");
			return isConnected;
	}
}