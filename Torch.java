class Torch{

	static String brandName;
	static String Color;
	static int price;
	static boolean isConnected;
	static int minLight=0;
	static int maxLight=5;
	static int currentLight=3;
	
	public static boolean onOrOff(){
		
		System.out.println("Brand Name - " + brandName);
		System.out.println("Color - " + Color);
		System.out.println("Price - " + price);
		
		System.out.println("inside onOrOff()");
		//false == false
		if(isConnected == false){  //declaration(Using relational operator)
		   isConnected = true;     //initialization 
		System.out.println("Torch is turned on");
		}
		else if(isConnected == true){
			    isConnected = false;
		System.out.println("Torch is turned off");
		}
		System.out.println("end of onOrOff()");
			return isConnected;
	}
	public static void increaseLight(){
		System.out.println("Inside Increase Light()");
		if(isConnected==true){
		if(currentLight < maxLight){
			currentLight = currentLight + 1;
		System.out.println("The current Light is : " + currentLight);
		}
		else{
			System.out.println("Maximum light reached");
			}
		}
		public static void decreaseLight(){
		System.out.println("Inside Decrease Light()");
		if(isConnected==true){
		if(currentLight > minLight){
			currentLight = currentLight - 1;
		System.out.println("The current Light is : " + currentLight);
		}
		else{
			System.out.println("Minmum light reached");
				}
			}
		}
	