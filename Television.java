class Television{

	static String brandName;
	static String Color;
	static double price;
	static boolean isConnected;
	static int minVolume;
	static int maxVolume=10;
	static int currentVolume;
	
	public static boolean onOrOff(){
		
		System.out.println("Brand Name - " + brandName);
		System.out.println("Color - " + Color);
		System.out.println("Price - " + price);
		
		System.out.println("inside onOrOff()");
		//false == false
		if(isConnected == false){  //declaration(Using relational operator)
		   isConnected = true;     //initialization 
		System.out.println("Television is turned on");
		}
		else if(isConnected == true){
			    isConnected = false;
		System.out.println("Television is turned off");
		}
		System.out.println("end of onOrOff()");
			return isConnected;
	}
	public static void increaseVolume(){
		System.out.println("Inside Increase Volume()");
		if(isConnected==true){
		if(currentVolume < maxVolume){
			currentVolume = currentVolume + 1;
		System.out.println("The current Volume is : " + currentVolume);
		}
		else{
			System.out.println("Maximum Volume reached");
			}
		
		public static void decreaseVolume(){
		System.out.println("Inside Decrease Volume()");
		if(isConnected==true){
		if(currentVolume > minVolume){
			currentVolume = currentVolume - 1;
		System.out.println("The current Volume is : " + currentVolume);
		}
		else{
			System.out.println("Minmum Volume reached");
				}
			}
		}