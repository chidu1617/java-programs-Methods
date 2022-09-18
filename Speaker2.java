class Speaker2{
	
	static int minVolume;
	static int maxVolume = 8;
	static int currentVolume;
	
	public static void decreaseVolume(){
		System.out.println("Inside Decrease Volume()");
		
		if(currentVolume < maxVolume){
			currentVolume = currentVolume + 1;
		System.out.println("The current Volume is - " + currentVolume);
		}
	}
}