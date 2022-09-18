class Refrigirator{

	static String brandName;
	static String Color;
	static int price;
	static boolean isConnected;
	static int minFreeze;
	static int maxFreeze=10;
	static int currentFreeze;
	
	public static boolean onOrOff(){
		
		System.out.println("Brand Name - " + brandName);
		System.out.println("Color - " + Color);
		System.out.println("Price - " + price);
		
		System.out.println("inside onOrOff()");
		//false == false
		if(isConnected == false){  //declaration(Using relational operator)
		   isConnected = true;     //initialization 
		System.out.println("Refrigirator is turned on");
		}
		else if(isConnected == true){
			    isConnected = false;
		System.out.println("Refrigirator is turned off");
		}
		System.out.println("end of onOrOff()");
			return isConnected;
	}
	public static void increaseFreeze(){
		System.out.println("inside increaseFreeze()");
			if(isConnected==true){
		
		if(currentFreeze < maxFreeze){
			currentFreeze = currentFreeze + 1;
		System.out.println("The current Freeze is : " + currentFreeze);
		}	
		else{
		System.out.println("Maximum Freeze reached");
		}
	
		}
		else{
			System.out.println("On the Refrigirator First");
			}
		}
		
	public static void decreaseFreeze(){
		System.out.println("Inside Decrease Freeze()");
		if(isConnected==true){
		if(currentFreeze > minFreeze){
			currentFreeze = currentFreeze - 1;
		System.out.println("The current Freeze is : " + currentFreeze);
		}
		else{
			System.out.println("Minmum Freeze reached");
				}
			}
		else{System.out.println("On the Refrigirator first");
		}
		}}
