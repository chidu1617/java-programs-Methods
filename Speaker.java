	class Speaker{

	static String brandName;
	static String speakerColor;
	static double price;
	static boolean isConnected;
	static int minVolume=0;
	static int maxVolume = 8;
	static int currentVolume = 5;
	
	public static boolean onOrOff(){
		
		System.out.println("Brand Name - " + brandName);
		System.out.println("Speaker Color - " + speakerColor);
		System.out.println("Price - " + price);
		
		System.out.println("inside onOrOff()");
		//false == false
		if(isConnected == false){  //declaration(Using relational operator)
		   isConnected = true;     //initialization 
		System.out.println("Speaker is turned on");
		}
		else if(isConnected == true){
			    isConnected = false;
		System.out.println("Speaker is turned off");
		}
		System.out.println("end of onOrOff()");
			return isConnected;
	}
	
	public static void increaseVolume(){
		System.out.println("inside increaseVolume()");
			if(isConnected==true){
		
		if(currentVolume < maxVolume){
			currentVolume = currentVolume + 1;
		System.out.println("The current volume is : " + currentVolume);
		}	
		else{
		System.out.println("Maximum volume reached");
		}
	
		}
		else{
			System.out.println("On the Speaker First");
			}
		}
		
	public static void decreaseVolume(){
		System.out.println("Inside Decrease Volume()");
		if(isConnected==true){
		if(currentVolume > minVolume){
			currentVolume = currentVolume - 1;
		System.out.println("The current Volume is : " + currentVolume);
		}
		else{
			System.out.println("Minmum volume reached");
				}
			}
		else{System.out.println("On the speaker first");
		}
		}
	}
	