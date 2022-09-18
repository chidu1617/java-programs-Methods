class CitizenOfIndia{

	public static void showTheResponsibility(){
		
		int age = 16;
		char gender='F';
		if(age>=10 && age<16){
			System.out.println("Responsibility is to go to School");
			return;
		}
		if(age==16 ){
			System.out.println("Responsibility is to go to College");
			return;
		}
		if(age==21){
			System.out.println("Responsibility is to Vote");
			if(gender=='F'){
				System.out.println("Girl can legally marry");
			}
			else{
				System.out.println("Boys cannot legally marry");
			}
		}
		System.out.println("End of Responsibility");
	}
}